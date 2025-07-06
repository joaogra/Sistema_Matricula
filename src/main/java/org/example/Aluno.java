package org.example;

import org.Disciplinas.Disciplina;
import org.Disciplinas.DisciplinaCursada;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private final String nome;
    private final String matricula;
    private int creditoAtual;
    private List<DisciplinaCursada> disciplinasCursadas = new ArrayList<>();
    private List<Disciplina> planejamento;
    public Aluno(String nome, String matricula, List<DisciplinaCursada> historico, List<Disciplina> planejamento) {
        this.creditoAtual = 0;
        this.nome = nome;
        this.matricula = matricula;
        this.disciplinasCursadas.addAll(historico);
        this.planejamento = planejamento;
    }

    public String getNome() { return nome;}
    public String getMatricula() { return matricula;}
    public int getCreditoAtual() { return creditoAtual;}
    public List<DisciplinaCursada> getDisciplinasCursadas() { return disciplinasCursadas;}
    public List<Disciplina> getPlanejamento() { return planejamento; }
}
