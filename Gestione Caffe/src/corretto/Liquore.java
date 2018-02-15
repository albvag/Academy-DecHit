package corretto;

import caffe.*;

public class Liquore extends Corretto{
	
	private Caffe caf;
	public Liquore(Caffe c) {
		super(c);
		this.caf = c;
	}
	
	public void prepara() {
		
		this.caf.prepara();
		System.out.println("Aggiunta Liquore");
	}
}
