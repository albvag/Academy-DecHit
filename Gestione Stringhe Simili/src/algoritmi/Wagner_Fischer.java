package algoritmi;

import stringhe.*;

public class Wagner_Fischer extends CheckString{

	private CheckString ch;
	
	public Wagner_Fischer(CheckString n) {
		super(n);
		this.ch = n;
		
		super.setNext(this.ch);
	}
	
	public boolean check() {

		System.out.println("Sto processando Wagner");
		this.setEsito(false);
		return super.check();
	}
	


}
