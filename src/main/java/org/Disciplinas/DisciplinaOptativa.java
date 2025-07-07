package org.Disciplinas;

import org.Turma.Turma;

import java.util.List;

public class DisciplinaOptativa extends Disciplina {
    public DisciplinaOptativa(String nome, String codigo, int cargaHoraria, List<Disciplina> preRequisitos, Disciplina coRequisitos) {
        super(nome, codigo, cargaHoraria, preRequisitos, coRequisitos);
    }
    @Override
    public TipoDeDisciplina getTipoDisciplina(){ return TipoDeDisciplina.OPTATIVA; }
}

