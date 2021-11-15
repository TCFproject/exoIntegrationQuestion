package Question;

public class QCM extends Question {

	public QCM(String libelle, int niveau, String reponse) {
		// TODO Auto-generated constructor stub
		this.libelle = libelle;
		this.niveau = niveau;
		this.reponse = reponse;
	}

	@Override
	public void repondre() {
		// TODO Auto-generated method stub
		System.out.println("Donner une réponse entre a ou b ou c");
	}
}
