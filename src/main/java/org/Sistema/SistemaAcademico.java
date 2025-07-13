package org.Sistema;

import org.Dados.Aluno;
import org.Disciplinas.Disciplina;
import org.Disciplinas.DisciplinaCursada;
import org.Exceptions.*;
import org.Turma.DiaSemana;
import org.Turma.Turma;
import org.Validadores.ValidadorCorrequisitos;

import javax.xml.transform.Result;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SistemaAcademico {
    public SistemaAcademico(){
    }
    private void verificaHorario(List <Turma> turmasCadastradas,Turma turmaEscolhida)throws ConflitoDeHorarioException{
        for(Turma turmaCadastrada : turmasCadastradas){

            //passa pelos dias das turmas verificando se os dias sao iguais
            for(DiaSemana diaTurma : turmaCadastrada.getHorario().getHorarioSem()){
                for(DiaSemana diaTurmacadastrada: turmaEscolhida.getHorario().getHorarioSem()){

                    //verifica se a disciplina tem algum conflito de horario
                    if(diaTurma == diaTurmacadastrada &&
                            turmaEscolhida.getHorario().getInicioAula() == turmaCadastrada.getHorario().getInicioAula()){

                        throw new ConflitoDeHorarioException("conflito de horario entre " + turmaCadastrada.getDisciplina().getNome()
                                + " e " + turmaEscolhida.getDisciplina().getNome(),turmaCadastrada);
                    }
                }
            }
        }
    }
    private void verificaCorequisitoRejeitado(Map<Turma, Exception> turmasRejeitadas, Disciplina coRequisito)
            throws CoRequisitoNaoAtendidoException {

        if (coRequisito.getCodigo().equals(" ")) return;

        for (Turma turma : turmasRejeitadas.keySet()) {
            if (turma.getDisciplina().getCodigo().equals(coRequisito.getCodigo())) {
                throw new CoRequisitoNaoAtendidoException("o aluno nao possui o corequisito!" + coRequisito.getNome());
            }
        }
    }
    public ResultadoMatricula matricula(List<Aluno> alunos) {
        ResultadoMatricula resultado = new ResultadoMatricula();
        List <Turma> turmasCadastradas;
        Map<Turma, Exception> turmasRejeitadas;
        for(Aluno aluno : alunos){
            turmasCadastradas = new ArrayList<>();
            turmasRejeitadas = new HashMap<>();
            for(Turma turma : aluno.getPlanejamento()){
                        Disciplina disciplina = turma.getDisciplina();
                    try {

                        //valida se e possivel matricular
                        disciplina.validarTodos(aluno, disciplina);
                        verificaCorequisitoRejeitado(turmasRejeitadas, disciplina.getCoRequisito());
                        verificaHorario(turmasCadastradas, turma);
                        turma.verificaVagasDisponiveis();
                        aluno.verificaCargaMaxima(disciplina.getCargaHoraria());

                        //se passou por todos entao realiza a matricula da disciplina
                        turmasCadastradas.add(turma);
                        turma.setNumAtualAlunos();
                        aluno.setCreditoAtual(disciplina.getCargaHoraria());

                    }

                    catch(ConflitoDeHorarioException che){
                        //verifica a prioridade das disciplinas
                        //se é igual descarta as duas disciplinas
                        if(turma.getDisciplina().getTipoDisciplina().getPrioridade()
                                == che.getTurma().getDisciplina().getTipoDisciplina().getPrioridade()) {

                            turmasCadastradas.remove(che.getTurma());
                            turmasRejeitadas.put(turma, che);
                            turmasRejeitadas.put(che.getTurma(), che);
                        }

                        //se a disciplina que esta sendo validada tem prioridade
                        //maior, então matricula ela e descarta a outra que estava matriculada
                        if(turma.getDisciplina().getTipoDisciplina().getPrioridade()
                                > che.getTurma().getDisciplina().getTipoDisciplina().getPrioridade()) {

                            turmasCadastradas.add(turma);
                            turmasCadastradas.remove(che.getTurma());
                            turmasRejeitadas.put(che.getTurma(), che);
                        }
                        //se a disciplina que já está matriculada tem prioridade maior
                        //então descarta a disciplina que está sendo validada
                        else{
                            turmasRejeitadas.put(turma, che);
                        }
                    }

                    catch (TurmaCheiaException tc){
                        if(!disciplina.getCoRequisito().getCodigo().equals(" ")){
                            for(Turma turmaAceitada : new ArrayList<>(turmasCadastradas)){
                                if(turmaAceitada.getDisciplina().getCodigo().equals(disciplina.getCoRequisito().getCodigo())){
                                    turmasCadastradas.remove(turmaAceitada);
                                    turmasRejeitadas.put(turmaAceitada, new CoRequisitoNaoAtendidoException("o aluno nao possui o corequisito!"));
                                    break;
                                }
                            }
                        }
                        turmasRejeitadas.put(turma, tc);
                    }
                    catch(MatriculaException e){
                        turmasRejeitadas.put(turma, e);
                    }
            }

            try {
                System.out.println("Relatorio: \nAluno: " + aluno.getNome());
                aluno.verificaCargaMinima();

                //passa as turmas matriculadas para as disciplinas cursadas do aluno com nota 0
                for(Turma turma : turmasCadastradas) {
                    aluno.getDisciplinasCursadas().add(new DisciplinaCursada(turma.getDisciplina(), 0));
                    System.out.println("A matricula na turma " + turma.getDisciplina().getNome() + "-" + turma.getId() + " foi realizada com sucesso!");
                }

                //Mostra as matriculas rejeitadas e seus respectivos motivos
                for(Turma turma : turmasRejeitadas.keySet()) {
                    String motivo = turmasRejeitadas.get(turma).getMessage();
                    System.out.println("A matricula na turma " + turma.getDisciplina().getNome() + "-" + turma.getId() + " foi rejeitada devido a " + motivo);
                }
            }
            //se o aluno nao tem a quantidade minima de creditos nao matricula em nenhuma das disciplinas
             catch(CargaHorariaExcedidaException m){
                aluno.setCreditoAtual(-aluno.getCreditoAtual());
                System.out.println(m.getMessage());
                 resultado.setTurmasAceitas(List.of());
                 for(Turma turma : aluno.getPlanejamento()) {
                     resultado.getTurmasRejeitadas().put(turma, new CargaHorariaExcedidaException("Carga horaria minima não cumprida!"));
                 }
                 return resultado;
            }
            resultado.setTurmasAceitas(turmasCadastradas);
            resultado.setTurmasRejeitadas(turmasRejeitadas);

            turmasCadastradas.clear();
            turmasRejeitadas.clear();


        }
    return resultado;
    }

}
