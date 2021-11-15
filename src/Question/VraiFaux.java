package Question;

import Exception.MauvaisTypeDeReponseException;
import Exception.OutOfRangeException;

public class VraiFaux extends Question {

	private boolean valide;
	
	public VraiFaux(String libelle, int niveau, boolean valide) throws OutOfRangeException {
		// TODO Auto-generated constructor stub
		this.libelle = libelle;
		this.niveau = niveau;
		this.valide = valide;
	}
	
	@Override
	public void repondre(boolean reponse) throws MauvaisTypeDeReponseException {
		// TODO Auto-generated method stub
		if (reponse == valide) {
			System.out.print("Bonne Réponse");
		}else {
			System.out.print("Mauvaise Réponse");
		}
	}

	@Override
	public String reponse() {
		// TODO Auto-generated method stub
		return "Vrai/Faux de niveau "+String.valueOf(this.niveau)+" cette question est : "
				+ String.valueOf(valide);
	}
}
