package org.Validadores;

import org.Disciplinas.Disciplina;
import org.Exceptions.CoRequisitoNaoAtendidoException;
import org.Turma.Turma;
import org.Dados.Aluno;

public class ValidadorCorrequisitos implements ValidadorPreRequisito{
    @Override
    public void validar(Aluno aluno, Disciplina disciplina) throws CoRequisitoNaoAtendidoException {
        for(Turma disciplinaDesejadas : aluno.getPlanejamento()){
            if(disciplinaDesejadas.getDisciplina().getCodigo().equals(disciplina.getCoRequisito().getCodigo())){
                return;
            }
        }
        throw new CoRequisitoNaoAtendidoException("O aluno nao possui o corequisito " + disciplina.getCoRequisito().getNome() + " para a disciplina " + disciplina.getNome());
    }
}
