
abstract class Poligono implements Figura {

	private int num_lati;
	
	
	public Poligono(int lato) {
		
		this.num_lati = lato;
	}
	
	public abstract double area();
	
	public int getlato() {
		return this.num_lati;
		
	}
	
		
}
