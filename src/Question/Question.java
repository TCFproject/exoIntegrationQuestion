package Question;

public abstract class Question {

	protected String libelle;
	protected int niveau;
	protected String reponse;
	
	public String reponse() {
		return "La question est : "+this.libelle+" de niveau : "+this.niveau;
	};
	
	public abstract void repondre();
}
