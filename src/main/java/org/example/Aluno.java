package org.example;

import org.Disciplinas.DisciplinaCursada;
import org.Exceptions.CargaHorariaExcedidaException;
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
    public Aluno(String nome, String matricula, List<DisciplinaCursada> historico) {
        this.creditoAtual = 0;
        this.nome = nome;
        this.matricula = matricula;
        this.disciplinasCursadas.addAll(historico);
        this.cargaMaxima = 10;
        this.cargaMinima = 4;
    }

    public String getNome() { return nome;}
    public String getMatricula() { return matricula;}
    public int getCreditoAtual() { return creditoAtual;}
    public List<DisciplinaCursada> getDisciplinasCursadas() { return disciplinasCursadas;}
    public List<Turma> getPlanejamento() { return planejamento; }

    public void setCreditoAtual(int somador) {
        this.creditoAtual += somador;
    }

    public void verificaCargaMaxima()throws CargaHorariaExcedidaException {
        if(creditoAtual > cargaMaxima) {
            throw new CargaHorariaExcedidaException("Carga horaria excedida!");
        }
    }
}
