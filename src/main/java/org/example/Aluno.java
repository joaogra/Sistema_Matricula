package org.example;

import org.Disciplinas.Disciplina;
import org.Disciplinas.DisciplinaCursada;
import org.Disciplinas.TipoDeDisciplina;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Aluno {

    private final String nome;
    private final String matricula;
    private List<DisciplinaCursada> disciplinasCursadas = new ArrayList<>();
    private Map<Disciplina, TipoDeDisciplina> planejamento;

    public Aluno(String nome, String matricula, List<DisciplinaCursada> historico, Map<Disciplina, TipoDeDisciplina> planejamento) {
        this.nome = nome;
        this.matricula = matricula;
        this.disciplinasCursadas.addAll(historico);
        this.planejamento = planejamento;
    }

    public String getNome() { return nome;}
    public String getMatricula() { return matricula;}
    public List<DisciplinaCursada> getDisciplinasCursadas() { return disciplinasCursadas;}
    public Map<Disciplina, TipoDeDisciplina> getPlanejamento() { return planejamento; }
}
