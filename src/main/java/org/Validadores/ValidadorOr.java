package org.Validadores;

import org.Disciplinas.Disciplina;
import org.Disciplinas.DisciplinaCursada;
import org.Exceptions.MatriculaException;
import org.Exceptions.PreRequisitoNaoCumpridoException;
import org.Dados.Aluno;
import org.Exceptions.ValidacaoMatriculaException;

public class ValidadorOr implements ValidadorPreRequisito {
    @Override
    public void validar(Aluno aluno, Disciplina disciplina) throws PreRequisitoNaoCumpridoException {

        for(Disciplina preRequisito : disciplina.getPreRequisitos()){
            for(DisciplinaCursada disciplinaCursada : aluno.getDisciplinasCursadas()){
                if(disciplinaCursada.getDisciplina().getCodigo().equals(preRequisito.getCodigo()) && disciplinaCursada.getNota() >= 60){//Verifica se o aluno tem o pré-requisito
                    return;
                }
            }
        }
        throw new PreRequisitoNaoCumpridoException("o aluno nao nenhum dos pre-requisitos para a disciplina!");
    }

}
