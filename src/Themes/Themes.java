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

			uneListQuestionSport.add(new ReponseCourte("Question1", 1, "RéponseA"));
			uneListQuestionSport.add(new ReponseCourte("Question2", 1, "RéponseB"));
			uneListQuestionSport.add(new ReponseCourte("Question3", 1, "RéponseC"));

			uneListQuestionSport.add(new ReponseCourte("Question1", 2, "RéponseA"));
			uneListQuestionSport.add(new ReponseCourte("Question2", 2, "RéponseB"));
			uneListQuestionSport.add(new ReponseCourte("Question3", 2, "RéponseC"));

			uneListQuestionSport.add(new ReponseCourte("Question1", 3, "RéponseA"));
			uneListQuestionSport.add(new ReponseCourte("Question2", 3, "RéponseB"));
			uneListQuestionSport.add(new ReponseCourte("Question3", 3, "RéponseC"));

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

			uneListQuestionHistoire.add(new ReponseCourte("Question1", 1, "RéponseA"));
			uneListQuestionHistoire.add(new ReponseCourte("Question2", 1, "RéponseB"));
			uneListQuestionHistoire.add(new ReponseCourte("Question3", 1, "RéponseC"));

			uneListQuestionHistoire.add(new ReponseCourte("Question1", 2, "RéponseA"));
			uneListQuestionHistoire.add(new ReponseCourte("Question2", 2, "RéponseB"));
			uneListQuestionHistoire.add(new ReponseCourte("Question3", 2, "RéponseC"));

			uneListQuestionHistoire.add(new ReponseCourte("Question1", 3, "RéponseA"));
			uneListQuestionHistoire.add(new ReponseCourte("Question2", 3, "RéponseB"));
			uneListQuestionHistoire.add(new ReponseCourte("Question3", 3, "RéponseC"));

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

			uneListQuestionScience.add(new ReponseCourte("Question1", 1, "RéponseA"));
			uneListQuestionScience.add(new ReponseCourte("Question2", 1, "RéponseB"));
			uneListQuestionScience.add(new ReponseCourte("Question3", 1, "RéponseC"));

			uneListQuestionScience.add(new ReponseCourte("Question1", 2, "RéponseA"));
			uneListQuestionScience.add(new ReponseCourte("Question2", 2, "RéponseB"));
			uneListQuestionScience.add(new ReponseCourte("Question3", 2, "RéponseC"));

			uneListQuestionScience.add(new ReponseCourte("Question1", 3, "RéponseA"));
			uneListQuestionScience.add(new ReponseCourte("Question2", 3, "RéponseB"));
			uneListQuestionScience.add(new ReponseCourte("Question3", 3, "RéponseC"));

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

			uneListQuestionArt.add(new ReponseCourte("Question1", 1, "RéponseA"));
			uneListQuestionArt.add(new ReponseCourte("Question2", 1, "RéponseB"));
			uneListQuestionArt.add(new ReponseCourte("Question3", 1, "RéponseC"));

			uneListQuestionArt.add(new ReponseCourte("Question1", 2, "RéponseA"));
			uneListQuestionArt.add(new ReponseCourte("Question2", 2, "RéponseB"));
			uneListQuestionArt.add(new ReponseCourte("Question3", 2, "RéponseC"));

			uneListQuestionArt.add(new ReponseCourte("Question1", 3, "RéponseA"));
			uneListQuestionArt.add(new ReponseCourte("Question2", 3, "RéponseB"));
			uneListQuestionArt.add(new ReponseCourte("Question3", 3, "RéponseC"));

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

			uneListQuestionMode.add(new ReponseCourte("Question1", 1, "RéponseA"));
			uneListQuestionMode.add(new ReponseCourte("Question2", 1, "RéponseB"));
			uneListQuestionMode.add(new ReponseCourte("Question3", 1, "RéponseC"));

			uneListQuestionMode.add(new ReponseCourte("Question1", 2, "RéponseA"));
			uneListQuestionMode.add(new ReponseCourte("Question2", 2, "RéponseB"));
			uneListQuestionMode.add(new ReponseCourte("Question3", 2, "RéponseC"));

			uneListQuestionMode.add(new ReponseCourte("Question1", 3, "RéponseA"));
			uneListQuestionMode.add(new ReponseCourte("Question2", 3, "RéponseB"));
			uneListQuestionMode.add(new ReponseCourte("Question3", 3, "RéponseC"));

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

			uneListQuestionNature.add(new ReponseCourte("Question1", 1, "RéponseA"));
			uneListQuestionNature.add(new ReponseCourte("Question2", 1, "RéponseB"));
			uneListQuestionNature.add(new ReponseCourte("Question3", 1, "RéponseC"));

			uneListQuestionNature.add(new ReponseCourte("Question1", 2, "RéponseA"));
			uneListQuestionNature.add(new ReponseCourte("Question2", 2, "RéponseB"));
			uneListQuestionNature.add(new ReponseCourte("Question3", 2, "RéponseC"));

			uneListQuestionNature.add(new ReponseCourte("Question1", 3, "RéponseA"));
			uneListQuestionNature.add(new ReponseCourte("Question2", 3, "RéponseB"));
			uneListQuestionNature.add(new ReponseCourte("Question3", 3, "RéponseC"));

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

			uneListQuestionFilm.add(new ReponseCourte("Question1", 1, "RéponseA"));
			uneListQuestionFilm.add(new ReponseCourte("Question2", 1, "RéponseB"));
			uneListQuestionFilm.add(new ReponseCourte("Question3", 1, "RéponseC"));

			uneListQuestionFilm.add(new ReponseCourte("Question1", 2, "RéponseA"));
			uneListQuestionFilm.add(new ReponseCourte("Question2", 2, "RéponseB"));
			uneListQuestionFilm.add(new ReponseCourte("Question3", 2, "RéponseC"));

			uneListQuestionFilm.add(new ReponseCourte("Question1", 3, "RéponseA"));
			uneListQuestionFilm.add(new ReponseCourte("Question2", 3, "RéponseB"));
			uneListQuestionFilm.add(new ReponseCourte("Question3", 3, "RéponseC"));

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

			uneListQuestionSerie.add(new ReponseCourte("Question1", 1, "RéponseA"));
			uneListQuestionSerie.add(new ReponseCourte("Question2", 1, "RéponseB"));
			uneListQuestionSerie.add(new ReponseCourte("Question3", 1, "RéponseC"));

			uneListQuestionSerie.add(new ReponseCourte("Question1", 2, "RéponseA"));
			uneListQuestionSerie.add(new ReponseCourte("Question2", 2, "RéponseB"));
			uneListQuestionSerie.add(new ReponseCourte("Question3", 2, "RéponseC"));

			uneListQuestionSerie.add(new ReponseCourte("Question1", 3, "RéponseA"));
			uneListQuestionSerie.add(new ReponseCourte("Question2", 3, "RéponseB"));
			uneListQuestionSerie.add(new ReponseCourte("Question3", 3, "RéponseC"));

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

			uneListQuestionManga.add(new ReponseCourte("Question1", 1, "RéponseA"));
			uneListQuestionManga.add(new ReponseCourte("Question2", 1, "RéponseB"));
			uneListQuestionManga.add(new ReponseCourte("Question3", 1, "RéponseC"));

			uneListQuestionManga.add(new ReponseCourte("Question1", 2, "RéponseA"));
			uneListQuestionManga.add(new ReponseCourte("Question2", 2, "RéponseB"));
			uneListQuestionManga.add(new ReponseCourte("Question3", 2, "RéponseC"));

			uneListQuestionManga.add(new ReponseCourte("Question1", 3, "RéponseA"));
			uneListQuestionManga.add(new ReponseCourte("Question2", 3, "RéponseB"));
			uneListQuestionManga.add(new ReponseCourte("Question3", 3, "RéponseC"));

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

			uneListQuestionComics.add(new ReponseCourte("Question1", 1, "RéponseA"));
			uneListQuestionComics.add(new ReponseCourte("Question2", 1, "RéponseB"));
			uneListQuestionComics.add(new ReponseCourte("Question3", 1, "RéponseC"));

			uneListQuestionComics.add(new ReponseCourte("Question1", 2, "RéponseA"));
			uneListQuestionComics.add(new ReponseCourte("Question2", 2, "RéponseB"));
			uneListQuestionComics.add(new ReponseCourte("Question3", 2, "RéponseC"));

			uneListQuestionComics.add(new ReponseCourte("Question1", 3, "RéponseA"));
			uneListQuestionComics.add(new ReponseCourte("Question2", 3, "RéponseB"));
			uneListQuestionComics.add(new ReponseCourte("Question3", 3, "RéponseC"));

			this.getThemeString("Comics").ajouterQuestion(uneListQuestionComics);

/********************************************************************************************************/
		} catch (OutOfRangeException e) {
			// TODO: handle exception
		}
	}
}
