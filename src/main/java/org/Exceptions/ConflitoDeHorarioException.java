package org.Exceptions;

import org.Turma.Turma;

public class ConflitoDeHorarioException extends ValidacaoMatriculaException {
    private final Turma turma;

    public ConflitoDeHorarioException(String message, Turma turma) {
        super(message);
        this.turma = turma;
    }
    public Turma getTurma() {
        return turma;
    }
}
