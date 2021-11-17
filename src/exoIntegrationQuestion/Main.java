package exoIntegrationQuestion;

import Exception.OutOfRangeException;
import Joueurs.Joueurs;
import Question.QCM;
import Question.Question;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Question lesQuestion = new QCM("A?",2,new String[] {"A","B","C"},1);
			
		} catch (OutOfRangeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	/*************************************************************************************/	
		Joueurs lesJoueurs = new Joueurs();
		lesJoueurs.selection();
		System.out.println(lesJoueurs.afficheJoueurSelectionner());

	}
}
