package org.example;

import org.Disciplinas.Disciplina;
import org.Disciplinas.DisciplinaCursada;
import org.Turma.Turma;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private final String nome;
    private final String matricula;
    private int creditoAtual;
    private List<DisciplinaCursada> disciplinasCursadas = new ArrayList<>();
    private List<Turma> planejamento;
    public Aluno(String nome, String matricula, List<DisciplinaCursada> historico) {
        this.creditoAtual = 0;
        this.nome = nome;
        this.matricula = matricula;
        this.disciplinasCursadas.addAll(historico);
    }

    public String getNome() { return nome;}
    public String getMatricula() { return matricula;}
    public int getCreditoAtual() { return creditoAtual;}
    public List<DisciplinaCursada> getDisciplinasCursadas() { return disciplinasCursadas;}
    public List<Turma> getPlanejamento() { return planejamento; }
}
