package algoritmi;

import stringhe.*;

public class Levenshtein extends CheckString{
	
	private CheckString ch;

	public Levenshtein(CheckString n) {
		super(n);

		this.ch = n;
		super.setNext(this.ch);
	}
	
	public boolean check() {
		System.out.println("Sto processando Levenshtein");
		
		this.setEsito(false);
		
		return super.check();
	}
	
}  