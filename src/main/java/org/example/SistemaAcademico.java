package org.example;

import org.Disciplinas.Disciplina;

public class SistemaAcademico {
    public SistemaAcademico(){

    }

    public void matricula(Aluno aluno){
        for(Disciplina atual : aluno.getPlanejamento().keySet() )
            auxMatricula(aluno, atual);
    }

    protected void auxMatricula(Aluno a, Disciplina atual){
        try {

        }
        catch{

        }
    }
}
