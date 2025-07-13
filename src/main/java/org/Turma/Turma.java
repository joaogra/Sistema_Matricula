package org.Turma;

import org.Disciplinas.Disciplina;
import org.Exceptions.GerenciamentoVagasException;
import org.Exceptions.TurmaCheiaException;

public class Turma {
    private String id;
    private int numVagas;
    private int numAtualAlunos;
    private Disciplina disciplina;
    private Horario horario;

    public Turma(String id, int numVagas, int numAtualAlunos, Disciplina disciplina1, Horario horario){
        this.id = id;
        this.numVagas = numVagas;
        this.numAtualAlunos = numAtualAlunos;
        this.disciplina = disciplina1;
        this.horario=horario;
    }

    public String getId() { return id;}

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public Horario getHorario() {
        return horario;
    }

    public void verificaVagasDisponiveis()throws GerenciamentoVagasException {
        if(numAtualAlunos == numVagas){
            throw new TurmaCheiaException("não há vagas para essa turma!");
        }
    }

    public void setNumAtualAlunos(){
        numAtualAlunos++;
    }
}
