package Themes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Question.Question;

public class Themes {
	private List<Theme> listThemes = new ArrayList<>();

	public Themes() {
		// TODO Auto-generated constructor stub
		this.listThemes.add(new Theme("Histoire"));
		this.listThemes.add(new Theme("Sport"));
		this.listThemes.add(new Theme("Science"));
		this.listThemes.add(new Theme("Art"));
		this.listThemes.add(new Theme("Mode"));
		this.listThemes.add(new Theme("Nature"));
		this.listThemes.add(new Theme("Film"));
		this.listThemes.add(new Theme("Serie"));
		this.listThemes.add(new Theme("Manga"));
		this.listThemes.add(new Theme("Comics"));
	}

	public int getIndiceTheme() {
		System.out.print("Donner un theme : ");
		Scanner obj = new Scanner(System.in);
		String read = obj.nextLine();
		Theme reschTheme = null;
		for (Theme theme : listThemes) {
			if (theme.getLibelle().equals(read)) {
				reschTheme = theme;
			}
		}
		return this.listThemes.indexOf(reschTheme);
	}

	public Theme getUnTheme(int unTheme) {
		return this.listThemes.get(unTheme);
	}

	public void addQuestionTheme(int index, Question question) {
		this.listThemes.get(index).ajouterQuestion(question);
	}

	public void addQuestionTheme(int index, List<Question> question) {
		this.listThemes.get(index).ajouterQuestion(question);
	}

	public String lesThemes() {
		StringBuilder sb = new StringBuilder();
		for (Theme theme : this.listThemes) {
			sb.append(String.valueOf(this.listThemes.indexOf(theme)+1) + "-" + theme.getLibelle() + "\n");
		}
		return "Les themes sont :\n" + sb.toString();
	}
}
