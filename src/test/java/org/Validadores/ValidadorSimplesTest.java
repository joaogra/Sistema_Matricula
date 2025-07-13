package org.Validadores;

import org.Dados.Aluno;
import org.Dados.CriaDados;
import org.Disciplinas.DisciplinaCursada;
import org.Exceptions.MatriculaException;
import org.Exceptions.PreRequisitoNaoCumpridoException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ValidadorSimplesTest {

    private CriaDados banco;
    Aluno aluno1;
    ValidadorSimples validadorSimples;

    @BeforeEach

        public void inicializa() {
        banco = new CriaDados();
        aluno1 = new Aluno("João Victor", "202465045", List.of(new DisciplinaCursada(banco.getListaDisciplinas().get("DCC199"), 63), new DisciplinaCursada(banco.getListaDisciplinas().get("DC5199"), 62)), 10, 1, List.of(banco.getListaDisciplinas().get("MAT155").getTurmas().getFirst(), banco.getListaDisciplinas().get("QUI126").getTurmas().getFirst(), banco.getListaDisciplinas().get("MAT156").getTurmas().getFirst()));
        validadorSimples = new ValidadorSimples();
    }

    @Test
    public void matriculaSeTemPreRequisito()  {
        assertDoesNotThrow(()-> validadorSimples.validar(aluno1, banco.getListaDisciplinas().get("DCC200")));
    }

    @Test
    public void lançaExceptionSeNaoTemPreRequisito(){
       assertThrows(PreRequisitoNaoCumpridoException.class,()-> {validadorSimples.validar(aluno1, banco.getListaDisciplinas().get("MAT156"));});
    }
}