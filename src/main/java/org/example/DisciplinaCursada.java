package org.example;

public class DisciplinaCursada {
    protected Disciplina disciplina;
    protected int nota;
    public DisciplinaCursada(Disciplina disciplina, int nota) {
        this.disciplina = disciplina;
        this.nota = nota;
    }
    public Disciplina getDisciplina() {return disciplina;}
    public int getNota() {return nota;}
}
