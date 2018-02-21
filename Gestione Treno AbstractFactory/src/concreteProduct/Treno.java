package concreteProduct;

import java.util.ArrayList;
import productInterfaces.TrenoIF;
import java.util.Collection;


public class Treno implements TrenoIF {
	
	private String descrizione;
	private Collection<Vagone> vagoni;
	private int numTreno;
	
	public Treno (String descrizione, Collection<Vagone> vagoni) {
		this.vagoni= new ArrayList<>();
		this.descrizione=descrizione;
		this.vagoni.addAll(vagoni);
	}
	
	public Treno (String descrizione, Collection<Vagone> vagoni, int numTrenoCreato) {
		this.numTreno=numTrenoCreato;
		this.vagoni= new ArrayList<>();
		this.descrizione=descrizione;
		this.vagoni.addAll(vagoni);
	}

	public String getDescrizione() {
		return descrizione;
	}

	public Collection<Vagone> getVagoni() {
		return vagoni;
	}
	
	public int getNumTreno() {
		return numTreno;
	}

	public void stampaVagoni() {
		for (Vagone vagone : vagoni) {
			System.out.println(vagone.getSigla()+": "+vagone.getDescrizione());
		}
	}

}
