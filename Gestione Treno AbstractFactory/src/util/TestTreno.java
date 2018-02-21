package util;

import concreteFactory.ItaloFactory;
import concreteProduct.Treno;

public class TestTreno {

	public static void main(String[] args) {
		String treno1 = "HPPPPPPR";
		String treno2 = "HPCPRPRC";
		ItaloFactory italo = new ItaloFactory();
		Treno tr1 = italo.creaTreno(treno1);
		Treno tr2 =italo.creaTreno(treno2);
		
		
		
		System.out.println("-----------------");
		System.out.println("Stampo i vagoni del treno "+tr1.getDescrizione()+" "+tr1.getNumTreno());
		System.out.println("-----------------");
		tr1.stampaVagoni();
		System.out.println();
		System.out.println("-----------------");
		System.out.println("Stampo i vagoni del treno "+tr2.getDescrizione()+" "+tr2.getNumTreno());
		System.out.println("-----------------");
		tr2.stampaVagoni();
		
	}

}
