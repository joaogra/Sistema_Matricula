package org.example;

import org.Disciplinas.Disciplina;

public class SistemaAcademico {
    public SistemaAcademico(){

    }

    public void matricula(Aluno aluno){
        for(Disciplina atual : aluno.getPlanejamento() )
            auxMatricula(aluno, atual);
    }

    protected void auxMatricula(Aluno a, Disciplina atual){
        try {

        }
        catch(Exception e){

        }
    }
}
