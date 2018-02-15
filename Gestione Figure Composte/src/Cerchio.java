public class Cerchio implements Figura{
	
	private double raggio;
	public Cerchio(double raggio) {
		this.raggio = raggio;
	}

	public double area() {
		
		return raggio*raggio*Math.PI;
	}
}
