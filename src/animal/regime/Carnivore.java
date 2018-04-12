package animal.regime;

import aliment.Aliment;
import animal.Animal;

public class Carnivore extends Regime {
	public void manger(Aliment aliment) {
		if (aliment.getType() == "Viande") {
			System.out.println("Miam, j'aime bien la nourriture suivante : " + aliment.getName());
		} else {
			System.out.println("Beark, pas bon : " + aliment.getName());
		}
	}
	public Carnivore() {
		super("Carnivore");
	}

	public void manger(Animal animal) {
		System.out.println("Miam, j'aime bien la nourriture suivante : " + animal.getNom());
	}
}