package Validadores;

import org.example.Aluno;
import org.example.Disciplina;

public interface ValidadorPreRequisito {
    boolean validar(Aluno aluno, Disciplina disciplina);
}
