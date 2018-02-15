package caffe;

import corretto.*;

public class Programma_Caffe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caffe c = new Moka();
		Caffe corr = new Corretto(c);
		Caffe latte = new Latte(corr);
		
		latte.prepara();
	}

}
