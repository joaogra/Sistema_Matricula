package org.example;

public abstract class Disciplina {
    private final String nome;
    private final String codigo;
    private final int cargaHoraria;
    //lista de validadores
    public Disciplina(String nome, String codigo, int cargaHoraria){
        this.nome = nome;
        this.codigo = codigo;
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() { return cargaHoraria;}
    public String getCodigo() { return codigo;}
    public String getNome() { return nome; }
}
