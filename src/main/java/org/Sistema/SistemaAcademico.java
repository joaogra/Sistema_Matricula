package org.Sistema;

import org.Dados.Aluno;
import org.Disciplinas.Disciplina;
import org.Disciplinas.DisciplinaCursada;
import org.Exceptions.*;
import org.Turma.DiaSemana;
import org.Turma.Turma;

import javax.xml.transform.Result;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SistemaAcademico {
    public SistemaAcademico(){
    }
    private void verificaHorario(List <Turma> turmas,Turma turmaEscolhida)throws ConflitoDeHorarioException{
        for(Turma turma : turmas){

            for(DiaSemana diaTurma : turma.getHorario().getHorarioSem()){
                for(DiaSemana diaTurmacadastrada: turmaEscolhida.getHorario().getHorarioSem()){
                    //verifica se a disciplina tem algum conflito de horario
                    if(diaTurma == diaTurmacadastrada && turmaEscolhida.getHorario().getInicioAula() == turma.getHorario().getInicioAula()){
                            throw new ConflitoDeHorarioException("conflito de horario entre " + turma.getDisciplina().getNome() + " e " + turmaEscolhida.getDisciplina().getNome(),turma);
                    }
                }
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
                        if(turma.getDisciplina().getTipoDisciplina().getPrioridade() == che.getTurma().getDisciplina().getTipoDisciplina().getPrioridade()) {
                            turmasCadastradas.remove(che.getTurma());
                            turmasRejeitadas.put(turma, che);
                            turmasRejeitadas.put(che.getTurma(), che);
                        }

                        //se a disciplina que esta sendo validada tem prioridade
                        //maior então matricula ela e descarta a outra que estava matriculada
                        if(turma.getDisciplina().getTipoDisciplina().getPrioridade() > che.getTurma().getDisciplina().getTipoDisciplina().getPrioridade()) {
                            turmasCadastradas.add(turma);
                            turmasCadastradas.remove(che.getTurma());
                            turmasRejeitadas.put(che.getTurma(), che);
                        }
                        //se a disciplina que já está matriculada tem prioridade maior
                        //então descarta a disciplina que está sendo validada
                    }

                    //senao for possivel realizar a matricula solta uma mensagem explicando o motivo de ter falhado
                    catch(MatriculaException e){
                        turmasRejeitadas.put(turma, e);
                    }
            }
            try {
                System.out.println("Relatorio: \n Aluno: " + aluno.getNome());
                aluno.verificaCargaMinima();

                for(Turma turma : turmasCadastradas) {//passa as turmas matriculadas para as disciplinas cursadas do aluno com nota 0
                    aluno.getDisciplinasCursadas().add(new DisciplinaCursada(turma.getDisciplina(), 0));
                    System.out.println("A matricula na turma " + turma.getDisciplina().getNome() + " " + turma.getId() + " foi realizada com sucesso!");
                }
                for(Turma turma : turmasRejeitadas.keySet()) {//passa as turmas matriculadas para as disciplinas cursadas do aluno com nota 0
                    String motivo = turmasRejeitadas.get(turma).getMessage();
                    System.out.println("A matricula na turma " + turma.getDisciplina().getNome() + " " + turma.getId() + " foi rejeitada devido a " + motivo);
                }
            }
            //se o aluno nao tem a quantidade minima de creditos nao matricula em nenhuma das disciplinas
             catch(CargaHorariaExcedidaException m){
                System.out.println(m.getMessage());
            }
            finally {
                //limpa a lista de turmas e modifica resultado
                List <Turma> auxTurmaCadastro;
                auxTurmaCadastro = turmasCadastradas;
                resultado.setTurmasAceitas(auxTurmaCadastro);
                resultado.setTurmasRejeitadas(turmasRejeitadas);
                turmasCadastradas.clear();
                //turmasRejeitadas.clear();

            }
        }
    return resultado;
    }
}
