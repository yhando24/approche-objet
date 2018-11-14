package essais;

import entites.Personne;
import entites.AdressePostale;

public class TestPersonne {

	public static void main(String[] args) {
	
		Personne personne1 = new Personne("Handoura", "Youcef");
		
		personne1.adresse.CodePostal = "34000";
		
		Personne personne2 = new Personne("Mangata", "Michel", new AdressePostale("Rue jean Moulin", "Toulouse","12000"));
		
	

		
		



	}

}
