package org.Validadores;

import org.Disciplinas.Disciplina;
import org.Exceptions.MatriculaException;
import org.example.Aluno;

public class ValidadorCreditosMinimos implements ValidadorPreRequisito{
    @Override
    public void validar(Aluno aluno, Disciplina disciplina)throws MatriculaException {
        if(aluno.getCreditoAtual() < 10){//10 é o valor de creditos minimos pode trocar esse valor depois
            throw new MatriculaException("O aluno " + aluno.getNome() + " não possui a quantidade mínima de créditos necessária!");
        }
    }
}
