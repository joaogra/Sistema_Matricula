package org.Validadores;

import org.Disciplinas.DisciplinaCursada;
import org.Exceptions.MatriculaException;
import org.Exceptions.PreRequisitoNaoCumpridoException;
import org.Dados.Aluno;
import org.Disciplinas.Disciplina;

public class ValidadorAnd implements ValidadorPreRequisito{
    @Override
    public void validar(Aluno aluno, Disciplina disciplina) throws MatriculaException {

        for (Disciplina preRequisito : disciplina.getPreRequisitos()) {
            boolean aprovado = false;
            for (DisciplinaCursada disciplinaCursada : aluno.getDisciplinasCursadas()) {
                if (disciplinaCursada.getDisciplina().getCodigo().equals(preRequisito.getCodigo()) && disciplinaCursada.getNota() >= 60) {
                    aprovado = true;
                    break; // achou, não precisa procurar mais
                }
            }
            if (!aprovado) {
                throw new PreRequisitoNaoCumpridoException("O aluno " + aluno.getNome() + " nao possui o pre-requisito " + preRequisito.getNome() + " para a disciplina " + disciplina.getNome() + "!");
            }
        }
    }
}
