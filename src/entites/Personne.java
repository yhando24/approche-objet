package entites;

import java.util.Calendar;

public class Personne {
	
	private String nom = "";
	private String prenom = "";
	private AdressePostale adresse = new AdressePostale("Rue des Flamants Bleues", "Paris", "75020");
	private int anneeNaissance;
	
	
	public Personne() {
	}
	
	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}


	public Personne(String nom, String prenom, AdressePostale adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}
	

	
	
	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public AdressePostale getAdresse() {
		return adresse;
	}


	public void setAdresse(AdressePostale adresse) {
		this.adresse = adresse;
	}


	public int getAnneeNaissance() {
		return anneeNaissance;
	}


	public void setAnneeNaissance(int anneeNaissance) {
		this.anneeNaissance = anneeNaissance;
	}


	public  void tostring() {
		System.out.println("nom => " + this.nom.toUpperCase() + " prenom => " + this.prenom);
		
	}
	
	
	
	
	/**
	 * Methode qui trouve l'année actuelle grace a la Classe Calendar et retourne l'age de la personne
	 * @return l'age de la personne
	 */
	
	public int  getAge() {
		Calendar c = Calendar.getInstance();
		 int year = c.get(Calendar.YEAR);
		 return year - this.anneeNaissance;
	}
}









