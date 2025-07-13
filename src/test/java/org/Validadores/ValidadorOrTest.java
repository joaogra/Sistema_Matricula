package org.Validadores;

import org.Dados.Aluno;
import org.Dados.CriaDados;
import org.Disciplinas.DisciplinaCursada;
import org.Exceptions.PreRequisitoNaoCumpridoException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ValidadorOrTest {

    CriaDados banco;
    Aluno aluno1;
    ValidadorOr validadorOr;

    @BeforeEach

    public void inicializa(){
        banco = new CriaDados();
        aluno1 = new Aluno("Adrian Maciel", "2020202", List.of(new DisciplinaCursada(banco.getListaDisciplinas().get("MAT154"),75), new DisciplinaCursada(banco.getListaDisciplinas().get("MAT155"),55)),10,0,List.of(banco.getListaDisciplinas().get("MAT156").getTurmas().getFirst(), banco.getListaDisciplinas().get("MAT157").getTurmas().getFirst()));
        validadorOr = new ValidadorOr();
    }

    @Test
    public void matriculaSeTiverPeloMenosUmPreRequisito(){
        assertDoesNotThrow(()->validadorOr.validar(aluno1,banco.getListaDisciplinas().get("MAT156")));
    }

    @Test

    public void lançaExceptionSeNaoTiverNenhumPreRequisito(){
        assertThrows(PreRequisitoNaoCumpridoException.class,()-> {validadorOr.validar(aluno1, banco.getListaDisciplinas().get("MAT157"));});
    }
}