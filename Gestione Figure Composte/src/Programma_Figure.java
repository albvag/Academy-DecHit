public class Programma_Figure {

	public static void main(String[] args) {

		Figura r1 = new Rettangolo(2,5);
		Figura t1 = new Triangolo(2,2);
		Figura c1 = new Cerchio(3);
			
		FiguraComposta fc1 = new FiguraComposta();
		fc1.add(r1);
		fc1.add(t1);
		fc1.add(c1);
		
		System.out.println("area r1: "+r1.area() + 
				  "\narea t1: "+t1.area() + 
				  "\narea c1: "+c1.area() +
				  "\narea totale: "+ fc1.area());
	}

}
