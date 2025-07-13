package org.Dados;

import org.Disciplinas.Disciplina;
import org.Disciplinas.DisciplinaEletiva;
import org.Disciplinas.DisciplinaObrigatoria;
import org.Disciplinas.DisciplinaOptativa;
import org.Turma.Horario;
import org.Turma.Turma;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.Turma.DiaSemana.*;


public class CriaDados {
    private Map<String, Disciplina> listaDisciplinas= new HashMap<>();

    public CriaDados(){
        Disciplina algoritmoPratica = new DisciplinaObrigatoria("Algotimos Pŕatica", "DC5199", 2, new ArrayList<Disciplina>(), new DisciplinaObrigatoria());
        listaDisciplinas.put("DC5199",algoritmoPratica);
        Disciplina algoritmo = new DisciplinaObrigatoria("Algotimos", "DCC199", 4, new ArrayList<Disciplina>(), algoritmoPratica);
        listaDisciplinas.put("DCC199",algoritmo);
        Disciplina LICF = new DisciplinaObrigatoria("LICF", "FIS122", 2, new ArrayList<Disciplina>(),new DisciplinaObrigatoria() );
        listaDisciplinas.put("FIS122",LICF);
        Disciplina ICE = new DisciplinaObrigatoria("ICE", "ICE001", 2, new ArrayList<Disciplina>(), new DisciplinaObrigatoria());
        listaDisciplinas.put("ICE001",ICE);
        Disciplina Calculo1 = new DisciplinaObrigatoria("Calculo1", "MAT154", 4 ,new ArrayList<Disciplina>(), new DisciplinaObrigatoria());
        listaDisciplinas.put("MAT154",Calculo1);
        Disciplina GASL = new DisciplinaObrigatoria("GASL", "MAT155", 4, new ArrayList<Disciplina>(), new DisciplinaObrigatoria());
        listaDisciplinas.put("MAT155",GASL);
        Disciplina QuimicaF = new DisciplinaObrigatoria("Quimica Fundamental", "QUI125", 4, new ArrayList<Disciplina>(), new DisciplinaObrigatoria());
        listaDisciplinas.put("QUI125",QuimicaF);
        Disciplina LabQuim = new DisciplinaObrigatoria("Laboratório de Quimica", "QUI126", 2, new ArrayList<Disciplina>(), new DisciplinaObrigatoria());
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
        Disciplina LibrasI = new DisciplinaOptativa("LIbras Intrumental I", "UNI015", 4 , new ArrayList<Disciplina>(), new DisciplinaObrigatoria());
        listaDisciplinas.put("UNI015", LibrasI);
        Disciplina InglesII = new DisciplinaOptativa("Lingua Inglesa Intrumental II", "UNI002", 4, List.of(LibrasI), new DisciplinaObrigatoria());
        listaDisciplinas.put("UNI002", InglesII);
        Disciplina LibrasII = new DisciplinaOptativa("LIbras Instrumental II", "UNI016", 4, List.of(LibrasI), new DisciplinaObrigatoria());
        listaDisciplinas.put("UNI016", LibrasII);

        Turma AlgA = new Turma("A",3,0,algoritmo, new Horario(List.of(SEGUNDA,QUINTA), 8));
        algoritmo.getTurmas().add(AlgA);
        Turma AlgB = new Turma("B", 3, 0 , algoritmo, new Horario(List.of(SEGUNDA,QUINTA),10));
        algoritmo.getTurmas().add(AlgB);
        Turma AlgC = new Turma("C", 3, 0, algoritmo, new Horario(List.of(SEGUNDA,QUINTA),14));
        algoritmo.getTurmas().add(AlgC);
        Turma licfA = new Turma("A", 3, 0, LICF, new Horario(List.of(SEGUNDA), 14));
        LICF.getTurmas().add(licfA);
        Turma licfB = new Turma("B",3,0,LICF, new Horario(List.of(QUARTA),14));
        LICF.getTurmas().add(licfB);
        Turma licfC = new Turma("C", 3, 0,LICF, new Horario(List.of(TERCA),10));
        LICF.getTurmas().add(licfC);
        Turma CalculoA = new Turma("A",3,0,Calculo1,new Horario(List.of(QUARTA,SEXTA),8));
        Calculo1.getTurmas().add(CalculoA);
        Turma CalculoB = new Turma("B", 3, 0, Calculo1, new Horario(List.of(QUARTA,SEXTA),10));
        Calculo1.getTurmas().add(CalculoB);
        Turma CalculoC = new Turma("C", 3, 0, Calculo1, new Horario(List.of(QUARTA,SEXTA),14));
        Calculo1.getTurmas().add(CalculoC);
        Turma QuimFundA = new Turma ("A", 3, 0, QuimicaF, new Horario(List.of(SEGUNDA,QUINTA),10));
        QuimicaF.getTurmas().add(QuimFundA);
        Turma QuimFundB = new Turma ("B", 3, 0, QuimicaF, new Horario(List.of(SEGUNDA,QUINTA),14));
        QuimicaF.getTurmas().add(QuimFundB);
        Turma QuimFundC = new Turma ("C", 3, 0, QuimicaF, new Horario(List.of(SEGUNDA,QUINTA),16));
        QuimicaF.getTurmas().add(QuimFundC);
        Turma AlgIIA = new Turma("A", 2, 0, AlgoritmoII, new Horario(List.of(QUARTA,SEXTA),16));
        AlgoritmoII.getTurmas().add(AlgIIA);
        Turma AlgIIB = new Turma("B", 3, 0 , AlgoritmoII, new Horario(List.of(QUARTA,SEXTA), 19));
        AlgoritmoII.getTurmas().add(AlgIIB);
        Turma AlgIIC = new Turma("C", 3, 0 , AlgoritmoII, new Horario(List.of(QUARTA,SEXTA), 21));
        AlgoritmoII.getTurmas().add(AlgIIC);
        Turma IntroEstatA = new Turma("A", 3, 0, IntroEstatistica, new Horario(List.of(TERCA, QUINTA), 10));
        IntroEstatistica.getTurmas().add(IntroEstatA);
        Turma IntroEstatB = new Turma("B", 2, 0, IntroEstatistica, new Horario(List.of(TERCA, QUINTA), 16));
        IntroEstatistica.getTurmas().add(IntroEstatB);
        Turma IntroEstatC = new Turma("C", 1, 0, IntroEstatistica, new Horario(List.of(TERCA, QUINTA), 19));
        IntroEstatistica.getTurmas().add(IntroEstatC);
        Turma LabFisica1A = new Turma("A", 3, 0, LabFisicaI, new Horario(List.of(SEGUNDA),16));
        LabFisicaI.getTurmas().add(LabFisica1A);
        Turma LabFisica1B = new Turma("B", 1, 0, LabFisicaI, new Horario(List.of(SEGUNDA),14));
        LabFisicaI.getTurmas().add(LabFisica1B);
        Turma LabFisica1C = new Turma("C", 2, 0, LabFisicaI, new Horario(List.of(QUINTA),14));
        LabFisicaI.getTurmas().add(LabFisica1C);
        Turma EDA = new Turma("A", 3,0, EstruturaDeDados, new Horario(List.of(QUARTA,SEXTA),14));
        EstruturaDeDados.getTurmas().add(EDA);
        Turma EDB = new Turma("B", 3,0, EstruturaDeDados, new Horario(List.of(QUARTA,SEXTA),16));
        EstruturaDeDados.getTurmas().add(EDB);
        Turma EDC = new Turma("C", 2, 0, EstruturaDeDados, new Horario(List.of(QUARTA,SEXTA), 19));
        EstruturaDeDados.getTurmas().add(EDC);
        Turma CircuitosDigA = new Turma("A", 2, 0, CircuitosDigitais, new Horario(List.of(TERCA,QUINTA), 16));
        CircuitosDigitais.getTurmas().add(CircuitosDigA);
        Turma CircuitosDigB = new Turma("B", 2, 0, CircuitosDigitais, new Horario(List.of(TERCA,QUINTA),19));
        CircuitosDigitais.getTurmas().add(CircuitosDigB);
        Turma CircuitosDigC = new Turma("C", 3, 0, CircuitosDigitais, new Horario(List.of(TERCA,QUINTA),21));
        CircuitosDigitais.getTurmas().add(CircuitosDigC);
        Turma ITNA = new Turma("A", 2, 2, ITN, new Horario(List.of(QUARTA, SEXTA), 10));
        ITN.getTurmas().add(ITNA);
        Turma ITNB = new Turma("B", 1, 0, ITN, new Horario(List.of(QUARTA, SEXTA), 8));
        ITN.getTurmas().add(ITNB);
        Turma ITNC = new Turma("C", 2, 0, ITN, new Horario(List.of(QUARTA, SEXTA), 14));
        ITN.getTurmas().add(ITNC);
        Turma WebDevA = new Turma("A", 3, 0, WebDev, new Horario(List.of(TERCA), 14));
        WebDev.getTurmas().add(WebDevA);
        Turma WebDevB = new Turma("B", 2, 0 , WebDev, new Horario(List.of(QUARTA), 14));
        WebDev.getTurmas().add(WebDevB);


        Turma AlgPratA= new Turma("A", 2,0,algoritmoPratica,new Horario(List.of(TERCA),8));
        algoritmoPratica.getTurmas().add(AlgPratA);
        Turma AlgPratB= new Turma("B", 2,0,algoritmoPratica,new Horario(List.of(TERCA),10));
        algoritmoPratica.getTurmas().add(AlgPratB);
        Turma AlgPratC= new Turma("C", 3,0,algoritmoPratica,new Horario(List.of(QUARTA),14));
        algoritmoPratica.getTurmas().add(AlgPratC);

        Turma ICEA= new Turma("A", 3,0,ICE,new Horario(List.of(TERCA),10));
        ICE.getTurmas().add(ICEA);
        Turma ICEB= new Turma("B", 3,0,ICE,new Horario(List.of(SEGUNDA),10));
        ICE.getTurmas().add(ICEB);

        Turma GASLA= new Turma("A", 3,0,GASL,new Horario(List.of(QUARTA,SEXTA),10));
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

        Turma CalculoNumericoA= new Turma("A", 3,0,CalculoNumerico,new Horario(List.of(QUARTA, SEXTA),10));
        CalculoNumerico.getTurmas().add(CalculoNumericoA);
        Turma CalculoNumericoB= new Turma("B", 3,0,CalculoNumerico,new Horario(List.of(TERCA, QUINTA),16));
        CalculoNumerico.getTurmas().add(CalculoNumericoB);
        Turma CalculoNumericoC= new Turma("C", 3,0,CalculoNumerico,new Horario(List.of(SEGUNDA, QUARTA),14));
        CalculoNumerico.getTurmas().add(CalculoNumericoC);

        Turma EstruturadeDadosIIA= new Turma("A", 3,0,EstruturadeDadosII,new Horario(List.of(QUARTA, SEXTA),16));
        EstruturadeDadosII.getTurmas().add(EstruturadeDadosIIA);
        Turma EstruturadeDadosIIB= new Turma("B", 3,0,EstruturadeDadosII,new Horario(List.of(QUARTA, SEXTA),21));
        EstruturadeDadosII.getTurmas().add(EstruturadeDadosIIB);
        Turma EstruturadeDadosIIC= new Turma("C", 3,0,EstruturadeDadosII,new Horario(List.of(SEGUNDA, QUINTA),14));
        EstruturadeDadosII.getTurmas().add(EstruturadeDadosIIC);

        Turma OrganizacaoComputadoresA= new Turma("A", 3,0,OrganizacaoComputadores,new Horario(List.of(SEGUNDA, QUARTA),14));
        OrganizacaoComputadores.getTurmas().add(OrganizacaoComputadoresA);
        Turma OrganizacaoComputadoresB= new Turma("B", 3,0,OrganizacaoComputadores,new Horario(List.of(TERCA, QUINTA),18));
        OrganizacaoComputadores.getTurmas().add(OrganizacaoComputadoresB);
        Turma OrganizacaoComputadoresC= new Turma("C", 3,0,OrganizacaoComputadores,new Horario(List.of(QUARTA, SEXTA),10));
        OrganizacaoComputadores.getTurmas().add(OrganizacaoComputadoresC);

        Turma ModelagemdeSistemasA= new Turma("A", 3,0,ModelagemdeSistemas,new Horario(List.of(SEGUNDA, QUARTA),8));
        ModelagemdeSistemas.getTurmas().add(ModelagemdeSistemasA);
        Turma ModelagemdeSistemasB= new Turma("B", 3,0,ModelagemdeSistemas,new Horario(List.of(SEGUNDA, QUARTA),10));
        ModelagemdeSistemas.getTurmas().add(ModelagemdeSistemasB);
        Turma ModelagemdeSistemasC= new Turma("C", 3,0,ModelagemdeSistemas,new Horario(List.of(TERCA, QUINTA),8));
        ModelagemdeSistemas.getTurmas().add(ModelagemdeSistemasC);

        Turma EquacoesDiferenciaisA= new Turma("A", 3,0,EquacoesDiferenciais,new Horario(List.of(SEGUNDA, QUARTA),10));
        EquacoesDiferenciais.getTurmas().add(EquacoesDiferenciaisA);
        Turma EquacoesDiferenciaisB= new Turma("B", 3,0,EquacoesDiferenciais,new Horario(List.of(TERCA, SEXTA),8));
        EquacoesDiferenciais.getTurmas().add(EquacoesDiferenciaisB);
        Turma EquacoesDiferenciaisC= new Turma("C", 3,0,EquacoesDiferenciais,new Horario(List.of(QUARTA, SEXTA),16));
        EquacoesDiferenciais.getTurmas().add(EquacoesDiferenciaisC);

        Turma AlgebraLinearA= new Turma("A", 3,0,AlgebraLinear,new Horario(List.of(SEGUNDA, QUARTA),14));
        AlgebraLinear.getTurmas().add(AlgebraLinearA);
        Turma AlgebraLinearB= new Turma("B", 3,0,AlgebraLinear,new Horario(List.of(TERCA, SEXTA),10));
        AlgebraLinear.getTurmas().add(AlgebraLinearB);
        Turma AlgebraLinearC= new Turma("C", 3,0,AlgebraLinear,new Horario(List.of(QUARTA, SEXTA),16));
        AlgebraLinear.getTurmas().add(AlgebraLinearC);

        Turma GameDevA= new Turma("A", 3,0,GameDev,new Horario(List.of(SEGUNDA, QUARTA),16));
        GameDev.getTurmas().add(GameDevA);
        Turma GameDevB= new Turma("B", 3,0,GameDev,new Horario(List.of(TERCA, SEXTA),14));
        GameDev.getTurmas().add(GameDevB);
        Turma GameDevC= new Turma("C", 3,0,GameDev,new Horario(List.of(QUARTA, SEXTA),18));
        GameDev.getTurmas().add(GameDevC);

        Turma InfonaEducacaoA= new Turma("A", 3,0,InfonaEducacao,new Horario(List.of(SEGUNDA, QUARTA),20));
        InfonaEducacao.getTurmas().add(InfonaEducacaoA);
        Turma InfonaEducacaoB= new Turma("B", 3,0,InfonaEducacao,new Horario(List.of(TERCA, SEXTA),16));
        InfonaEducacao.getTurmas().add(InfonaEducacaoB);

        Turma VisuCientificaA= new Turma("A", 3,0,VisuCientifica,new Horario(List.of(TERCA, QUINTA),14));
        VisuCientifica.getTurmas().add(VisuCientificaA);
        Turma VisuCientificaB= new Turma("B", 3,0,VisuCientifica,new Horario(List.of(SEGUNDA, SEXTA),16));
        VisuCientifica.getTurmas().add(VisuCientificaB);

        Turma TeoriadeFilasA= new Turma("A", 3,0,TeoriadeFilas,new Horario(List.of(QUARTA, SEXTA),21));
        TeoriadeFilas.getTurmas().add(TeoriadeFilasA);
        Turma TeoriadeFilasB= new Turma("B", 3,0,TeoriadeFilas,new Horario(List.of(TERCA, QUINTA),10));
        TeoriadeFilas.getTurmas().add(TeoriadeFilasB);

        Turma FisicaIIA= new Turma("A", 3,0,FisicaII,new Horario(List.of(QUARTA, SEXTA),8));
        FisicaII.getTurmas().add(FisicaIIA);
        Turma FisicaIIB= new Turma("B", 3,0,FisicaII,new Horario(List.of(QUARTA, SEXTA),14));
        FisicaII.getTurmas().add(FisicaIIB);
        Turma FisicaIIC= new Turma("C", 3,0,FisicaII,new Horario(List.of(TERCA, QUINTA),10));
        FisicaII.getTurmas().add(FisicaIIC);

        Turma InglesIA= new Turma("A", 3,0,InglesI,new Horario(List.of(QUARTA, SEXTA),19));
        InglesI.getTurmas().add(InglesIA);
        Turma InglesIB= new Turma("B", 3,0,InglesI,new Horario(List.of(TERCA, QUINTA),16));
        InglesI.getTurmas().add(InglesIB);

        Turma LibrasIA= new Turma("A", 3,0,LibrasI,new Horario(List.of(SEGUNDA, QUINTA),14));
        LibrasI.getTurmas().add(LibrasIA);
        Turma LibrasIB= new Turma("B", 3,0,LibrasI,new Horario(List.of(TERCA, SEXTA),16));
        LibrasI.getTurmas().add(LibrasIB);

        Turma InglesIIA= new Turma("A", 3,0,InglesII,new Horario(List.of(SEGUNDA, QUINTA),16));
        InglesII.getTurmas().add(InglesIIA);
        Turma InglesIIB= new Turma("B", 3,0,InglesII,new Horario(List.of(QUARTA, SEXTA),18));
        InglesII.getTurmas().add(InglesIIB);

        Turma LibrasIIA= new Turma("A", 3,0,LibrasII,new Horario(List.of(TERCA, QUINTA),10));
        LibrasII.getTurmas().add(LibrasIIA);
        Turma LibrasIIB= new Turma("B", 3,0,LibrasII,new Horario(List.of(SEGUNDA, QUARTA),18));
        LibrasII.getTurmas().add(LibrasIIB);
    }

    public Map<String, Disciplina> getListaDisciplinas() {
        return listaDisciplinas;
    }
}
