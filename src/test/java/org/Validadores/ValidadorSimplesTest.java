package org.Validadores;

import org.Dados.Aluno;
import org.Dados.CriaDados;
import org.Disciplinas.DisciplinaCursada;
import org.Exceptions.MatriculaException;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ValidadorSimplesTest {

    @Test
    public void TestaValidadorSimplesTrue(){
        CriaDados banco = new CriaDados();
        Aluno aluno1 = new Aluno("João Victor","202465045", List.of(new DisciplinaCursada(banco.getListaDisciplinas().get("DCC199"),63), new DisciplinaCursada(banco.getListaDisciplinas().get("DC5199"),62)),10,1, List.of(banco.getListaDisciplinas().get("MAT155").getTurmas().getFirst(), banco.getListaDisciplinas().get("QUI126").getTurmas().getFirst(), banco.getListaDisciplinas().get("MAT156").getTurmas().getFirst()));
        ValidadorSimples validadorSimples = new ValidadorSimples();
        try {
            validadorSimples.validar(aluno1, banco.getListaDisciplinas().get("DCC200"));
        }
        catch (MatriculaException e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void TestaValidadorSimplesFalse(){
        CriaDados banco = new CriaDados();
        Aluno aluno1 = new Aluno("João Victor","202465045", List.of(new DisciplinaCursada(banco.getListaDisciplinas().get("DCC199"),63), new DisciplinaCursada(banco.getListaDisciplinas().get("DC5199"),62)),10,1, List.of(banco.getListaDisciplinas().get("MAT155").getTurmas().getFirst(), banco.getListaDisciplinas().get("QUI126").getTurmas().getFirst(), banco.getListaDisciplinas().get("MAT156").getTurmas().getFirst()));
        ValidadorSimples validadorSimples = new ValidadorSimples();
        try {
            validadorSimples.validar(aluno1, banco.getListaDisciplinas().get("MAT156"));
        }
        catch (MatriculaException e){
            System.out.println(e.getMessage());
        }
    }
}