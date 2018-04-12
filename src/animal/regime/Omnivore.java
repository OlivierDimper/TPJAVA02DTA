package animal.regime;

import aliment.Aliment;
import animal.Animal;

public class Omnivore extends Regime{
	public void manger(Aliment aliment) {
		System.out.println("Miam, j'aime bien la nourriture suivante : " + aliment.getName());
	}
	
	public void manger(Animal animal) {
		System.out.println("Miam, j'aime bien la nourriture suivante : " + animal.getNom());
	}
	
	public Omnivore() {
		super("Omnivore");
	}
}
