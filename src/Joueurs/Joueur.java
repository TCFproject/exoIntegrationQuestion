package Joueurs;

import Enum.Etat;

public class Joueur {
	private int numCandidat;
	private String nom;
	private int score;
	private Etat etat;
	
	public Joueur(int numCandidat, String nom, int score, Etat etat) {
		// TODO Auto-generated constructor stub
		this.numCandidat = numCandidat;
		this.nom = nom;
		this.score = score;
		this.etat = etat;
	}
	
	public String présentation() {
		return "Candidat n°"+String.valueOf(this.numCandidat)+
				", nom : "+this.nom+
				", score : "+String.valueOf(score)+
				", est actuellement "+ String.valueOf(this.etat);
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public void setEtat(Etat etat) {
		this.etat = etat;
	}
	
	public Etat getEtat() {
		return etat;
	}
}
