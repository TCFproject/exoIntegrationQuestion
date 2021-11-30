package Question;

import Exception.MauvaisTypeDeReponseException;
import Exception.OutOfRangeException;

public class QCM extends Question {

	private String[] les3réponses;
	private int NbonneReponse;

	public QCM(String libelle, int niveau, String[] les3réponses, int NbonneReponse) throws OutOfRangeException {
		// TODO Auto-generated constructor stub
		this.libelle = libelle;
		this.niveau = niveau;
		this.les3réponses = les3réponses;
		if (NbonneReponse > 3 || NbonneReponse < 1) {
			throw new OutOfRangeException();
		} else {
			this.NbonneReponse = NbonneReponse;
		}
	}

	@Override
	public boolean repondre(String reponse) throws MauvaisTypeDeReponseException {
		// TODO Auto-generated method stub

		if (this.NbonneReponse == Integer.parseInt(reponse)) {
			System.out.print("Bonne Réponse");
		}else {
			System.out.print("Mauvaise Réponse");
		}
		return this.NbonneReponse == Integer.parseInt(reponse);
	}

	@Override
	public String reponse() {
		// TODO Auto-generated method stub
		return "QCM de niveau "+String.valueOf(this.niveau)+", les réponses sont : " + 
				this.les3réponses[0] + ", " + this.les3réponses[1] + ", "
				+ this.les3réponses[2] + " la bonne est la "+ String.valueOf(this.NbonneReponse);
	}
}
