package Question;

import Exception.MauvaisTypeDeReponseException;

public class ReponseCourte extends Question {

	private String reponse;
	public ReponseCourte(String libelle, int niveau, String reponse) {
		// TODO Auto-generated constructor stub
		this.libelle = libelle;
		this.niveau = niveau;
		this.reponse = reponse;
	}
	
	@Override
	public void repondre(String reponse) throws MauvaisTypeDeReponseException {
		// TODO Auto-generated method stub
		if (this.reponse.equals(reponse)) {
			System.out.print("Bonne Reponse");
		}else {
			System.out.print("Mauvaise Reponse");
		}
	}

	@Override
	public String reponse() {
		// TODO Auto-generated method stub
		return "Reponse courte de niveau "+String.valueOf(this.niveau)+ " la reponse est : "
				+this.reponse;
	}
}
