package animal.regime;

import aliment.Aliment;

public class Herbivore extends Regime{
	public void manger(Aliment aliment) {
		if (aliment.getType() == "Herbe") {
			System.out.println("Miam, j'aime bien la nourriture suivante : " + aliment.getName());
		}
	}
	public Herbivore() {
		super("Herbivore");
	}
}
