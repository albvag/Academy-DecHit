package vagoni;

import treno.*;

public class Vagone {

	private char tipo;
	private String descrizione;
	
	public Vagone(Treno treno, char tipo) {
		this.tipo = tipo;
		this.descrizione = "";
	}
	
	public char setTipo(char vag) {
		return this.tipo = vag;
	}
	public char getTipo() {
		return this.tipo;
	}
	
	public String getDesc() {
		return this.descrizione;
	}
	public String setDesc(String desc) {
		return this.descrizione = desc;
	}
		
	public void stampa() {
		System.out.println("TIPO VAGONE: "+this.tipo);
	}
}
