package treno;

import java.util.*;

import vagoni.*;

public class Treno {

	private String sigla;

	private ArrayList<Vagone> av = new ArrayList<>();
	
	public Treno(String s) {
		this.sigla = s.toUpperCase();
	}
	
	
	public String setStringa(String s) {
		return this.sigla = s;
	}
	
	public void aggiungiVagone(Vagone v){
		
		this.av.add(v);		
	}
	
	public void stampa(){
		for(int i=0; i<av.size(); i++)
			System.out.println(av.get(i).getDesc());
	}
	
	public char[] analizzaSigla() {


		char[] vett = new char[7];
		for(int i=0; i<sigla.length(); i++) {
			vett[i] = sigla.charAt(i);
			
		}
		return vett;
	}
	
	public void ricercaVagone() {
		
		char[] vett = analizzaSigla();
		
		for(int i=0; i<vett.length; i++) {
			switch(vett[i]) {
			case 'P': {
				aggiungiVagone(new Passeggero(this));
			}break;
			
			case 'H': {
				aggiungiVagone(new Locomotiva(this));
				
			}break;
			
			case 'R': {
				aggiungiVagone(new Ristorante(this));
			}break;
			
			case 'C': {
				aggiungiVagone(new Cargo(this));
			}break;
			
			}
		}
		stampa();
		
	}
		

	
}
