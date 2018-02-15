
public class Rettangolo extends Quadrilatero {

	private double base, altezza;
	
	public Rettangolo(double base, double altezza) {
		this.base = base;
		this.altezza = altezza;
	}
	public double area() {
		return base*altezza;
	}
}
