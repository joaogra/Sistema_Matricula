package org.Disciplinas;

import org.Turma.Turma;

import java.util.List;

public class DisciplinaEletiva extends Disciplina {
    public DisciplinaEletiva(String nome, String codigo, int cargaHoraria,List<Disciplina> preRequisitos, Disciplina coRequisitos) {
        super(nome, codigo, cargaHoraria, preRequisitos, coRequisitos);
    }
    @Override
    public TipoDeDisciplina getTipoDisciplina(){ return TipoDeDisciplina.ELETIVA; }
}

