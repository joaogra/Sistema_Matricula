package org.Disciplinas;

import org.Turma.Turma;

import java.util.List;

public abstract class Disciplina {
    protected final String nome;
    protected final String codigo;
    protected final int creditos;
    protected List<Turma> turmas;
    protected List<Disciplina> preRequisitos ;

    //lista de validadores
    public Disciplina(String nome, String codigo, int cargaHoraria, List<Turma> turmas, List<Disciplina> preRequisitos) {
        this.nome = nome;
        this.codigo = codigo;
        this.creditos = cargaHoraria;
        this.turmas = turmas;
        this.preRequisitos = preRequisitos;
    }
    public abstract TipoDeDisciplina getTipoDisciplina();

    public int getCreditos() { return creditos;}
    public String getCodigo() { return codigo;}
    public String getNome() { return nome; }
    public List<Turma> getTurmas() { return turmas; }
    public List<Disciplina> getPreRequisitos() { return preRequisitos; }
}
