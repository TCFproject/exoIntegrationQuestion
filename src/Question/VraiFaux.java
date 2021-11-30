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
	public boolean repondre(String reponse) throws MauvaisTypeDeReponseException {
		// TODO Auto-generated method stub
		if (Boolean.getBoolean(reponse) == valide) {
			System.out.print("Bonne Réponse");
		}else {
			System.out.print("Mauvaise Réponse");
		}
		return Boolean.getBoolean(reponse) == valide;
	}

	@Override
	public String reponse() {
		// TODO Auto-generated method stub
		return "Vrai/Faux de niveau "+String.valueOf(this.niveau)+" cette question est : "
				+ String.valueOf(valide);
	}
}
