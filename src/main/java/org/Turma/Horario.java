package org.Turma;

import java.util.List;

public class Horario {
    private List<DiaSemana> horarioSem;
    int inicioAula;
    public Horario(List<DiaSemana> dia, int inicioAula){
        this.horarioSem = dia;
        this.inicioAula = inicioAula;
    }

    public List<DiaSemana> getHorarioSem() {
        return horarioSem;
    }

    public int getInicioAula() {
        return inicioAula;
    }

}
