package entites;

public class AdressePostale {
	
	int numero = 1;
	private String rue = "";
	private String ville = "";
	private String CodePostal = "";
	
	
	public AdressePostale() {};
	
	
	
	public AdressePostale(String rue, String ville, String CodePostal) {
		this.rue = rue;
		this.ville = ville;
		this.CodePostal = CodePostal;
	}



	public int getNumero() {
		return numero;
	}



	public void setNumero(int numero) {
		this.numero = numero;
	}



	public String getRue() {
		return rue;
	}



	public void setRue(String rue) {
		this.rue = rue;
	}



	public String getVille() {
		return ville;
	}



	public void setVille(String ville) {
		this.ville = ville;
	}



	public String getCodePostal() {
		return CodePostal;
	}



	public void setCodePostal(String codePostal) {
		CodePostal = codePostal;
	}
	
	
	
}
