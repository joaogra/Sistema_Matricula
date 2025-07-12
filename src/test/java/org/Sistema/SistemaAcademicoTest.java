package org.Sistema;

import org.Dados.Aluno;
import org.Dados.CriaDados;
import org.Disciplinas.DisciplinaCursada;
import org.Disciplinas.DisciplinaObrigatoria;
import org.Turma.Turma;
import org.junit.jupiter.api.Test;
import org.Exceptions.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class SistemaAcademicoTest {

    @Test
    public void TestaMatricula() {
        CriaDados banco = new CriaDados();
        SistemaAcademico siga = new SistemaAcademico();
        Aluno aluno1 = new Aluno("João Victor","202465045", List.of(new DisciplinaCursada(banco.getListaDisciplinas().get("DCC199"),63), new DisciplinaCursada(banco.getListaDisciplinas().get("DC5199"),62)),10,1, List.of(banco.getListaDisciplinas().get("MAT155").getTurmas().getFirst(), banco.getListaDisciplinas().get("QUI126").getTurmas().getFirst()));
        siga.matricula(List.of(aluno1));
    }
}