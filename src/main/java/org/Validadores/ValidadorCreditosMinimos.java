package org.Validadores;

import org.Disciplinas.Disciplina;
import org.example.Aluno;

public class ValidadorCreditosMinimos implements ValidadorPreRequisito{
    @Override
    public boolean validar(Aluno aluno, Disciplina disciplina) {
        return aluno.getCreditoAtual() >= 10;//10 é o valor de creditos minimos pode trocar esse valor depois
    }
}
