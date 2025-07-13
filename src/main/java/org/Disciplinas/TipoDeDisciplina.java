package org.Disciplinas;

public enum TipoDeDisciplina {
    OBRIGATORIA(3),
    ELETIVA(2),
    OPTATIVA(1);
    private final int prioridade;
    TipoDeDisciplina(int prioridade) {
        this.prioridade = prioridade;
    }
    public int getPrioridade() {
        return prioridade;
    }
}


