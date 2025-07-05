package org.Disciplinas;

import org.Turma.Turma;

import java.util.List;

public class DisciplinaObrigatoria extends Disciplina{

    public DisciplinaObrigatoria(String nome, String codigo, int cargaHoraria, List<Turma> turmas, List<Disciplina> preRequisitos) {
        super(nome, codigo, cargaHoraria, turmas, preRequisitos);
    }
    @Override
    public TipoDeDisciplina getTipoDisciplina(){ return TipoDeDisciplina.OBRIGATORIA; }
}
