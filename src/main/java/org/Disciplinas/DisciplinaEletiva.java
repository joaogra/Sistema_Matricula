package org.Disciplinas;

import org.example.Turma;

import java.util.List;

public class DisciplinaEletiva extends Disciplina {
    public DisciplinaEletiva(String nome, String codigo, int cargaHoraria, List<Turma> turmas, List<Disciplina> preRequisitos) {
        super(nome, codigo, cargaHoraria, turmas, preRequisitos);
    }
    @Override
    public TipoDeDisciplina getTipoDisciplina(){ return TipoDeDisciplina.ELETIVA; }
}

