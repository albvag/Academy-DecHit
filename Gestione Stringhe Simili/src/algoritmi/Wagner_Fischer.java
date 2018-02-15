package algoritmi;

import stringhe.*;

public class Wagner_Fischer extends CheckString{

	
	public Wagner_Fischer(CheckString n) {
		super(n);
		
	}
	
	public boolean check() {

		System.out.println("Sto processando Wagner");
		this.setEsito(false);
		return super.check();
	}
	


}
