package essais;

import entites.Personne;
import entites.AdressePostale;

public class TestPersonne {

	public static void main(String[] args) {
	
		Personne personne1 = new Personne("Handoura", "Youcef");
		AdressePostale adresse = personne1.getAdresse();
		adresse.setCodePostal("34000");
		personne1.setAdresse(adresse);
		
		Personne personne2 = new Personne("Mangata", "Michel", new AdressePostale("Rue jean Moulin", "Toulouse","12000"));
		
		personne2.tostring();

		personne1.setAdresse(new AdressePostale("Rue des Anges", "Marseille", "13250"));
		personne1.setAnneeNaissance(1989);
		
		// Affichage de l'age de la personne 1: :
		System.out.println(personne1.getAge());
		


	}

}
