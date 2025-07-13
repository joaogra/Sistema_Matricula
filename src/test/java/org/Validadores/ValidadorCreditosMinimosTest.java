package org.Validadores;

import org.Dados.Aluno;
import org.Dados.CriaDados;
import org.Disciplinas.DisciplinaCursada;
import org.Exceptions.MatriculaException;
import org.Exceptions.PreRequisitoNaoCumpridoException;
import org.Sistema.ResultadoMatricula;
import org.Sistema.SistemaAcademico;
import org.Turma.Turma;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ValidadorCreditosMinimosTest {



    CriaDados banco;
    Aluno aluno1, aluno2;
    ValidadorCreditosMinimos validadorCreditosMinimos;
    SistemaAcademico siga;

    @BeforeEach

    public void inicializa(){
        banco = new CriaDados();
        aluno1 = new Aluno("Adrian Maciel", "2020202", List.of(), 10, 1, List.of(banco.getListaDisciplinas().get("MAT154").getTurmas().getFirst(), banco.getListaDisciplinas().get("MAT155").getTurmas().getFirst()));
        aluno2 = new Aluno("Guilherme B", "1464654", List.of(new DisciplinaCursada(banco.getListaDisciplinas().get("DCC199"), 80), new DisciplinaCursada(banco.getListaDisciplinas().get("MAT156"),60)),10,6,List.of(banco.getListaDisciplinas().get("ICE001").getTurmas().getFirst()));
        validadorCreditosMinimos = new ValidadorCreditosMinimos();
        siga = new SistemaAcademico();
        ResultadoMatricula res1 =siga.matricula(List.of(aluno1));
        ResultadoMatricula res2 =siga.matricula(List.of(aluno2));
    }

    @Test
    public void matriculaSeTiverCreditosMinimos(){
        assertDoesNotThrow(()->validadorCreditosMinimos.validar(aluno1,banco.getListaDisciplinas().get("MAT154")));
    }

    @Test

    public void lançaExceptionSeNaoTiverCreditosMinimos(){
        assertThrows(MatriculaException.class,()-> {validadorCreditosMinimos.validar(aluno2, banco.getListaDisciplinas().get("ICE001"));});
    }


}