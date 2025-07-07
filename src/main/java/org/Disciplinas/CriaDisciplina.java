package org.Disciplinas;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CriaDisciplina {
    private Map<String,Disciplina> listaDisciplinas= new HashMap<>();

    public CriaDisciplina(){
        Disciplina algoritmoPratica = new DisciplinaObrigatoria("Algotimos Pŕatica", "DC5199", 2, new ArrayList<Disciplina>(), new DisciplinaObrigatoria());
        listaDisciplinas.put("DC5199",algoritmoPratica);
        Disciplina algoritmo = new DisciplinaObrigatoria("Algotimos", "DCC199", 4, new ArrayList<Disciplina>(), algoritmoPratica);
        listaDisciplinas.put("DCC199",algoritmo);
        Disciplina LICF = new DisciplinaObrigatoria("LICF", "FIS122", 2, new ArrayList<Disciplina>(),new DisciplinaObrigatoria() );
        listaDisciplinas.put("FIS122",LICF);
        Disciplina ICE = new DisciplinaObrigatoria("ICE", "ICE001", 2, new ArrayList<Disciplina>(), new DisciplinaObrigatoria());
        listaDisciplinas.put("ICE001",ICE);
        Disciplina Calculo1 = new DisciplinaObrigatoria("Calculo1", "MAT154", 2 ,new ArrayList<Disciplina>(), new DisciplinaObrigatoria());
        listaDisciplinas.put("MAT154",Calculo1);
        Disciplina GASL = new DisciplinaObrigatoria("GASL", "MAT155", 4, new ArrayList<Disciplina>(), new DisciplinaObrigatoria());
        listaDisciplinas.put("MAT155",GASL);
        Disciplina QuimicaF = new DisciplinaObrigatoria("Quimica Fundamental", "QUI125", 4, new ArrayList<Disciplina>(), new DisciplinaObrigatoria());
        listaDisciplinas.put("QUI125",QuimicaF);
        Disciplina LabQuim = new DisciplinaObrigatoria("Laboratória de Quimica", "QUI126", 2, new ArrayList<Disciplina>(), new DisciplinaObrigatoria());
        listaDisciplinas.put("QUI126",LabQuim);
        Disciplina AlgoritmoII = new DisciplinaObrigatoria("AlgoritmoII", "DCC200" , 4, List.of(algoritmo, algoritmo), new DisciplinaObrigatoria());
        listaDisciplinas.put("DCC200",AlgoritmoII);
        Disciplina AlgoritmoIIPratica = new DisciplinaObrigatoria("Algoritmo II Pratica ", "DC5200", 2, List.of(algoritmoPratica), AlgoritmoII);
        listaDisciplinas.put("DC5200",AlgoritmoIIPratica);
        Disciplina IntroEstatistica = new DisciplinaObrigatoria("Introdução à Estatística", "EST028", 4, List.of(Calculo1), new DisciplinaObrigatoria());
        listaDisciplinas.put("EST028",IntroEstatistica);
        Disciplina FisicaI = new DisciplinaObrigatoria("FisicaI", "FIS073", 4, List.of(Calculo1), new DisciplinaObrigatoria());
        listaDisciplinas.put("FIS073", FisicaI);
        Disciplina LabFisicaI = new DisciplinaObrigatoria("Laboratório de Fisica 1", "FIS077", 2, List.of(LICF), new DisciplinaObrigatoria());
        listaDisciplinas.put("FIS077", LabFisicaI);
        //Disciplina CalculoII = new DisciplinaObrigatoria("CalculoII", "MAT156", 4, )


    }
 }
