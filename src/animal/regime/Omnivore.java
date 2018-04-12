package animal.regime;

import aliment.Aliment;

public class Omnivore extends Regime{
	public void manger(Aliment aliment) {
		System.out.println("Miam, " + this.nom + " aime bien la nourriture suivante : " + aliment.getName());
	}
	/*public Omnivore(int age, int poids, int taille, String nom) {
	*	super(age, poids, taille, nom);
	}*/
}
