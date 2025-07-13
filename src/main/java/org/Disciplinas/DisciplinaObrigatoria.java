package org.Disciplinas;

import org.Turma.Turma;

import java.util.List;

public class DisciplinaObrigatoria extends Disciplina{

    public DisciplinaObrigatoria(String nome, String codigo, int cargaHoraria, List<Disciplina> preRequisitos, Disciplina coRequisitos) {
        super(nome, codigo, cargaHoraria, preRequisitos, coRequisitos);
    }

   public DisciplinaObrigatoria() {
        //Esse construtor é chamado quando uma disciplina não tem coRequisito
        this.codigo = " ";
   }
    @Override
    public TipoDeDisciplina getTipoDisciplina(){ return TipoDeDisciplina.OBRIGATORIA; }
}
