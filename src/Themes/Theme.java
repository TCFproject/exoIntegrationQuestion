package Themes;

import java.util.ArrayList;
import java.util.List;

import Question.Question;

public class Theme {

	private String libelle;
	private List<Question> listQuestion = new ArrayList<>();
	private boolean dispo;

	public Theme(String libelle) {
		// TODO Auto-generated constructor stub
		this.libelle = libelle;
		this.dispo = true;
	}

	public void ajouterQuestion(Question nouvelleQuestion) {
		this.listQuestion.add(nouvelleQuestion);
	}

	public void ajouterQuestion(List<Question> nouvelleQuestion) {
		this.listQuestion.addAll(nouvelleQuestion);
	}

	public void supprimerQuestion(int index) {
		this.listQuestion.remove(index);
	}

	public void setDispo(boolean dispo) {
		this.dispo = dispo;
	}

	public boolean getDispo() {
		return this.dispo;
	}

	public String getLibelle() {
		return libelle;
	}
	
	public List<Question> getListQuestion() {
		return listQuestion;
	}
}
