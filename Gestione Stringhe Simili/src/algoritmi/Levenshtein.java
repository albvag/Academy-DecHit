package algoritmi;

import stringhe.*;

public class Levenshtein extends CheckString{
	
	public Levenshtein(CheckString n) {
		super(n);

	}
	
	public boolean check() {
		System.out.println("Sto processando Levenshtein");
		
		this.setEsito(false);
		
		return super.check();
	}
	
}  