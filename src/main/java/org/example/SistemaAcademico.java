package org.example;

import org.Disciplinas.CriaDisciplina;
import org.Disciplinas.Disciplina;
import org.Exceptions.*;
import org.Turma.DiaSemana;
import org.Turma.Horario;
import org.Turma.Turma;

import java.util.ArrayList;
import java.util.List;

public class SistemaAcademico {
    private CriaDisciplina bancoDados;
    public SistemaAcademico(){
        this.bancoDados = new CriaDisciplina();
    }
    private boolean verificaHorario(List <Turma> turmas,Turma turmaEscolhida)throws MatriculaException{
        for(Turma turma : turmas){

            for(DiaSemana diaTurma : turma.getHorario().getHorarioSem()){
                for(DiaSemana diaTurmacadastrada: turmaEscolhida.getHorario().getHorarioSem()){

                    if(diaTurma == diaTurmacadastrada && turmaEscolhida.getHorario().getInicioAula() == turma.getHorario().getInicioAula()){
                            return false;
                    }
                }
            }
        }
        return true;
    }

    public void matricula(List<Aluno> alunos) throws MatriculaException {
        List <Turma> turmasCadastradas = new ArrayList<>();
        for(Aluno aluno : alunos){
            boolean verificador = false;
            for(Turma turma : aluno.getPlanejamento()){
                for(Disciplina disciplina : turma.getDisciplina().getPreRequisitos()){
                    try {
                        if (disciplina.validarTodos(aluno, disciplina) && (turma.verificaVagas()) && verificaHorario(turmasCadastradas, turma)) {
                            turmasCadastradas.add(turma);
                            //aluno.getPlanejamento().remove(turma);remover as disciplinas no final
                        }
                    }
                    catch(PreRequisitoNaoCumpridoException pNce){

                    }
                    catch(CargaHorariaExcedidaException che){

                    }
                    catch(TurmaCheiaException tce){

                    }
                    catch(CoRequisitoNaoAtendidoException cnae){

                    }
                    catch(ConflitoDeHorarioException che){

                    }
                }
            }
        }
    }
}
