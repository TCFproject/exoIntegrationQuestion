package Phases;

import java.util.Random;

import Interfaces.Phase;
import Joueurs.Joueur;
import Joueurs.Joueurs;
import Question.Question;
import Themes.Theme;
import Themes.Themes;

public class Phases1 implements Phase {
	
	private Joueurs lesParticipants;
	private Themes lesThemes;
	
	public Phases1(Joueurs lesParticipants, Themes lesThemes) {
		// TODO Auto-generated constructor stub
		this.lesParticipants = lesParticipants;
		this.lesThemes = lesThemes;
	}
	
	@Override
	public void selectionJoueurs() {
		// TODO Auto-generated method stub
		this.lesParticipants.selection();
		System.out.println(this.lesParticipants.afficheJoueurSelectionner());
	}

	@Override
	public void déroulementJeu() {
		// TODO Auto-generated method stub
		
		Random r = new Random();
		Theme unTheme = this.lesThemes.getUnTheme(r.nextInt(9));
		unTheme.setDispo(false);
		System.out.println(unTheme.getLibelle());
		for (Joueur joueurs : this.lesParticipants.listSelectionner()) {
			System.out.println("Le joueur "+joueurs.getNom()+" commence");
		}
	}

}
