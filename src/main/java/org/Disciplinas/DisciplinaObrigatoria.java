package org.Disciplinas;

import org.Turma.Turma;

import java.util.List;

public class DisciplinaObrigatoria extends Disciplina{

    public DisciplinaObrigatoria(String nome, String codigo, int cargaHoraria, List<Disciplina> preRequisitos, Disciplina coRequisitos) {
        super(nome, codigo, cargaHoraria, preRequisitos, coRequisitos);
    }

    public DisciplinaObrigatoria(){


    }
    @Override
    public TipoDeDisciplina getTipoDisciplina(){ return TipoDeDisciplina.OBRIGATORIA; }
}
