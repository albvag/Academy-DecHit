package corretto;

import caffe.*;

public class Latte extends Corretto {

	private Caffe caf;
	public Latte(Caffe c) {
		super(c);
		this.caf = c;
	}
	
	public void prepara() {
		
		this.caf.prepara();
		System.out.println("Aggiunta Latte");
	}
}
