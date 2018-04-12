package animal.regime;

import aliment.Aliment;
import animal.Animal;

public class Herbivore extends Regime{
	public void manger(Aliment aliment) {
		if (aliment.getType() == "Herbe") {
			System.out.println("Miam, j'aime bien la nourriture suivante : " + aliment.getName());
		} else {
			System.out.println("Beark, pas bon : " + aliment.getName());
		}
	}
	public Herbivore() {
		super("Herbivore");
	}

	public void manger(Animal animal) {
		System.out.println("Beark, pas bon : " + animal.getNom());
	}
}
