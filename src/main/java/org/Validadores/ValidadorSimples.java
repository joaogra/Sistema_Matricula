package org.Validadores;

import org.Disciplinas.Disciplina;
import org.Disciplinas.DisciplinaCursada;
import org.Exceptions.PreRequisitoNaoCumpridoException;
import org.example.Aluno;

public class ValidadorSimples implements ValidadorPreRequisito {
    @Override
    public void validar(Aluno aluno, Disciplina disciplina) throws PreRequisitoNaoCumpridoException {
        for(DisciplinaCursada dC : aluno.getDisciplinasCursadas()){
            if(dC.getDisciplina().getCodigo().equals(disciplina.getPreRequisitos().getFirst().getCodigo()) && dC.getNota() >= 60){//Verifica se o aluno tem o pré-requisito
                return;
            }
        }
        throw new PreRequisitoNaoCumpridoException("O aluno " + aluno.getNome() + " nao possui o pre-requisito " + disciplina.getPreRequisitos().getFirst().getNome());
    }

}
