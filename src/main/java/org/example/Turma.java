package org.example;

public class Turma {
    private String id;
    private int numVagas;
    private int numAtualAlunos;
    private Disciplina disciplina;
    private int horario;

    public Turma(String id, int numVagas, int numAtualAlunos, Disciplina disciplina1, int horario){
        this.id = id;
        this.numVagas = numVagas;
        this.numAtualAlunos = numAtualAlunos;
        this.disciplina = disciplina1;
        this.horario=horario;
    }

}
