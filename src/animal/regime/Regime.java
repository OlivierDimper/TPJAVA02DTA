package animal.regime;

import aliment.Aliment;
import animal.Animal;

public abstract class Regime {
	String name;
	public abstract void manger(Aliment aliment);
	public abstract void manger(Animal animal);
	public Regime(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
