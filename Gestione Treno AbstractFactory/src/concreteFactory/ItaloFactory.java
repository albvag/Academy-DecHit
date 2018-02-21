package concreteFactory;

import java.util.ArrayList;
import java.util.Collection;

import concreteProduct.Cargo;
import concreteProduct.Locomotiva;
import concreteProduct.Passeggero;
import concreteProduct.Ristorante;
import concreteProduct.Treno;
import concreteProduct.Vagone;
import factoryInterfaces.TrenoFactory;

public class ItaloFactory implements TrenoFactory {
	
	int numTrenoCreato=0;

	@Override
	public Locomotiva creaLocomotiva() {
		Locomotiva locomotiva = new Locomotiva();
		return locomotiva;
	}

	@Override
	public Cargo creaCargo() {
		Cargo cargo = new Cargo();
		return cargo;
	}

	@Override
	public Passeggero creaPasseggero() {
		Passeggero passeggero = new Passeggero();
		return passeggero;
	}

	@Override
	public Ristorante creaRistorante() {
		Ristorante ristorante = new Ristorante();
		return ristorante;
	}
	
	public Treno creaTreno(String struttura) {
		Collection<Vagone> vagoni = new ArrayList<>();
		for (int i = 0; i < struttura.length(); i++) {
		    char tipo = struttura.charAt(i);
		    switch (tipo) {
			case 'C':{
				vagoni.add(creaCargo());
			}break;
			case 'H':{
				vagoni.add(creaLocomotiva());
			}break;
			case 'R':{
				vagoni.add(creaRistorante());
			}break;
			case 'P':{
				vagoni.add(creaPasseggero());
			}break;
			}
		}
		numTrenoCreato++;
		Treno tr = new Treno ("Italo",vagoni,numTrenoCreato);
		return tr;
		
	}
}
