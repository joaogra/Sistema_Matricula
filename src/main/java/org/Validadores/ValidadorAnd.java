package org.Validadores;

import org.example.Aluno;
import org.Disciplinas.Disciplina;
import org.Disciplinas.DisciplinaCursada;

public class ValidadorAnd implements ValidadorPreRequisito{
    @Override
    public boolean validar(Aluno aluno, Disciplina disciplina){
        for(Disciplina preRequisito : disciplina.getPreRequisitos()){
        boolean valida = false;
            for(DisciplinaCursada dc : aluno.getDisciplinasCursadas()){
                if(dc.getDisciplina().equals(preRequisito) && dc.getNota() >= 60){
                    valida = true;
                    break;
                }
            }
            if(!valida){//fazer throw exception quando a classe exception estiver pronta
                System.out.println("A disciplina " + disciplina.getNome() + " não foi aprovada por falta de pré-requisitos!");
                return false;
            }
        }
        System.out.println("A disciplina " + disciplina.getNome() + " aprovada com sucesso!");
        return true;
    }
}
