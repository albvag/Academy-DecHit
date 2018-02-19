package vagoni;

import treno.*;

public class Passeggero extends Vagone {	
		
	public Passeggero(Treno tr) {
		
		super(tr, 'P');
		
		super.setDesc("Passeggero");
	}

}
