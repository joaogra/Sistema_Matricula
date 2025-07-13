package org.Turma;


import org.Dados.Aluno;
import org.Dados.CriaDados;
import org.Exceptions.TurmaCheiaException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TurmaTest {
    CriaDados banco;
    Turma turmaTest;

    @BeforeEach

    public void inicializa(){
        banco = new CriaDados();
        turmaTest = banco.getListaDisciplinas().get("MAT143").getTurmas().getFirst();
    }

    @Test

    public void TestaTurmaCheiaException(){
        assertThrows(TurmaCheiaException.class, ()->{turmaTest.verificaVagasDisponiveis();});
    }

}