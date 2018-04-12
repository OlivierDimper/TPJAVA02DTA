package animal.regime;

import aliment.Aliment;

public class Carnivore extends Regime {
	public void manger(Aliment aliment) {
		if (aliment.getType() == "Viande") {
			System.out.println("Miam, j'aime bien la nourriture suivante : " + aliment.getName());
		}
	}
	public Carnivore() {
		super("Carnivore");
	}
}