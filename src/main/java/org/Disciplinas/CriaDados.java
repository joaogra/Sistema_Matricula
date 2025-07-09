package org.Disciplinas;


import org.Turma.DiaSemana;
import org.Turma.Horario;
import org.Turma.Turma;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.Turma.DiaSemana.*;


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

























































































    Turma AlgPratA= new Turma("A", 3,0,algoritmoPratica,new Horario(List.of(TERCA),8));
    algoritmoPratica.getTurmas().add(AlgPratA);

    Turma AlgPratB= new Turma("B", 2,0,algoritmoPratica,new Horario(List.of(TERCA),10));
    algoritmoPratica.getTurmas().add(AlgPratB);

    Turma AlgPratC= new Turma("C", 3,0,algoritmoPratica,new Horario(List.of(QUARTA),14));
    algoritmoPratica.getTurmas().add(AlgPratC);

    Turma ICEA= new Turma("A", 3,0,ICE,new Horario(List.of(SEGUNDA),10));
    ICE.getTurmas().add(ICEA);
    Turma ICEB= new Turma("B", 3,0,ICE,new Horario(List.of(TERCA),18));
    ICE.getTurmas().add(ICEB);

    Turma GASLA= new Turma("A", 3,0,GASL,new Horario(List.of(QUARTA,SEXTA),8));
    GASL.getTurmas().add(GASLA);
    Turma GASLB= new Turma("B", 3,0,GASL,new Horario(List.of(TERCA,QUINTA),16));
    GASL.getTurmas().add(GASLB);

    Turma GASLC= new Turma("C", 3,0,GASL,new Horario(List.of(QUARTA,SEXTA),20));
    GASL.getTurmas().add(GASLC);

    Turma LabQuimA= new Turma("A", 3,0,LabQuim,new Horario(List.of(QUINTA),14));
    LabQuim.getTurmas().add(LabQuimA);
    Turma LabQuimB= new Turma("B", 3,0,LabQuim,new Horario(List.of(QUINTA),10));
    LabQuim.getTurmas().add(LabQuimB);

    Turma AlgoritmoIIPraticaA= new Turma("A", 3,0,AlgoritmoIIPratica,new Horario(List.of(SEGUNDA),14));
    AlgoritmoIIPratica.getTurmas().add(AlgoritmoIIPraticaA);
    Turma AlgoritmoIIPraticaB= new Turma("B", 3,0,AlgoritmoIIPratica,new Horario(List.of(TERCA),14));
    AlgoritmoIIPratica.getTurmas().add(AlgoritmoIIPraticaB);

    Turma Fisica1A= new Turma("A", 3,0,FisicaI,new Horario(List.of(TERCA,QUINTA),8));
    FisicaI.getTurmas().add(Fisica1A);
    Turma Fisica1B= new Turma("B", 3,0,FisicaI,new Horario(List.of(QUARTA,SEXTA),10));
    FisicaI.getTurmas().add(Fisica1B);
    Turma Fisica1C= new Turma("C", 3,0,FisicaI,new Horario(List.of(TERCA,QUINTA),16));
    FisicaI.getTurmas().add(Fisica1C);

    Turma CalculoIIA= new Turma("A", 3,0,CalculoII,new Horario(List.of(SEGUNDA,QUARTA),8));
    CalculoII.getTurmas().add(CalculoIIA);
    Turma CalculoIIB= new Turma("B", 3,0,CalculoII,new Horario(List.of(SEGUNDA,QUARTA),20));
    CalculoII.getTurmas().add(CalculoIIB);
    Turma CalculoIIC= new Turma("C", 3,0,CalculoII,new Horario(List.of(QUARTA,SEXTA),14));
    CalculoII.getTurmas().add(CalculoIIC);

    Turma LabQuimIIA= new Turma("A", 3,0,LabQuimII,new Horario(List.of(QUARTA),10));
    LabQuimII.getTurmas().add(LabQuimIIA);
    Turma LabQuimIIB= new Turma("B", 3,0,LabQuimII,new Horario(List.of(TERCA),16));
    LabQuimII.getTurmas().add(LabQuimIIB);
    Turma LabQuimIIC= new Turma("C", 3,0,LabQuimII,new Horario(List.of(QUARTA),16));
    LabQuimII.getTurmas().add(LabQuimIIC);

    Turma OrientacaoObjetosA= new Turma("A", 3,0,OrientacaoObjetos,new Horario(List.of(SEGUNDA, QUARTA),16));
    OrientacaoObjetos.getTurmas().add(OrientacaoObjetosA);
    Turma OrientacaoObjetosB= new Turma("B", 3,0,OrientacaoObjetos,new Horario(List.of(TERCA, QUINTA),16));
    OrientacaoObjetos.getTurmas().add(OrientacaoObjetosB);
    Turma OrientacaoObjetosC= new Turma("C", 3,0,OrientacaoObjetos,new Horario(List.of(SEGUNDA, QUARTA),20));
    OrientacaoObjetos.getTurmas().add(OrientacaoObjetosC);

    Turma LogicaeFundCompA= new Turma("A", 3,0,LogicaeFundComp,new Horario(List.of(SEGUNDA, SEXTA),14));
    LogicaeFundComp.getTurmas().add(LogicaeFundCompA);
    Turma LogicaeFundCompB= new Turma("B", 3,0,LogicaeFundComp,new Horario(List.of(SEGUNDA, SEXTA),10));
    LogicaeFundComp.getTurmas().add(LogicaeFundCompB);
    Turma LogicaeFundCompC= new Turma("C", 3,0,LogicaeFundComp,new Horario(List.of(TERCA, QUINTA),16));
    LogicaeFundComp.getTurmas().add(LogicaeFundCompC);

    Turma CalculoIIIA= new Turma("A", 3,0,CalculoIII,new Horario(List.of(QUARTA, SEXTA),8));
    CalculoIII.getTurmas().add(CalculoIIIA);
    Turma CalculoIIIB= new Turma("B", 3,0,CalculoIII,new Horario(List.of(SEGUNDA, QUINTA),10));
    CalculoIII.getTurmas().add(CalculoIIIB);
    Turma CalculoIIIC= new Turma("C", 3,0,CalculoIII,new Horario(List.of(QUARTA, SEXTA),18));
    CalculoIII.getTurmas().add(CalculoIIIC);
    }
 }
