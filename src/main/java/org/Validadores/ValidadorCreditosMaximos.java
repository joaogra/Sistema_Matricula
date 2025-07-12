package org.Validadores;

import org.Disciplinas.Disciplina;
import org.Exceptions.MatriculaException;
import org.Dados.Aluno;

public class ValidadorCreditosMaximos implements ValidadorPreRequisito{
    @Override
    public void validar(Aluno aluno, Disciplina disciplina)throws MatriculaException {
        if(aluno.getCreditoAtual() > 10){//10 é o valor de creditos maximo pode trocar esse valor depois
            throw new MatriculaException("O aluno " + aluno.getNome() + " não possui a quantidade maxima de créditos necessária!");
        }
    }
}
