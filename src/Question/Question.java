package Question;

import Exception.MauvaisTypeDeReponseException;

public abstract class Question {

	protected String libelle;
	protected int niveau;
	
	public abstract String reponse();
	public String getLibelle() {
		return libelle;
	}
	public boolean repondre(String reponse) throws MauvaisTypeDeReponseException{
		throw new MauvaisTypeDeReponseException();
	}
}
