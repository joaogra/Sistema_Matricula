package org.Turma;

import java.util.ArrayList;
import java.util.List;

public class Horario {
    List<DiaSemana> horarioSem = new ArrayList<>();
    int inicioAula;
    public Horario(List<DiaSemana> dia, int inicioAula){
        this.horarioSem = dia;
        this.inicioAula = inicioAula;
    }
}
