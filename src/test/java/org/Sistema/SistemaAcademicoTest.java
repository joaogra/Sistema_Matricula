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
    private Aluno aluno1, aluno2, aluno3, aluno4, aluno5;
    private SistemaAcademico siga;

    @BeforeEach

    public void inicializa(){
        aluno1 = new Aluno ("Gleiph", "12345679", List.of(new DisciplinaCursada(banco.getListaDisciplinas().get("DCC199"),100), new DisciplinaCursada(banco.getListaDisciplinas().get("DC5199"),75),
            new DisciplinaCursada(banco.getListaDisciplinas().get("ICE001"),61), new DisciplinaCursada(banco.getListaDisciplinas().get("QUI125"),70), new DisciplinaCursada(banco.getListaDisciplinas().get("MAT154"),72),
            new DisciplinaCursada(banco.getListaDisciplinas().get("MAT155"),40)), 25, 5,
            List.of(banco.getListaDisciplinas().get("MAT156").getTurmas().getFirst(), banco.getListaDisciplinas().get("FIS073").getTurmas().getFirst(), banco.getListaDisciplinas().get("EST028").getTurmas().getFirst(), banco.getListaDisciplinas().get("DCC200").getTurmas().getFirst(), banco.getListaDisciplinas().get("DCC122").getTurmas().getFirst(), banco.getListaDisciplinas().get("MAT143").getTurmas().getFirst(),
                    banco.getListaDisciplinas().get("MAT155").getTurmas().get(1)));

      aluno2 = new Aluno("Gilson", "123131", List.of(), 10, 0,
              List.of(banco.getListaDisciplinas().get("ICE001").getTurmas().getFirst(),
                      banco.getListaDisciplinas().get("FIS122").getTurmas().getLast()));

      aluno3 = new Aluno("João Victor", "2313154", List.of(new DisciplinaCursada(banco.getListaDisciplinas().get("MAT154"), 63),
              new DisciplinaCursada(banco.getListaDisciplinas().get("EST028"),61)), 10, 1,
              List.of(banco.getListaDisciplinas().get("QUI125").getTurmas().getFirst(), banco.getListaDisciplinas().get("DCC073").getTurmas().getLast()));

      aluno4 = new Aluno("Cleiton", "1654686", List.of(new DisciplinaCursada(banco.getListaDisciplinas().get("MAT156"),80),
              new DisciplinaCursada(banco.getListaDisciplinas().get("DCC199"),90)), 10, 1,
              List.of(banco.getListaDisciplinas().get("DCC191").getTurmas().getFirst(),
                      banco.getListaDisciplinas().get("UNI015").getTurmas().getFirst()));

      aluno5 = new Aluno("Jailson", "215464", List.of(), 10, 2,
              List.of(banco.getListaDisciplinas().get("MAT154").getTurmas().getFirst(), banco.getListaDisciplinas().get("MAT155").getTurmas().getFirst(),
                      banco.getListaDisciplinas().get("QUI125").getTurmas().getFirst(), banco.getListaDisciplinas().get("ICE001").getTurmas().getFirst()));
      siga = new SistemaAcademico();
    }

    @Test
    public void testaMatricula() {
        ResultadoMatricula res;
        res = siga.matricula(List.of(aluno1));
        //verifica se as turmas que foram matriculadas sao as mesmas que as esperadas
        assertEquals(List.of(banco.getListaDisciplinas().get("FIS073").getTurmas().getFirst(), banco.getListaDisciplinas().get("EST028").getTurmas().getFirst()), res.getTurmasAceitas());
        //verifica se as turmas que foram rejeitadas sao as mesmas que as esperadas
       assertEquals(Set.of(banco.getListaDisciplinas().get("MAT155").getTurmas().get(1),
                        banco.getListaDisciplinas().get("DCC122").getTurmas().getFirst(),
                        banco.getListaDisciplinas().get("DCC200").getTurmas().getFirst(),
                        banco.getListaDisciplinas().get("MAT143").getTurmas().getFirst(),
                        banco.getListaDisciplinas().get("MAT156").getTurmas().getFirst()),
                res.getTurmasRejeitadas().keySet());
    }

    @Test

    public void testaConflitoHorarioMesmaPrecedencia(){
        ResultadoMatricula res;
        res = siga.matricula(List.of(aluno2));
        assertEquals(Set.of(banco.getListaDisciplinas().get("FIS122").getTurmas().getLast(),
                banco.getListaDisciplinas().get("ICE001").getTurmas().getFirst()), res.getTurmasRejeitadas().keySet());

    }

    @Test

    public void testConflitoHorarioPrioridadeObrigatoriaSobreEletiva(){
        ResultadoMatricula res;
        res = siga.matricula(List.of(aluno3));
        //Matricula na obrigatória pois tem prioridade sobre a eletiva
        assertEquals(List.of(banco.getListaDisciplinas().get("QUI125").getTurmas().getFirst()), res.getTurmasAceitas());
        assertEquals(Set.of(banco.getListaDisciplinas().get("DCC073").getTurmas().getLast()),res.getTurmasRejeitadas().keySet());

    }

    @Test

    public void testConflitoHorarioPrioridadeEletivaSobreOptativa(){
        ResultadoMatricula res;
        res = siga.matricula(List.of(aluno4));
        // Matricula na eletiva em relação à optativa
        assertEquals(List.of(banco.getListaDisciplinas().get("DCC191").getTurmas().getFirst()), res.getTurmasAceitas());
        assertEquals(Set.of(banco.getListaDisciplinas().get("UNI015").getTurmas().getFirst()),res.getTurmasRejeitadas().keySet());
    }

    @Test

    public void testaSeACargaHorariaFoiExcedida(){
        ResultadoMatricula res;
        res = siga.matricula(List.of(aluno5));

        assertEquals(List.of(banco.getListaDisciplinas().get("MAT154").getTurmas().getFirst(), banco.getListaDisciplinas().get("MAT155").getTurmas().getFirst(),
                banco.getListaDisciplinas().get("ICE001").getTurmas().getFirst()), res.getTurmasAceitas());

        assertEquals(Set.of(banco.getListaDisciplinas().get("QUI125").getTurmas().getFirst()),res.getTurmasRejeitadas().keySet());
    }

}