package vagoni;

import treno.Treno;

public class Ristorante extends Vagone {

	public Ristorante(Treno tr) {
		
		super(tr, 'R');
		
		super.setDesc("Ristorante");
	}	
}
