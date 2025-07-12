package org.example;

import org.Disciplinas.CriaDisciplina;
import org.Disciplinas.Disciplina;
import org.Disciplinas.DisciplinaCursada;
import org.Exceptions.*;
import org.Turma.DiaSemana;
import org.Turma.Turma;

import java.util.ArrayList;
import java.util.List;

public class SistemaAcademico {
    public SistemaAcademico(){
    }
    private void verificaHorario(List <Turma> turmas,Turma turmaEscolhida)throws MatriculaException{
        for(Turma turma : turmas){

            for(DiaSemana diaTurma : turma.getHorario().getHorarioSem()){
                for(DiaSemana diaTurmacadastrada: turmaEscolhida.getHorario().getHorarioSem()){

                    if(diaTurma == diaTurmacadastrada && turmaEscolhida.getHorario().getInicioAula() == turma.getHorario().getInicioAula()){
                            throw new ConflitoDeHorarioException("Houve conflito de horario entre " + turma.getDisciplina().getNome() + " e " + turmaEscolhida.getDisciplina().getNome(),turma);
                    }
                }
            }
        }
    }

    public void matricula(List<Aluno> alunos) throws MatriculaException {
        List <Turma> turmasCadastradas = new ArrayList<>();
        for(Aluno aluno : alunos){
            for(Turma turma : aluno.getPlanejamento()){
                    try {
                        Disciplina disciplina = turma.getDisciplina();
                        disciplina.validarTodos(aluno, disciplina);
                        verificaHorario(turmasCadastradas, turma);
                        turma.verificaVagas();
                        aluno.verificaCargaMaxima();
                        turmasCadastradas.add(turma);

                    }
                    catch(PreRequisitoNaoCumpridoException | CoRequisitoNaoAtendidoException | TurmaCheiaException | CargaHorariaExcedidaException e){
                        System.out.println(e.getMessage());
                    }

                    catch(ConflitoDeHorarioException che){
                        System.out.println(che.getMessage());
                        turmasCadastradas.remove(che.getTurma());
                    }
            }
            for(Turma turma : turmasCadastradas) {//turmasCadastrdas para aluno.DisciplinasCursadas
                aluno.getDisciplinasCursadas().add(new DisciplinaCursada(turma.getDisciplina(), 0));//inicializa a nota do aluno com 0
            }
            turmasCadastradas.clear();
            aluno.getPlanejamento().clear();//remove todas as disciplinas do planejamento do aluno
        }
    }
}
