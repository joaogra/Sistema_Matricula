package org.Validadores;

import org.Disciplinas.Disciplina;
import org.example.Aluno;

public class ValidadorOr implements ValidadorPreRequisito {
    @Override
    public boolean validar(Aluno aluno, Disciplina disciplina){
        ValidadorPreRequisito validador = new ValidadorSimples();

        if(disciplina.getPreRequisitos().isEmpty()){//Verifica se a disciplina tem algum pré-requisito
            return true;
        }

        for(Disciplina preRequisito : disciplina.getPreRequisitos()){
            if(validador.validar(aluno, preRequisito)){
                return true;
            }
        }
        return false;//throws exception
    }

}
