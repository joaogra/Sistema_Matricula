package org.Validadores;

import org.Dados.Aluno;
import org.Dados.CriaDados;
import org.Disciplinas.DisciplinaCursada;
import org.Exceptions.PreRequisitoNaoCumpridoException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ValidadorAndTest {

    CriaDados banco;
    Aluno aluno1, aluno2;
    ValidadorAnd validadorAnd;

    @BeforeEach

    public void inicializa(){
        banco = new CriaDados();
        aluno1 = new Aluno("Adrian Maciel", "2020202", List.of(new DisciplinaCursada(banco.getListaDisciplinas().get("MAT154"),75), new DisciplinaCursada(banco.getListaDisciplinas().get("MAT155"),55)),10,0,List.of(banco.getListaDisciplinas().get("MAT156").getTurmas().getFirst(), banco.getListaDisciplinas().get("MAT157").getTurmas().getFirst()));
        aluno2 = new Aluno("Guilherme B", "1464654", List.of(new DisciplinaCursada(banco.getListaDisciplinas().get("DCC199"), 80), new DisciplinaCursada(banco.getListaDisciplinas().get("MAT156"),60)),10,0,List.of(banco.getListaDisciplinas().get("DCC008").getTurmas().getFirst()));
        validadorAnd = new ValidadorAnd();
    }

    @Test
    public void possuiPreRequisito(){
        assertDoesNotThrow(()->validadorAnd.validar(aluno2,banco.getListaDisciplinas().get("DCC008")));
    }

    @Test

    public void possuiPreRequisitoMasSemNota(){
        assertThrows(PreRequisitoNaoCumpridoException.class,()-> {validadorAnd.validar(aluno1, banco.getListaDisciplinas().get("MAT156"));});
    }

    @Test

    public void naoPossuiPreRequisito(){
        assertThrows(PreRequisitoNaoCumpridoException.class,()-> {validadorAnd.validar(aluno1, banco.getListaDisciplinas().get("MAT157"));});
    }

}