package org.Sistema;

import org.Dados.Aluno;
import org.Dados.CriaDados;
import org.Disciplinas.DisciplinaCursada;
import org.Disciplinas.DisciplinaObrigatoria;
import org.Turma.Turma;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.Exceptions.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class SistemaAcademicoTest {


    CriaDados banco = new CriaDados();
    private Aluno aluno1;
    private Aluno aluno2;
    private Aluno aluno3;
    private Aluno aluno4;
    private SistemaAcademico siga;

    @BeforeEach

    public void inicializa(){
        aluno1 = new Aluno("João Victor", "202465045", List.of(new DisciplinaCursada(banco.getListaDisciplinas().get("DCC199"), 63), new DisciplinaCursada(banco.getListaDisciplinas().get("DC5199"), 62)), 10, 1, List.of(banco.getListaDisciplinas().get("MAT155").getTurmas().getFirst(), banco.getListaDisciplinas().get("QUI126").getTurmas().getFirst(), banco.getListaDisciplinas().get("MAT156").getTurmas().getFirst()));
        aluno2 = new Aluno("Maria", "1234", List.of(new DisciplinaCursada(banco.getListaDisciplinas().get("DCC199"), 63), new DisciplinaCursada(banco.getListaDisciplinas().get("DC5199"), 62)), 10, 1, List.of(banco.getListaDisciplinas().get("MAT155").getTurmas().getFirst(), banco.getListaDisciplinas().get("QUI126").getTurmas().getFirst(), banco.getListaDisciplinas().get("MAT156").getTurmas().getFirst()));
        aluno3 = new Aluno("Victor", "2056589", List.of(new DisciplinaCursada(banco.getListaDisciplinas().get("DCC199"), 63), new DisciplinaCursada(banco.getListaDisciplinas().get("DC5199"), 62)), 10, 1, List.of(banco.getListaDisciplinas().get("MAT155").getTurmas().getFirst(), banco.getListaDisciplinas().get("QUI126").getTurmas().getFirst(), banco.getListaDisciplinas().get("MAT156").getTurmas().getFirst()));
        aluno4 = new Aluno("Aluno4", "2056589", List.of(new DisciplinaCursada(banco.getListaDisciplinas().get("DCC199"), 63), new DisciplinaCursada(banco.getListaDisciplinas().get("DC5199"), 62)), 10, 1, List.of(banco.getListaDisciplinas().get("MAT155").getTurmas().getFirst(), banco.getListaDisciplinas().get("QUI126").getTurmas().getFirst(), banco.getListaDisciplinas().get("FIS122").getTurmas().getFirst()));
        siga = new SistemaAcademico();
    }

    @Test
    public void TestaMatricula() {
        ResultadoMatricula res = new ResultadoMatricula();
        res = siga.matricula(List.of(aluno1));
        for(Turma turma : res.getTurmasAceitas()){
            System.out.println(turma.getDisciplina().getNome());
        }
        //assertEquals(List.of(banco.getListaDisciplinas().get("MAT155").getTurmas().getFirst(), banco.getListaDisciplinas().get("QUI126").getTurmas().getFirst()),res.getTurmasAceitas());
        //assertEquals(List.of(banco.getListaDisciplinas().get("MAT156").getTurmas().getFirst()),res.getTurmasRejeitadas().keySet());

        //assertEquals(true,res.getTurmasAceitas().containsAll(List.of(banco.getListaDisciplinas().get("MAT155").getTurmas().getFirst(), banco.getListaDisciplinas().get("QUI126").getTurmas().getFirst())));
    }
}