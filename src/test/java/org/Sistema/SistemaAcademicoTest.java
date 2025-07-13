package org.Sistema;

import org.Dados.Aluno;
import org.Dados.CriaDados;
import org.Disciplinas.DisciplinaCursada;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;


class SistemaAcademicoTest {


    CriaDados banco = new CriaDados();
    private Aluno aluno1, aluno2, aluno3, aluno4,aluno5, aluno6;
    private SistemaAcademico siga;

    @BeforeEach

    public void inicializa(){
        aluno1 = new Aluno("João Victor", "202465045", List.of(new DisciplinaCursada(banco.getListaDisciplinas().get("DCC199"), 63), new DisciplinaCursada(banco.getListaDisciplinas().get("DC5199"), 62)), 10, 1, List.of(banco.getListaDisciplinas().get("MAT155").getTurmas().getFirst(), banco.getListaDisciplinas().get("QUI126").getTurmas().getFirst(), banco.getListaDisciplinas().get("MAT156").getTurmas().getFirst()));
        aluno2 = new Aluno("Maria", "1234", List.of(new DisciplinaCursada(banco.getListaDisciplinas().get("DCC199"), 63), new DisciplinaCursada(banco.getListaDisciplinas().get("DC5199"), 62)), 10, 1, List.of(banco.getListaDisciplinas().get("MAT155").getTurmas().getFirst(), banco.getListaDisciplinas().get("QUI126").getTurmas().getFirst(), banco.getListaDisciplinas().get("MAT156").getTurmas().getFirst()));
        aluno3 = new Aluno("Victor", "2056589", List.of(new DisciplinaCursada(banco.getListaDisciplinas().get("DCC199"), 63), new DisciplinaCursada(banco.getListaDisciplinas().get("DC5199"), 62)), 10, 1, List.of(banco.getListaDisciplinas().get("MAT155").getTurmas().getFirst(), banco.getListaDisciplinas().get("QUI126").getTurmas().getFirst(), banco.getListaDisciplinas().get("MAT156").getTurmas().getFirst()));
        aluno4 = new Aluno("Aluno4", "2056589", List.of(new DisciplinaCursada(banco.getListaDisciplinas().get("DCC199"), 63), new DisciplinaCursada(banco.getListaDisciplinas().get("DC5199"), 62)), 10, 1, List.of(banco.getListaDisciplinas().get("MAT155").getTurmas().getFirst(), banco.getListaDisciplinas().get("QUI126").getTurmas().getFirst(), banco.getListaDisciplinas().get("FIS122").getTurmas().getFirst()));
        aluno5 = new Aluno("Gleiph", "1212121", List.of(), 10, 0, List.of(banco.getListaDisciplinas().get("DC5199").getTurmas().getFirst(),banco.getListaDisciplinas().get("DCC199").getTurmas().getFirst() ));
        aluno6 = new Aluno("Conf Horario", "123131", List.of(), 10, 0, List.of(banco.getListaDisciplinas().get("ICE001").getTurmas().getFirst(), banco.getListaDisciplinas().get("FIS122").getTurmas().getLast()));
        siga = new SistemaAcademico();
    }

    @Test
    public void TestaMatricula() {
        ResultadoMatricula res = new ResultadoMatricula();
        res = siga.matricula(List.of(aluno5));

        //verifica se as turmas que foram matriculadas sao as mesmas que as esperadas
        assertEquals(List.of(),res.getTurmasAceitas());
        //verifica se as turmas que foram rejeitadas sao as mesmas que as esperadas
        //assertEquals(Set.of(banco.getListaDisciplinas().get().getTurmas().getFirst()),res.getTurmasRejeitadas().keySet());
        //assertEquals(Set.of(), res.getTurmasRejeitadas().keySet());
    }

    @Test

    public void TestaConflitoHorario(){
        ResultadoMatricula res = new ResultadoMatricula();
        res = siga.matricula(List.of(aluno6));
        assertEquals(Set.of(banco.getListaDisciplinas().get("FIS122").getTurmas().getLast(), banco.getListaDisciplinas().get("ICE001").getTurmas().getFirst()), res.getTurmasRejeitadas().keySet());

    }






}