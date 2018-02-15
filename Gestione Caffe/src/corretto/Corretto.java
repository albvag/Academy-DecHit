package corretto;

import caffe.*;

public class Corretto implements Caffe{

	private Caffe caf;
	
	public Corretto(Caffe c) {
		this.caf = c;
	}
	
	public void prepara() {
		
		this.caf.prepara();
		System.out.println("Caffe Corretto");
		
	}
}
