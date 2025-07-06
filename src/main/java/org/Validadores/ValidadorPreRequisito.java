package org.Validadores;

import org.Exceptions.MatriculaException;
import org.example.Aluno;
import org.Disciplinas.Disciplina;

public interface ValidadorPreRequisito {
    boolean validar(Aluno aluno, Disciplina disciplina) throws MatriculaException;
}
