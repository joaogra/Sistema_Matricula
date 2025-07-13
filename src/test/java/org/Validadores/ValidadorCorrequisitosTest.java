package org.Validadores;

import org.Dados.Aluno;
import org.Dados.CriaDados;
import org.Disciplinas.DisciplinaCursada;
import org.Exceptions.CoRequisitoNaoAtendidoException;
import org.Exceptions.PreRequisitoNaoCumpridoException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ValidadorCorrequisitosTest {

    CriaDados banco;
    Aluno aluno1, aluno2;
    ValidadorCorrequisitos validadorCorrequisitos;

    @BeforeEach

    public void inicializa(){
        banco = new CriaDados();
        aluno1 = new Aluno("Adrian Maciel", "2020202", List.of(),10,0,List.of(banco.getListaDisciplinas().get("DCC199").getTurmas().getFirst(), banco.getListaDisciplinas().get("DC5199").getTurmas().getFirst()));
        aluno2 = new Aluno("Jota", "202054202", List.of(),10,0,List.of(banco.getListaDisciplinas().get("DCC199").getTurmas().getFirst()));

        validadorCorrequisitos = new ValidadorCorrequisitos();
    }

    @Test
    public void TestTrue(){
        assertDoesNotThrow(()->validadorCorrequisitos.validar(aluno1,banco.getListaDisciplinas().get("DCC199")));
    }

    @Test

    public void TestFalse(){
        assertThrows(CoRequisitoNaoAtendidoException.class,()-> {validadorCorrequisitos.validar(aluno2, banco.getListaDisciplinas().get("DCC199"));});
    }

}
