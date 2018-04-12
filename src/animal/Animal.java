package animal;

import animal.regime.Regime;

public abstract class Animal {
	protected int age;
	protected int poids;
	protected int taille;
	protected String nom;
	protected Regime regime;
	public Animal(int age, int poids, int taille, String nom, Regime regime) {
		this.age = age;
		this.poids = poids;
		this.taille = taille;
		this.nom = nom;
		this.regime = regime;
	}
	
}
