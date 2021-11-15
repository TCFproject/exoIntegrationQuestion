package Question;

public class ReponseCourte extends Question {

	public ReponseCourte(String libelle, int niveau, String reponse) {
		// TODO Auto-generated constructor stub
		this.libelle = libelle;
		this.niveau = niveau;
		this.reponse = reponse;
	}
	
	@Override
	public void repondre() {
		// TODO Auto-generated method stub

		System.out.println("Réponse courte");
	}

}
