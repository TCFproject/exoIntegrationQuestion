package exoIntegrationQuestion;

import java.util.ArrayList;

public class Themes {
	private ArrayList<String> themes = new ArrayList<>();
	
	public Themes(String libelle) {
		// TODO Auto-generated constructor stub
		if (!themeExist(libelle)) {
			this.themes.add(libelle);
		}
	}
	
	/*public String selectTheme(String theme) {
		return this.th
	}*/
	
	private boolean themeExist(String theme) {
		return themes.contains(theme);
	}
}
