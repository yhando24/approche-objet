package entites;

public class AdressePostale {
	
	int numero = 1;
	public String rue = "";
	public String ville = "";
	public String CodePostal = "";
	
	
	public AdressePostale() {};
	
	
	
	public AdressePostale(String rue, String ville, String CodePostal) {
		this.rue = rue;
		this.ville = ville;
		this.CodePostal = CodePostal;
	}
	
}
