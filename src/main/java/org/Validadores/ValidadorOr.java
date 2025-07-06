package org.Validadores;

import org.Disciplinas.Disciplina;
import org.Exceptions.MatriculaException;
import org.Exceptions.PreRequisitoNaoCumpridoException;
import org.example.Aluno;

public class ValidadorOr implements ValidadorPreRequisito {
    @Override
    public boolean validar(Aluno aluno, Disciplina disciplina) throws MatriculaException {
        ValidadorPreRequisito validador = new ValidadorSimples();

        if(disciplina.getPreRequisitos().isEmpty()){//Verifica se a disciplina tem algum pré-requisito
            return true;
        }

        for(Disciplina preRequisito : disciplina.getPreRequisitos()){
            if(validador.validar(aluno, preRequisito)){
                return true;
            }
        }
        throw new PreRequisitoNaoCumpridoException("A disciplina " + disciplina.getNome() + " não foi aprovada por falta de pré-requisitos!");
    }

}
