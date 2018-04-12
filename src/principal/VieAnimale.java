package principal;

import aliment.Aliment;
import animal.animals.Homme;
import animal.animals.Lapin;

public class VieAnimale {

	public static void main(String[] args) {
		Homme pierre = new Homme(18, 75, 130);
		pierre.description();
		
		Aliment biche = new Aliment("Viande", "Biche");
		pierre.manger(biche);
		
		Lapin panpan = new Lapin(4, 5, 20);
		panpan.description();
		
		panpan.manger(biche);
		
		pierre.manger(panpan);
	}
}
