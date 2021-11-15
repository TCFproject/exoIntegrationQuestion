package exoIntegrationQuestion;

import java.util.ArrayList;
import java.util.List;

import Question.Question;

public class Themes {
	private String themes;
	private List<Question> listQuestion = new ArrayList<>();
	
	public Themes(String themes) {
		// TODO Auto-generated constructor stub
		this.themes = themes;
	}
	
	public void ajouterQuestion(Question nouvelleQuestion) {
		this.listQuestion.add(nouvelleQuestion);
	}
	
	public void supprimerQuestion(int index) {
		this.listQuestion.remove(index);
	}
}
