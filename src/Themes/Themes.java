package Themes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Exception.OutOfRangeException;
import Question.QCM;
import Question.Question;
import Question.ReponseCourte;
import Question.VraiFaux;

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
		
		this.addQuestionTheme();
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
			sb.append(String.valueOf(this.listThemes.indexOf(theme) + 1) + "-" + theme.getLibelle() + "\n");
		}
		return "Les themes sont :\n" + sb.toString();
	}

	/*************************************************************************************************/

	private Theme getThemeString(String libelleTheme) {
		for (Theme theme : listThemes) {
			if (theme.getLibelle().equals(libelleTheme)) {
				return theme;
			}
		}
		return null;
		/*int index = this.listThemes.indexOf(libelleTheme);
		return this.listThemes.get(index);*/
	}

	private void addQuestionTheme() {

		List<Question> uneListQuestionSport = new ArrayList<>();
		List<Question> uneListQuestionHistoire = new ArrayList<>();
		List<Question> uneListQuestionScience = new ArrayList<>();
		List<Question> uneListQuestionArt = new ArrayList<>();
		List<Question> uneListQuestionMode = new ArrayList<>();
		List<Question> uneListQuestionNature = new ArrayList<>();
		List<Question> uneListQuestionFilm = new ArrayList<>();
		List<Question> uneListQuestionSerie = new ArrayList<>();
		List<Question> uneListQuestionManga = new ArrayList<>();
		List<Question> uneListQuestionComics = new ArrayList<>();

		try {

			uneListQuestionSport.add(new QCM("Question1", 1, new String[] { "A", "B", "C" }, 1));
			uneListQuestionSport.add(new QCM("Question2_Theme1", 1, new String[] { "A", "B", "C" }, 2));
			uneListQuestionSport.add(new QCM("Question3_Theme1", 1, new String[] { "A", "B", "C" }, 3));

			uneListQuestionSport.add(new QCM("Question1", 2, new String[] { "A", "B", "C" }, 1));
			uneListQuestionSport.add(new QCM("Question2_Theme1", 2, new String[] { "A", "B", "C" }, 2));
			uneListQuestionSport.add(new QCM("Question3_Theme1", 2, new String[] { "A", "B", "C" }, 3));

			uneListQuestionSport.add(new QCM("Question1", 3, new String[] { "A", "B", "C" }, 1));
			uneListQuestionSport.add(new QCM("Question2_Theme1", 3, new String[] { "A", "B", "C" }, 2));
			uneListQuestionSport.add(new QCM("Question3_Theme1", 3, new String[] { "A", "B", "C" }, 3));

			uneListQuestionSport.add(new VraiFaux("Question1", 1, true));
			uneListQuestionSport.add(new VraiFaux("Question2", 1, false));
			uneListQuestionSport.add(new VraiFaux("Question3", 1, true));

			uneListQuestionSport.add(new VraiFaux("Question1", 2, true));
			uneListQuestionSport.add(new VraiFaux("Question2", 2, false));
			uneListQuestionSport.add(new VraiFaux("Question3", 2, true));

			uneListQuestionSport.add(new VraiFaux("Question1", 3, true));
			uneListQuestionSport.add(new VraiFaux("Question2", 3, false));
			uneListQuestionSport.add(new VraiFaux("Question3", 3, true));

			uneListQuestionSport.add(new ReponseCourte("Question1", 1, "R�ponseA"));
			uneListQuestionSport.add(new ReponseCourte("Question2", 1, "R�ponseB"));
			uneListQuestionSport.add(new ReponseCourte("Question3", 1, "R�ponseC"));

			uneListQuestionSport.add(new ReponseCourte("Question1", 2, "R�ponseA"));
			uneListQuestionSport.add(new ReponseCourte("Question2", 2, "R�ponseB"));
			uneListQuestionSport.add(new ReponseCourte("Question3", 2, "R�ponseC"));

			uneListQuestionSport.add(new ReponseCourte("Question1", 3, "R�ponseA"));
			uneListQuestionSport.add(new ReponseCourte("Question2", 3, "R�ponseB"));
			uneListQuestionSport.add(new ReponseCourte("Question3", 3, "R�ponseC"));

			this.getThemeString("Sport").ajouterQuestion(uneListQuestionSport);

/******************************************************************************************************/

			uneListQuestionHistoire.add(new QCM("Question1", 1, new String[] { "A", "B", "C" }, 1));
			uneListQuestionHistoire.add(new QCM("Question2_Theme1", 1, new String[] { "A", "B", "C" }, 2));
			uneListQuestionHistoire.add(new QCM("Question3_Theme1", 1, new String[] { "A", "B", "C" }, 3));

			uneListQuestionHistoire.add(new QCM("Question1", 2, new String[] { "A", "B", "C" }, 1));
			uneListQuestionHistoire.add(new QCM("Question2_Theme1", 2, new String[] { "A", "B", "C" }, 2));
			uneListQuestionHistoire.add(new QCM("Question3_Theme1", 2, new String[] { "A", "B", "C" }, 3));

			uneListQuestionHistoire.add(new QCM("Question1", 3, new String[] { "A", "B", "C" }, 1));
			uneListQuestionHistoire.add(new QCM("Question2_Theme1", 3, new String[] { "A", "B", "C" }, 2));
			uneListQuestionHistoire.add(new QCM("Question3_Theme1", 3, new String[] { "A", "B", "C" }, 3));

			uneListQuestionHistoire.add(new VraiFaux("Question1", 1, true));
			uneListQuestionHistoire.add(new VraiFaux("Question2", 1, false));
			uneListQuestionHistoire.add(new VraiFaux("Question3", 1, true));

			uneListQuestionHistoire.add(new VraiFaux("Question1", 2, true));
			uneListQuestionHistoire.add(new VraiFaux("Question2", 2, false));
			uneListQuestionHistoire.add(new VraiFaux("Question3", 2, true));

			uneListQuestionHistoire.add(new VraiFaux("Question1", 3, true));
			uneListQuestionHistoire.add(new VraiFaux("Question2", 3, false));
			uneListQuestionHistoire.add(new VraiFaux("Question3", 3, true));

			uneListQuestionHistoire.add(new ReponseCourte("Question1", 1, "R�ponseA"));
			uneListQuestionHistoire.add(new ReponseCourte("Question2", 1, "R�ponseB"));
			uneListQuestionHistoire.add(new ReponseCourte("Question3", 1, "R�ponseC"));

			uneListQuestionHistoire.add(new ReponseCourte("Question1", 2, "R�ponseA"));
			uneListQuestionHistoire.add(new ReponseCourte("Question2", 2, "R�ponseB"));
			uneListQuestionHistoire.add(new ReponseCourte("Question3", 2, "R�ponseC"));

			uneListQuestionHistoire.add(new ReponseCourte("Question1", 3, "R�ponseA"));
			uneListQuestionHistoire.add(new ReponseCourte("Question2", 3, "R�ponseB"));
			uneListQuestionHistoire.add(new ReponseCourte("Question3", 3, "R�ponseC"));

			this.getThemeString("Histoire").ajouterQuestion(uneListQuestionHistoire);

/*******************************************************************************************************/

			uneListQuestionScience.add(new QCM("Question1", 1, new String[] { "A", "B", "C" }, 1));
			uneListQuestionScience.add(new QCM("Question2_Theme1", 1, new String[] { "A", "B", "C" }, 2));
			uneListQuestionScience.add(new QCM("Question3_Theme1", 1, new String[] { "A", "B", "C" }, 3));

			uneListQuestionScience.add(new QCM("Question1", 2, new String[] { "A", "B", "C" }, 1));
			uneListQuestionScience.add(new QCM("Question2_Theme1", 2, new String[] { "A", "B", "C" }, 2));
			uneListQuestionScience.add(new QCM("Question3_Theme1", 2, new String[] { "A", "B", "C" }, 3));

			uneListQuestionScience.add(new QCM("Question1", 3, new String[] { "A", "B", "C" }, 1));
			uneListQuestionScience.add(new QCM("Question2_Theme1", 3, new String[] { "A", "B", "C" }, 2));
			uneListQuestionScience.add(new QCM("Question3_Theme1", 3, new String[] { "A", "B", "C" }, 3));

			uneListQuestionScience.add(new VraiFaux("Question1", 1, true));
			uneListQuestionScience.add(new VraiFaux("Question2", 1, false));
			uneListQuestionScience.add(new VraiFaux("Question3", 1, true));

			uneListQuestionScience.add(new VraiFaux("Question1", 2, true));
			uneListQuestionScience.add(new VraiFaux("Question2", 2, false));
			uneListQuestionScience.add(new VraiFaux("Question3", 2, true));

			uneListQuestionScience.add(new VraiFaux("Question1", 3, true));
			uneListQuestionScience.add(new VraiFaux("Question2", 3, false));
			uneListQuestionScience.add(new VraiFaux("Question3", 3, true));

			uneListQuestionScience.add(new ReponseCourte("Question1", 1, "R�ponseA"));
			uneListQuestionScience.add(new ReponseCourte("Question2", 1, "R�ponseB"));
			uneListQuestionScience.add(new ReponseCourte("Question3", 1, "R�ponseC"));

			uneListQuestionScience.add(new ReponseCourte("Question1", 2, "R�ponseA"));
			uneListQuestionScience.add(new ReponseCourte("Question2", 2, "R�ponseB"));
			uneListQuestionScience.add(new ReponseCourte("Question3", 2, "R�ponseC"));

			uneListQuestionScience.add(new ReponseCourte("Question1", 3, "R�ponseA"));
			uneListQuestionScience.add(new ReponseCourte("Question2", 3, "R�ponseB"));
			uneListQuestionScience.add(new ReponseCourte("Question3", 3, "R�ponseC"));

			this.getThemeString("Science").ajouterQuestion(uneListQuestionScience);

/********************************************************************************************************/
			uneListQuestionArt.add(new QCM("Question1", 1, new String[] { "A", "B", "C" }, 1));
			uneListQuestionArt.add(new QCM("Question2_Theme1", 1, new String[] { "A", "B", "C" }, 2));
			uneListQuestionArt.add(new QCM("Question3_Theme1", 1, new String[] { "A", "B", "C" }, 3));

			uneListQuestionArt.add(new QCM("Question1", 2, new String[] { "A", "B", "C" }, 1));
			uneListQuestionArt.add(new QCM("Question2_Theme1", 2, new String[] { "A", "B", "C" }, 2));
			uneListQuestionArt.add(new QCM("Question3_Theme1", 2, new String[] { "A", "B", "C" }, 3));

			uneListQuestionArt.add(new QCM("Question1", 3, new String[] { "A", "B", "C" }, 1));
			uneListQuestionArt.add(new QCM("Question2_Theme1", 3, new String[] { "A", "B", "C" }, 2));
			uneListQuestionArt.add(new QCM("Question3_Theme1", 3, new String[] { "A", "B", "C" }, 3));

			uneListQuestionArt.add(new VraiFaux("Question1", 1, true));
			uneListQuestionArt.add(new VraiFaux("Question2", 1, false));
			uneListQuestionArt.add(new VraiFaux("Question3", 1, true));

			uneListQuestionArt.add(new VraiFaux("Question1", 2, true));
			uneListQuestionArt.add(new VraiFaux("Question2", 2, false));
			uneListQuestionArt.add(new VraiFaux("Question3", 2, true));

			uneListQuestionArt.add(new VraiFaux("Question1", 3, true));
			uneListQuestionArt.add(new VraiFaux("Question2", 3, false));
			uneListQuestionArt.add(new VraiFaux("Question3", 3, true));

			uneListQuestionArt.add(new ReponseCourte("Question1", 1, "R�ponseA"));
			uneListQuestionArt.add(new ReponseCourte("Question2", 1, "R�ponseB"));
			uneListQuestionArt.add(new ReponseCourte("Question3", 1, "R�ponseC"));

			uneListQuestionArt.add(new ReponseCourte("Question1", 2, "R�ponseA"));
			uneListQuestionArt.add(new ReponseCourte("Question2", 2, "R�ponseB"));
			uneListQuestionArt.add(new ReponseCourte("Question3", 2, "R�ponseC"));

			uneListQuestionArt.add(new ReponseCourte("Question1", 3, "R�ponseA"));
			uneListQuestionArt.add(new ReponseCourte("Question2", 3, "R�ponseB"));
			uneListQuestionArt.add(new ReponseCourte("Question3", 3, "R�ponseC"));

			this.getThemeString("Art").ajouterQuestion(uneListQuestionArt);

/*******************************************************************************************************/
			uneListQuestionMode.add(new QCM("Question1", 1, new String[] { "A", "B", "C" }, 1));
			uneListQuestionMode.add(new QCM("Question2_Theme1", 1, new String[] { "A", "B", "C" }, 2));
			uneListQuestionMode.add(new QCM("Question3_Theme1", 1, new String[] { "A", "B", "C" }, 3));

			uneListQuestionMode.add(new QCM("Question1", 2, new String[] { "A", "B", "C" }, 1));
			uneListQuestionMode.add(new QCM("Question2_Theme1", 2, new String[] { "A", "B", "C" }, 2));
			uneListQuestionMode.add(new QCM("Question3_Theme1", 2, new String[] { "A", "B", "C" }, 3));

			uneListQuestionMode.add(new QCM("Question1", 3, new String[] { "A", "B", "C" }, 1));
			uneListQuestionMode.add(new QCM("Question2_Theme1", 3, new String[] { "A", "B", "C" }, 2));
			uneListQuestionMode.add(new QCM("Question3_Theme1", 3, new String[] { "A", "B", "C" }, 3));

			uneListQuestionMode.add(new VraiFaux("Question1", 1, true));
			uneListQuestionMode.add(new VraiFaux("Question2", 1, false));
			uneListQuestionMode.add(new VraiFaux("Question3", 1, true));

			uneListQuestionMode.add(new VraiFaux("Question1", 2, true));
			uneListQuestionMode.add(new VraiFaux("Question2", 2, false));
			uneListQuestionMode.add(new VraiFaux("Question3", 2, true));

			uneListQuestionMode.add(new VraiFaux("Question1", 3, true));
			uneListQuestionMode.add(new VraiFaux("Question2", 3, false));
			uneListQuestionMode.add(new VraiFaux("Question3", 3, true));

			uneListQuestionMode.add(new ReponseCourte("Question1", 1, "R�ponseA"));
			uneListQuestionMode.add(new ReponseCourte("Question2", 1, "R�ponseB"));
			uneListQuestionMode.add(new ReponseCourte("Question3", 1, "R�ponseC"));

			uneListQuestionMode.add(new ReponseCourte("Question1", 2, "R�ponseA"));
			uneListQuestionMode.add(new ReponseCourte("Question2", 2, "R�ponseB"));
			uneListQuestionMode.add(new ReponseCourte("Question3", 2, "R�ponseC"));

			uneListQuestionMode.add(new ReponseCourte("Question1", 3, "R�ponseA"));
			uneListQuestionMode.add(new ReponseCourte("Question2", 3, "R�ponseB"));
			uneListQuestionMode.add(new ReponseCourte("Question3", 3, "R�ponseC"));

			this.getThemeString("Mode").ajouterQuestion(uneListQuestionMode);

/********************************************************************************************************/
			uneListQuestionNature.add(new QCM("Question1", 1, new String[] { "A", "B", "C" }, 1));
			uneListQuestionNature.add(new QCM("Question2_Theme1", 1, new String[] { "A", "B", "C" }, 2));
			uneListQuestionNature.add(new QCM("Question3_Theme1", 1, new String[] { "A", "B", "C" }, 3));

			uneListQuestionNature.add(new QCM("Question1", 2, new String[] { "A", "B", "C" }, 1));
			uneListQuestionNature.add(new QCM("Question2_Theme1", 2, new String[] { "A", "B", "C" }, 2));
			uneListQuestionNature.add(new QCM("Question3_Theme1", 2, new String[] { "A", "B", "C" }, 3));

			uneListQuestionNature.add(new QCM("Question1", 3, new String[] { "A", "B", "C" }, 1));
			uneListQuestionNature.add(new QCM("Question2_Theme1", 3, new String[] { "A", "B", "C" }, 2));
			uneListQuestionNature.add(new QCM("Question3_Theme1", 3, new String[] { "A", "B", "C" }, 3));

			uneListQuestionNature.add(new VraiFaux("Question1", 1, true));
			uneListQuestionNature.add(new VraiFaux("Question2", 1, false));
			uneListQuestionNature.add(new VraiFaux("Question3", 1, true));

			uneListQuestionNature.add(new VraiFaux("Question1", 2, true));
			uneListQuestionNature.add(new VraiFaux("Question2", 2, false));
			uneListQuestionNature.add(new VraiFaux("Question3", 2, true));

			uneListQuestionNature.add(new VraiFaux("Question1", 3, true));
			uneListQuestionNature.add(new VraiFaux("Question2", 3, false));
			uneListQuestionNature.add(new VraiFaux("Question3", 3, true));

			uneListQuestionNature.add(new ReponseCourte("Question1", 1, "R�ponseA"));
			uneListQuestionNature.add(new ReponseCourte("Question2", 1, "R�ponseB"));
			uneListQuestionNature.add(new ReponseCourte("Question3", 1, "R�ponseC"));

			uneListQuestionNature.add(new ReponseCourte("Question1", 2, "R�ponseA"));
			uneListQuestionNature.add(new ReponseCourte("Question2", 2, "R�ponseB"));
			uneListQuestionNature.add(new ReponseCourte("Question3", 2, "R�ponseC"));

			uneListQuestionNature.add(new ReponseCourte("Question1", 3, "R�ponseA"));
			uneListQuestionNature.add(new ReponseCourte("Question2", 3, "R�ponseB"));
			uneListQuestionNature.add(new ReponseCourte("Question3", 3, "R�ponseC"));

			this.getThemeString("Nature").ajouterQuestion(uneListQuestionNature);

/******************************************************************************************************/
			uneListQuestionFilm.add(new QCM("Question1", 1, new String[] { "A", "B", "C" }, 1));
			uneListQuestionFilm.add(new QCM("Question2_Theme1", 1, new String[] { "A", "B", "C" }, 2));
			uneListQuestionFilm.add(new QCM("Question3_Theme1", 1, new String[] { "A", "B", "C" }, 3));

			uneListQuestionFilm.add(new QCM("Question1", 2, new String[] { "A", "B", "C" }, 1));
			uneListQuestionFilm.add(new QCM("Question2_Theme1", 2, new String[] { "A", "B", "C" }, 2));
			uneListQuestionFilm.add(new QCM("Question3_Theme1", 2, new String[] { "A", "B", "C" }, 3));

			uneListQuestionFilm.add(new QCM("Question1", 3, new String[] { "A", "B", "C" }, 1));
			uneListQuestionFilm.add(new QCM("Question2_Theme1", 3, new String[] { "A", "B", "C" }, 2));
			uneListQuestionFilm.add(new QCM("Question3_Theme1", 3, new String[] { "A", "B", "C" }, 3));

			uneListQuestionFilm.add(new VraiFaux("Question1", 1, true));
			uneListQuestionFilm.add(new VraiFaux("Question2", 1, false));
			uneListQuestionFilm.add(new VraiFaux("Question3", 1, true));

			uneListQuestionFilm.add(new VraiFaux("Question1", 2, true));
			uneListQuestionFilm.add(new VraiFaux("Question2", 2, false));
			uneListQuestionFilm.add(new VraiFaux("Question3", 2, true));

			uneListQuestionFilm.add(new VraiFaux("Question1", 3, true));
			uneListQuestionFilm.add(new VraiFaux("Question2", 3, false));
			uneListQuestionFilm.add(new VraiFaux("Question3", 3, true));

			uneListQuestionFilm.add(new ReponseCourte("Question1", 1, "R�ponseA"));
			uneListQuestionFilm.add(new ReponseCourte("Question2", 1, "R�ponseB"));
			uneListQuestionFilm.add(new ReponseCourte("Question3", 1, "R�ponseC"));

			uneListQuestionFilm.add(new ReponseCourte("Question1", 2, "R�ponseA"));
			uneListQuestionFilm.add(new ReponseCourte("Question2", 2, "R�ponseB"));
			uneListQuestionFilm.add(new ReponseCourte("Question3", 2, "R�ponseC"));

			uneListQuestionFilm.add(new ReponseCourte("Question1", 3, "R�ponseA"));
			uneListQuestionFilm.add(new ReponseCourte("Question2", 3, "R�ponseB"));
			uneListQuestionFilm.add(new ReponseCourte("Question3", 3, "R�ponseC"));

			this.getThemeString("Film").ajouterQuestion(uneListQuestionFilm);

/******************************************************************************************************/

			uneListQuestionSerie.add(new QCM("Question1", 1, new String[] { "A", "B", "C" }, 1));
			uneListQuestionSerie.add(new QCM("Question2_Theme1", 1, new String[] { "A", "B", "C" }, 2));
			uneListQuestionSerie.add(new QCM("Question3_Theme1", 1, new String[] { "A", "B", "C" }, 3));

			uneListQuestionSerie.add(new QCM("Question1", 2, new String[] { "A", "B", "C" }, 1));
			uneListQuestionSerie.add(new QCM("Question2_Theme1", 2, new String[] { "A", "B", "C" }, 2));
			uneListQuestionSerie.add(new QCM("Question3_Theme1", 2, new String[] { "A", "B", "C" }, 3));

			uneListQuestionSerie.add(new QCM("Question1", 3, new String[] { "A", "B", "C" }, 1));
			uneListQuestionSerie.add(new QCM("Question2_Theme1", 3, new String[] { "A", "B", "C" }, 2));
			uneListQuestionSerie.add(new QCM("Question3_Theme1", 3, new String[] { "A", "B", "C" }, 3));

			uneListQuestionSerie.add(new VraiFaux("Question1", 1, true));
			uneListQuestionSerie.add(new VraiFaux("Question2", 1, false));
			uneListQuestionSerie.add(new VraiFaux("Question3", 1, true));

			uneListQuestionSerie.add(new VraiFaux("Question1", 2, true));
			uneListQuestionSerie.add(new VraiFaux("Question2", 2, false));
			uneListQuestionSerie.add(new VraiFaux("Question3", 2, true));

			uneListQuestionSerie.add(new VraiFaux("Question1", 3, true));
			uneListQuestionSerie.add(new VraiFaux("Question2", 3, false));
			uneListQuestionSerie.add(new VraiFaux("Question3", 3, true));

			uneListQuestionSerie.add(new ReponseCourte("Question1", 1, "R�ponseA"));
			uneListQuestionSerie.add(new ReponseCourte("Question2", 1, "R�ponseB"));
			uneListQuestionSerie.add(new ReponseCourte("Question3", 1, "R�ponseC"));

			uneListQuestionSerie.add(new ReponseCourte("Question1", 2, "R�ponseA"));
			uneListQuestionSerie.add(new ReponseCourte("Question2", 2, "R�ponseB"));
			uneListQuestionSerie.add(new ReponseCourte("Question3", 2, "R�ponseC"));

			uneListQuestionSerie.add(new ReponseCourte("Question1", 3, "R�ponseA"));
			uneListQuestionSerie.add(new ReponseCourte("Question2", 3, "R�ponseB"));
			uneListQuestionSerie.add(new ReponseCourte("Question3", 3, "R�ponseC"));

			this.getThemeString("Serie").ajouterQuestion(uneListQuestionSerie);

/*******************************************************************************************************/

			uneListQuestionManga.add(new QCM("Question1", 1, new String[] { "A", "B", "C" }, 1));
			uneListQuestionManga.add(new QCM("Question2_Theme1", 1, new String[] { "A", "B", "C" }, 2));
			uneListQuestionManga.add(new QCM("Question3_Theme1", 1, new String[] { "A", "B", "C" }, 3));

			uneListQuestionManga.add(new QCM("Question1", 2, new String[] { "A", "B", "C" }, 1));
			uneListQuestionManga.add(new QCM("Question2_Theme1", 2, new String[] { "A", "B", "C" }, 2));
			uneListQuestionManga.add(new QCM("Question3_Theme1", 2, new String[] { "A", "B", "C" }, 3));

			uneListQuestionManga.add(new QCM("Question1", 3, new String[] { "A", "B", "C" }, 1));
			uneListQuestionManga.add(new QCM("Question2_Theme1", 3, new String[] { "A", "B", "C" }, 2));
			uneListQuestionManga.add(new QCM("Question3_Theme1", 3, new String[] { "A", "B", "C" }, 3));

			uneListQuestionManga.add(new VraiFaux("Question1", 1, true));
			uneListQuestionManga.add(new VraiFaux("Question2", 1, false));
			uneListQuestionManga.add(new VraiFaux("Question3", 1, true));

			uneListQuestionManga.add(new VraiFaux("Question1", 2, true));
			uneListQuestionManga.add(new VraiFaux("Question2", 2, false));
			uneListQuestionManga.add(new VraiFaux("Question3", 2, true));

			uneListQuestionManga.add(new VraiFaux("Question1", 3, true));
			uneListQuestionManga.add(new VraiFaux("Question2", 3, false));
			uneListQuestionManga.add(new VraiFaux("Question3", 3, true));

			uneListQuestionManga.add(new ReponseCourte("Question1", 1, "R�ponseA"));
			uneListQuestionManga.add(new ReponseCourte("Question2", 1, "R�ponseB"));
			uneListQuestionManga.add(new ReponseCourte("Question3", 1, "R�ponseC"));

			uneListQuestionManga.add(new ReponseCourte("Question1", 2, "R�ponseA"));
			uneListQuestionManga.add(new ReponseCourte("Question2", 2, "R�ponseB"));
			uneListQuestionManga.add(new ReponseCourte("Question3", 2, "R�ponseC"));

			uneListQuestionManga.add(new ReponseCourte("Question1", 3, "R�ponseA"));
			uneListQuestionManga.add(new ReponseCourte("Question2", 3, "R�ponseB"));
			uneListQuestionManga.add(new ReponseCourte("Question3", 3, "R�ponseC"));

			this.getThemeString("Manga").ajouterQuestion(uneListQuestionManga);

/*******************************************************************************************************/

			uneListQuestionComics.add(new QCM("Question1", 1, new String[] { "A", "B", "C" }, 1));
			uneListQuestionComics.add(new QCM("Question2_Theme1", 1, new String[] { "A", "B", "C" }, 2));
			uneListQuestionComics.add(new QCM("Question3_Theme1", 1, new String[] { "A", "B", "C" }, 3));

			uneListQuestionComics.add(new QCM("Question1", 2, new String[] { "A", "B", "C" }, 1));
			uneListQuestionComics.add(new QCM("Question2_Theme1", 2, new String[] { "A", "B", "C" }, 2));
			uneListQuestionComics.add(new QCM("Question3_Theme1", 2, new String[] { "A", "B", "C" }, 3));

			uneListQuestionComics.add(new QCM("Question1", 3, new String[] { "A", "B", "C" }, 1));
			uneListQuestionComics.add(new QCM("Question2_Theme1", 3, new String[] { "A", "B", "C" }, 2));
			uneListQuestionComics.add(new QCM("Question3_Theme1", 3, new String[] { "A", "B", "C" }, 3));

			uneListQuestionComics.add(new VraiFaux("Question1", 1, true));
			uneListQuestionComics.add(new VraiFaux("Question2", 1, false));
			uneListQuestionComics.add(new VraiFaux("Question3", 1, true));

			uneListQuestionComics.add(new VraiFaux("Question1", 2, true));
			uneListQuestionComics.add(new VraiFaux("Question2", 2, false));
			uneListQuestionComics.add(new VraiFaux("Question3", 2, true));

			uneListQuestionComics.add(new VraiFaux("Question1", 3, true));
			uneListQuestionComics.add(new VraiFaux("Question2", 3, false));
			uneListQuestionComics.add(new VraiFaux("Question3", 3, true));

			uneListQuestionComics.add(new ReponseCourte("Question1", 1, "R�ponseA"));
			uneListQuestionComics.add(new ReponseCourte("Question2", 1, "R�ponseB"));
			uneListQuestionComics.add(new ReponseCourte("Question3", 1, "R�ponseC"));

			uneListQuestionComics.add(new ReponseCourte("Question1", 2, "R�ponseA"));
			uneListQuestionComics.add(new ReponseCourte("Question2", 2, "R�ponseB"));
			uneListQuestionComics.add(new ReponseCourte("Question3", 2, "R�ponseC"));

			uneListQuestionComics.add(new ReponseCourte("Question1", 3, "R�ponseA"));
			uneListQuestionComics.add(new ReponseCourte("Question2", 3, "R�ponseB"));
			uneListQuestionComics.add(new ReponseCourte("Question3", 3, "R�ponseC"));

			this.getThemeString("Comics").ajouterQuestion(uneListQuestionComics);

/********************************************************************************************************/
		} catch (OutOfRangeException e) {
			// TODO: handle exception
		}
	}
}
