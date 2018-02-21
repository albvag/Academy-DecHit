package factoryInterfaces;

import concreteProduct.*;

public interface TrenoFactory {
	
	public Locomotiva creaLocomotiva();
	public Cargo creaCargo();
	public Passeggero creaPasseggero();
	public Ristorante creaRistorante();

}
