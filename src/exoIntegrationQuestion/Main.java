package exoIntegrationQuestion;

import Exception.OutOfRangeException;
import Joueurs.Joueur;
import Joueurs.Joueurs;
import Phases.Phases1;
import Question.QCM;
import Question.Question;
import Themes.Themes;

import java.util.ArrayList;
import java.util.List;

import Enum.Etat;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Themes leThemes = new Themes();
		Joueurs lesJoueurs = new Joueurs();
		/**
		 * List<Question> uneListQuestion = new ArrayList<>();
		 * try {
		 *	   uneListQuestion.add(new QCM("A?",2,new String[] {"A","B","C"},1));
		 *	   leThemes.addQuestionTheme(leThemes.getIndiceTheme(), uneListQuestion);
		 * } catch (OutOfRangeException e) { 
		 *	   // TODO Auto-generated catch block
		 *	   e.printStackTrace();
		 * }*/
		Phases1 premierePhase = new Phases1(lesJoueurs, leThemes) ;
		premierePhase.selectionJoueurs();
		premierePhase.déroulementJeu();
	/*************************************************************************************/	
		/**
		 * Joueur unJoueur = new Joueur(1,"A",0,Etat.Attente);
		 * lesJoueurs.selection();
		 * System.out.println(lesJoueurs.afficheJoueurSelectionner());
		 */
	}
}
