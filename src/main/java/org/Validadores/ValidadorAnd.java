package org.Validadores;

import org.Disciplinas.DisciplinaCursada;
import org.Exceptions.MatriculaException;
import org.Exceptions.PreRequisitoNaoCumpridoException;
import org.example.Aluno;
import org.Disciplinas.Disciplina;

public class ValidadorAnd implements ValidadorPreRequisito{
    @Override
    public boolean validar(Aluno aluno, Disciplina disciplina) throws MatriculaException {
        ValidadorPreRequisito validador = new ValidadorSimples();

        if(disciplina.getPreRequisitos().isEmpty()){//Verifica se a disciplina tem algum pré-requisito
            return true;
        }

        for(Disciplina preRequisito : disciplina.getPreRequisitos()){
            for(DisciplinaCursada disciplinaCursada : aluno.getDisciplinasCursadas()){
                if(!(disciplinaCursada.getDisciplina().getCodigo().equals(preRequisito.getCodigo()) && disciplinaCursada.getNota() >= 60)){//Verifica se o aluno tem o pré-requisito
                    throw new PreRequisitoNaoCumpridoException("O aluno " + aluno.getNome() + " nao possui o pre-requisito " + preRequisito.getNome() + " para a disciplina " + disciplina.getNome() + "!");
                }
            }
        }
        System.out.println("A disciplina " + disciplina.getNome() + " aprovada com sucesso!");
        return true;
    }
}
