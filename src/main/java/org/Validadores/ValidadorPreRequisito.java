package org.Validadores;

import org.Exceptions.CoRequisitoNaoAtendidoException;
import org.Exceptions.MatriculaException;
import org.Dados.Aluno;
import org.Disciplinas.Disciplina;
import org.Exceptions.PreRequisitoNaoCumpridoException;

public interface ValidadorPreRequisito {
    void validar(Aluno aluno, Disciplina disciplina) throws MatriculaException;
}
