package org.Validadores;

import org.Disciplinas.Disciplina;
import org.Disciplinas.DisciplinaCursada;
import org.example.Aluno;

public class ValidadorSimples implements ValidadorPreRequisito {
    @Override
    public boolean validar(Aluno aluno, Disciplina preRequisito) {
        for(DisciplinaCursada disciplinaCursada : aluno.getDisciplinasCursadas()){
            if(disciplinaCursada.getDisciplina().getCodigo().equals(preRequisito.getCodigo()) && disciplinaCursada.getNota() >= 60){//Verifica se o aluno tem o pré-requisito
                return true;
            }
        }
        return false;
    }

}
