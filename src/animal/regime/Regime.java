package animal.regime;

import aliment.Aliment;

public abstract class Regime {
	String type;
	String name;
	public abstract void manger(Aliment aliment);
}
