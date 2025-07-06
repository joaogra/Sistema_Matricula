package org.Validadores;

import org.example.Aluno;
import org.Disciplinas.Disciplina;
import org.Disciplinas.DisciplinaCursada;

public class ValidadorAnd implements ValidadorPreRequisito{
    @Override
    public boolean validar(Aluno aluno, Disciplina disciplina){
        ValidadorPreRequisito validador = new ValidadorSimples();

        if(disciplina.getPreRequisitos().isEmpty()){//Verifica se a disciplina tem algum pré-requisito
            return true;
        }

        for(Disciplina preRequisito : disciplina.getPreRequisitos()){
            if(!validador.validar(aluno,disciplina)){//fazer throw exception quando a classe exception estiver pronta
                System.out.println("A disciplina " + disciplina.getNome() + " não foi aprovada por falta de pré-requisitos!");
                return false;
            }
        }
        System.out.println("A disciplina " + disciplina.getNome() + " aprovada com sucesso!");
        return true;
    }
}
