package org.Validadores;

import org.Disciplinas.Disciplina;
import org.Exceptions.CoRequisitoNaoAtendidoException;
import org.Turma.Turma;
import org.Dados.Aluno;

public class ValidadorCorrequisitos implements ValidadorPreRequisito{
    @Override
    public void validar(Aluno aluno, Disciplina disciplina) throws CoRequisitoNaoAtendidoException {
        if(disciplina.getCoRequisito().getCodigo().equals(" ")){
            return;
        }
        for(Turma disciplinaDesejadas : aluno.getPlanejamento()){
            if(disciplinaDesejadas.getDisciplina().getCodigo().equals(disciplina.getCoRequisito().getCodigo())){
                return;
            }
        }
        throw new CoRequisitoNaoAtendidoException("o aluno nao possui o corequisito!" + disciplina.getCoRequisito().getNome());
    }
}
