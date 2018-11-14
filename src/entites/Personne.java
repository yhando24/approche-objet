package entites;

public class Personne {
	
	public String nom = "";
	public String prenom = "";
	public AdressePostale adresse = new AdressePostale("Rue des Flamants Bleues", "Paris", "75020");
	
	
	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}


	public Personne(String nom, String prenom, AdressePostale adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}
	
}




