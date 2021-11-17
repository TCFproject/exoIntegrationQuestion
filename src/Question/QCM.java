package Question;

import Exception.MauvaisTypeDeReponseException;
import Exception.OutOfRangeException;

public class QCM extends Question {

	private String[] les3reponses;
	private int NbonneReponse;

	public QCM(String libelle, int niveau, String[] les3reponses, int NbonneReponse) throws OutOfRangeException {
		// TODO Auto-generated constructor stub
		this.libelle = libelle;
		this.niveau = niveau;
		this.les3reponses = les3reponses;
		if (NbonneReponse > 3 || NbonneReponse < 1) {
			throw new OutOfRangeException();
		} else {
			this.NbonneReponse = NbonneReponse;
		}
	}

	@Override
	public void repondre(int reponse) throws MauvaisTypeDeReponseException {
		// TODO Auto-generated method stub
		if (this.NbonneReponse == reponse) {
			System.out.print("Bonne Reponse");
		} else {
			System.out.print("Mauvaise Reponse");
		}
	}

	@Override
	public String reponse() {
		// TODO Auto-generated method stub
		return "QCM de niveau "+String.valueOf(this.niveau)+", les r�ponses sont : " + 
				this.les3reponses[0] + ", " + this.les3reponses[1] + ", "
				+ this.les3reponses[2] + " la bonne est la "+ String.valueOf(this.NbonneReponse);
	}
}
