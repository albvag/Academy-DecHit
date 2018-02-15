import java.util.*;

public class FiguraComposta implements Figura {

	private ArrayList<Figura> FigC = new ArrayList<>();
	private double area_figura_composta = 0;
	
	public FiguraComposta() {
		
	}
	
	public double area() {
		
		for(Figura f: FigC) {
			area_figura_composta = area_figura_composta + f.area();
		}
		
		return area_figura_composta;
	}
	public void add(Figura f) {
		this.FigC.add(f);
	}
	
}
