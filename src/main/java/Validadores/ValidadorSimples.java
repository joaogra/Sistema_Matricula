package Validadores;

import org.example.Aluno;
import org.example.Disciplina;
import org.example.DisciplinaCursada;

public class ValidadorSimples implements ValidadorPreRequisito{
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
            if(!valida){
                System.out.println("A disciplina " + disciplina.getNome() + " não foi aprovada por falta de pré-requisitos!");
                return false;
            }
        }
        System.out.println("A disciplina " + disciplina.getNome() + " aprovada com sucesso!");
        return true;
    }
}
