package animal.regime;

import aliment.Aliment;

public class Carnivore extends Regime {
	public void manger(Aliment aliment) {
		if (aliment.getType() == "Viande") {
			System.out.println("Miam, " + this.nom + " aime bien la nourriture suivante : " + aliment.getName());
		}
	}
	public Carnivore(int age, int poids, int taille, String nom) {
		super(age, poids, taille, nom);
	}
}