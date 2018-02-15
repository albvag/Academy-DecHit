package corretto;

import caffe.*;

public class Cacao extends Corretto{

	private Caffe caf;
	public Cacao(Caffe c) {
		super(c);
		this.caf = c;
	}
	
	public void prepara() {
		
		this.caf.prepara();
		System.out.println("Aggiunta Cacao");
	}
}
