package org.Validadores;

import org.Disciplinas.Disciplina;
import org.Disciplinas.DisciplinaCursada;
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
            for(DisciplinaCursada disciplinaCursada : aluno.getDisciplinasCursadas()){
                if(disciplinaCursada.getDisciplina().getCodigo().equals(preRequisito.getCodigo()) && disciplinaCursada.getNota() >= 60){//Verifica se o aluno tem o pré-requisito
                    return true;
                }
            }
        }
        throw new PreRequisitoNaoCumpridoException("O aluno " + aluno.getNome() + " nao nenhum dos pre-requisitos para a disciplina " + disciplina.getNome() + "!");
    }

}
