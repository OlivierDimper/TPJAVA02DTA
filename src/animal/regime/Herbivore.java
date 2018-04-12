package animal.regime;

import aliment.Aliment;
import animal.Animal;

public class Herbivore extends Regime{
	public void manger(Aliment aliment) {
		if (aliment.getType() == "Herbe") {
			System.out.println("Miam, " + this.nom + " aime bien la nourriture suivante : " + aliment.getName());
		}
	}
	public Herbivore(int age, int poids, int taille, String nom) {
		super(age, poids, taille, nom);
	}
}
