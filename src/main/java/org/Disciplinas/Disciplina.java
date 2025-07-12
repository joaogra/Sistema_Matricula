package org.Disciplinas;

import org.Exceptions.MatriculaException;
import org.Turma.Turma;
import org.Validadores.*;
import org.Dados.Aluno;

import java.util.List;

public abstract class Disciplina {
    protected String nome;
    protected String codigo;
    protected int cargaHoraria;
    protected List<Turma> turmas;
    protected List<Disciplina> preRequisitos;
    protected List<ValidadorPreRequisito> validadores;
    protected Disciplina coRequisito;

    public Disciplina(){

    }
    public Disciplina(String nome, String codigo, int cargaHoraria, List<Disciplina> preRequisitos,Disciplina coRequisito) {
        this.nome = nome;
        this.codigo = codigo;
        this.cargaHoraria = cargaHoraria;
        this.preRequisitos = preRequisitos;
        this.coRequisito = coRequisito;
        preencheValidadores();
    }

    public abstract TipoDeDisciplina getTipoDisciplina();

    public int getCargaHoraria() { return cargaHoraria;}
    public String getCodigo() { return codigo;}
    public String getNome() { return nome; }
    public List<Turma> getTurmas() { return turmas; }
    public List<Disciplina> getPreRequisitos() { return preRequisitos; }

    public Disciplina getCoRequisito() {
        return coRequisito;
    }

    private void preencheValidadores(){
        validadores.add(new ValidadorCorrequisitos());

        if(preRequisitos.isEmpty()){ return;}
        if(preRequisitos.size() == 1) {
            validadores.add(new ValidadorSimples());
        }
        else {
            validadores.add(new ValidadorAnd());
        }

    }
    public void validarTodos(Aluno aluno, Disciplina disciplina) throws MatriculaException {
        for(ValidadorPreRequisito validador : validadores){
            validador.validar(aluno,disciplina);
        }

    }
}
