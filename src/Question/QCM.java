package Question;

import Exception.MauvaisTypeDeReponseException;
import Exception.OutOfRangeException;

public class QCM extends Question {

	private String[] les3r�ponses;
	private int NbonneReponse;

	public QCM(String libelle, int niveau, String[] les3r�ponses, int NbonneReponse) throws OutOfRangeException {
		// TODO Auto-generated constructor stub
		this.libelle = libelle;
		this.niveau = niveau;
		this.les3r�ponses = les3r�ponses;
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
			System.out.print("Bonne R�ponse");
		}else {
			System.out.print("Mauvaise R�ponse");
		}
		return this.NbonneReponse == Integer.parseInt(reponse);
	}

	@Override
	public String reponse() {
		// TODO Auto-generated method stub
		return "QCM de niveau "+String.valueOf(this.niveau)+", les r�ponses sont : " + 
				this.les3r�ponses[0] + ", " + this.les3r�ponses[1] + ", "
				+ this.les3r�ponses[2] + " la bonne est la "+ String.valueOf(this.NbonneReponse);
	}
}
