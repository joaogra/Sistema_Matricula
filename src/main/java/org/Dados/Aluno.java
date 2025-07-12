package org.Dados;

import org.Disciplinas.DisciplinaCursada;
import org.Exceptions.CargaHorariaExcedidaException;
import org.Exceptions.MatriculaException;
import org.Turma.Turma;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private final String nome;
    private final String matricula;
    private final int cargaMaxima;
    private final int cargaMinima;
    private int creditoAtual;
    private List<DisciplinaCursada> disciplinasCursadas = new ArrayList<>();
    private List<Turma> planejamento;
    public Aluno(String nome, String matricula, List<DisciplinaCursada> historico,int cargaMaxima, int cargaMinima,List<Turma> planejamento) {
        this.creditoAtual = 0;
        this.nome = nome;
        this.matricula = matricula;
        this.disciplinasCursadas.addAll(historico);
        this.cargaMaxima = cargaMaxima;
        this.cargaMinima = cargaMinima;
        this.planejamento = planejamento;
    }

    public String getNome() { return nome;}
    public int getCreditoAtual() { return creditoAtual;}
    public List<DisciplinaCursada> getDisciplinasCursadas() { return disciplinasCursadas;}



    public List<Turma> getPlanejamento() { return planejamento; }


    public void setCreditoAtual(int somador) {
        this.creditoAtual += somador;
    }

    public void verificaCargaMaxima(int cargaHoraria)throws CargaHorariaExcedidaException {
        if(creditoAtual + cargaHoraria > cargaMaxima) {
            throw new CargaHorariaExcedidaException("carga horaria maxima excedida!");
        }
    }
    public void verificaCargaMinima() throws CargaHorariaExcedidaException {
        if(creditoAtual < cargaMinima) {
            throw new CargaHorariaExcedidaException("Não foi cumprida a quantidade minima de creditos!" + "\nNenhuma matricula foi aceita!");
        }
    }
}
