package org.Disciplinas;


import org.Turma.DiaSemana;
import org.Turma.Horario;
import org.Turma.Turma;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.Turma.DiaSemana.QUINTA;
import static org.Turma.DiaSemana.SEGUNDA;


public class CriaDados {
    private Map<String,Disciplina> listaDisciplinas= new HashMap<>();


    public CriaDados(){
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
        Disciplina CalculoII = new DisciplinaObrigatoria("CalculoII", "MAT156", 4, List.of(Calculo1, GASL), new DisciplinaObrigatoria());
        listaDisciplinas.put("MAT156", CalculoII);
        Disciplina LabQuimII = new DisciplinaObrigatoria("LabQuimII", "QUI168", 2, List.of(LabQuim), new DisciplinaObrigatoria());
        listaDisciplinas.put("QUI168",LabQuimII);
        Disciplina EstruturaDeDados = new DisciplinaObrigatoria("Estrutura de Dados", "DCC013", 4, List.of(AlgoritmoII), new DisciplinaObrigatoria());
        listaDisciplinas.put("DCC013", EstruturaDeDados);
        Disciplina OrientacaoObjetos = new DisciplinaObrigatoria("Orientação a objetos", "DCC025", 4, List.of(AlgoritmoII), new DisciplinaObrigatoria());
        listaDisciplinas.put("DCC025", OrientacaoObjetos);
        Disciplina CircuitosDigitais = new DisciplinaObrigatoria("Circuitos Digitais", "DCC122", 4, new ArrayList<Disciplina>(),new DisciplinaObrigatoria());
        listaDisciplinas.put("DCC122",CircuitosDigitais);
        Disciplina LogicaeFundComp = new DisciplinaObrigatoria("Logica e Fundamentos para a Computação", "DCC160", 4, new ArrayList<Disciplina>(),new DisciplinaObrigatoria());
        listaDisciplinas.put("DCC160", LogicaeFundComp);
        Disciplina ITN = new DisciplinaObrigatoria("Introdução a Teoria dos Números", "MAT143", 4, new ArrayList<Disciplina>(),new DisciplinaObrigatoria());
        listaDisciplinas.put("MAT143",ITN);
        Disciplina CalculoIII = new DisciplinaObrigatoria("CalculoIII", "MAT157", 4, List.of(CalculoII), new DisciplinaObrigatoria());
        listaDisciplinas.put("MAT157", CalculoIII);
        Disciplina WebDev = new DisciplinaObrigatoria("Desenvolvimento Web", "DCC202", 2, new ArrayList<Disciplina>(), new DisciplinaObrigatoria());
        listaDisciplinas.put("DCC202", WebDev);
        Disciplina CalculoNumerico = new DisciplinaObrigatoria("Cálculo Numérico", "DCC008", 4, List.of(algoritmo,CalculoII), new DisciplinaObrigatoria());
        listaDisciplinas.put("DCC008", CalculoNumerico);
        Disciplina EstruturadeDadosII = new DisciplinaObrigatoria("Estrutura de Dados II", "DCC012", 4, List.of(EstruturaDeDados), new DisciplinaObrigatoria());
        listaDisciplinas.put("DCC012", EstruturadeDadosII);
        Disciplina OrganizacaoComputadores = new DisciplinaObrigatoria("Organização de Computadores", "DCC070", 4, List.of(CircuitosDigitais), new DisciplinaObrigatoria());
        listaDisciplinas.put("DCC070", OrganizacaoComputadores);
        Disciplina ModelagemdeSistemas = new DisciplinaObrigatoria("Modelagem de Sistemas", "DCC177", 4, List.of(OrientacaoObjetos), new DisciplinaObrigatoria());
        listaDisciplinas.put("DCC177", ModelagemdeSistemas);
        Disciplina EquacoesDiferenciais = new DisciplinaObrigatoria("Equações Diferenciais I", "MAT029", 4, List.of(CalculoII), new DisciplinaObrigatoria());
        listaDisciplinas.put("MAT029",EquacoesDiferenciais);
        Disciplina AlgebraLinear = new DisciplinaObrigatoria("Álgebra Linear", "MAT158", 4, List.of(GASL), new DisciplinaObrigatoria());
        listaDisciplinas.put("MAT158", AlgebraLinear);
        Disciplina GameDev = new DisciplinaEletiva("Desenvolvimento de Jogos", "DCC148", 4, List.of(GASL, OrientacaoObjetos), new DisciplinaObrigatoria());
        listaDisciplinas.put("DCC148", GameDev);
        Disciplina InfonaEducacao = new DisciplinaEletiva("Informatica na Educação", "DCC086", 4, new ArrayList<Disciplina>(), new DisciplinaObrigatoria());
        listaDisciplinas.put("DCC086", InfonaEducacao);
        Disciplina VisuCientifica = new DisciplinaEletiva("Visualização Científica", "DCC191", 4, List.of(algoritmo, CalculoII), new DisciplinaObrigatoria());
        listaDisciplinas.put("DCC191", VisuCientifica);
        Disciplina TeoriadeFilas = new DisciplinaEletiva("Teoria de Filas", "DCC073", 4, List.of(IntroEstatistica), new DisciplinaObrigatoria());
        listaDisciplinas.put("DCC073", TeoriadeFilas);
        Disciplina FisicaII = new DisciplinaEletiva("Fisica II", "FIS074", 4, List.of(FisicaI), new DisciplinaObrigatoria());
        listaDisciplinas.put("FIS074", FisicaII);
        Disciplina InglesI = new DisciplinaOptativa("Lingua Inglesa Instrumental I", "UNI001", 4 , new ArrayList<Disciplina>(), new DisciplinaObrigatoria());
        listaDisciplinas.put("UNI001", InglesI);
        Disciplina LibrasI = new DisciplinaOptativa("LIbrais Intrumental I", "UNI015", 4 , new ArrayList<Disciplina>(), new DisciplinaObrigatoria());
        listaDisciplinas.put("UNI015", LibrasI);
        Disciplina InglesII = new DisciplinaOptativa("Lingua Inglesa Intrumental II", "UNI002", 4, List.of(LibrasI), new DisciplinaObrigatoria());
        listaDisciplinas.put("UNI002", InglesII);
        Disciplina LibrasII = new DisciplinaOptativa("LIbras Instrumental II", "UNI016", 4, List.of(LibrasI), new DisciplinaObrigatoria());
        listaDisciplinas.put("UNI016", LibrasII);
        Turma AlgA = new Turma("A",3,0,algoritmo, new Horario(List.of(SEGUNDA,QUINTA), 8));
        algoritmo.getTurmas().add(AlgA);
        Turma AlgB = new Turma("B", 3, 0 , algoritmo, new Horario(List.of(SEGUNDA,QUINTA),10));

    }
 }
