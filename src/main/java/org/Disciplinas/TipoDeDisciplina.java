package org.Disciplinas;

public enum TipoDeDisciplina {
    OBRIGATORIA(3),
    ELETIVA(2),
    OPTATIVA(1);
    private int prioridade;
    private TipoDeDisciplina(int prioridade) {
        this.prioridade = prioridade;
    }
    public int getPrioridade() {
        return prioridade;
    }
}


