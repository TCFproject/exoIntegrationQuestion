package Question;

import Exception.MauvaisTypeDeReponseException;

public abstract class Question {

	protected String libelle;
	protected int niveau;
	
	public abstract String reponse();
	
	public boolean repondre(String reponse) throws MauvaisTypeDeReponseException{
		throw new MauvaisTypeDeReponseException();
	}
}
