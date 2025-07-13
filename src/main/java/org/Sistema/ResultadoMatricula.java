package org.Sistema;

import org.Turma.Turma;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ResultadoMatricula {
    private  List<Turma> turmasAceitas = new ArrayList<>();
    private  Map<Turma, Exception> turmasRejeitadas = new HashMap<>();

    public List<Turma> getTurmasAceitas() {
        return turmasAceitas;
    }

    public Map<Turma, Exception> getTurmasRejeitadas() {
        return turmasRejeitadas;
    }

    public void setTurmasAceitas(List <Turma> turmasAceitas){
        this.turmasAceitas.addAll(turmasAceitas);
    }

    public void setTurmasRejeitadas(Map <Turma, Exception> TurmasRejeitadas){
        this.turmasRejeitadas.putAll(TurmasRejeitadas);
    }
}
