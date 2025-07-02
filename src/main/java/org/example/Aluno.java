package org.example;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private String nome;
    private String matricula;
    private List<String> disciplinasCursadas = new ArrayList<>();
    private List<String> planejamento = new ArrayList<>();

    // Trocar o Array disciplinasCursadas p um "TAD" que guarda o código e a nota que o aluno teve.

    public Aluno(String nome, String matricula, List<String> historico, List<String> plan){
        this.nome = nome;
        this.matricula = matricula;
        this.disciplinasCursadas.addAll(historico);
        this.planejamento.addAll(plan);
    }
    public String getNome() { return nome;}
    public String getMatricula() { return matricula;}

    public List<String> getDisciplinasCursadas() { return disciplinasCursadas;}

    public List<String> getPlanejamento() { return planejamento; }
}
