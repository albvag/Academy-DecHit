package vagoni;

import treno.Treno;

public class Cargo extends Vagone {
		
	public Cargo(Treno tr) {
		
		super(tr, 'C');
		
		super.setDesc("Cargo");
	}
}
