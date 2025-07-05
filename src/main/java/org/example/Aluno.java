package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Aluno {

    private String nome;
    private String matricula;
    private List<DisciplinaCursada> disciplinasCursadas = new ArrayList<>();
    private List<Disciplina> planejamento = new ArrayList<>();

    public Aluno(String nome, String matricula, List<DisciplinaCursada> historico, List<Disciplina> plan){
        this.nome = nome;
        this.matricula = matricula;
        this.disciplinasCursadas.addAll(historico);
        this.planejamento.addAll(plan);
    }
    public String getNome() { return nome;}
    public String getMatricula() { return matricula;}

    public List<DisciplinaCursada> getDisciplinasCursadas() { return disciplinasCursadas;}

    public List<Disciplina> getPlanejamento() { return planejamento; }
}
