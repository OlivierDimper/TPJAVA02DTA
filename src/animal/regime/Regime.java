package animal.regime;

import aliment.Aliment;

public abstract class Regime {
	String name;
	public abstract void manger(Aliment aliment);
	public Regime(String name) {
		this.name = name;
	}
	
}
