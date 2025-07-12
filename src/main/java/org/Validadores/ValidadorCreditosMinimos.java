package org.Validadores;

import org.Disciplinas.Disciplina;
import org.Exceptions.MatriculaException;
import org.Dados.Aluno;

public class ValidadorCreditosMinimos implements ValidadorPreRequisito{
    @Override
    public void validar(Aluno aluno, Disciplina disciplina)throws MatriculaException {
        if(aluno.getCreditoAtual() < 2){//10 é o valor de creditos minimos pode trocar esse valor depois
            throw new MatriculaException("o aluno não possui a quantidade mínima de créditos necessária!");
        }
    }
}
