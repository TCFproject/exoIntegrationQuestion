package Joueurs;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Enum.Etat;
public class Joueurs {
	
	private List<Joueur> listJoueur;
	
	public Joueurs() {
		// TODO Auto-generated constructor stub
		this.listJoueur = new ArrayList<>();
		int j = 0;
		for (char i = 'A'; i <= 'Z'; i++) {
			j++;
			this.listJoueur.add(new Joueur(j,String.valueOf(i),0,Etat.Attente));
		}
	}
	
	public Joueur getUnJoueur() {
		return this.listJoueur.get(this.randomSizePlayer());
	}
	
	public void selection() {
		for (int i = 0; i < 4; i++) {
			this.listJoueur.get(this.randomSizePlayer()).setEtat(Etat.Selectionner);
		}
	}
	
	public List<Joueur> listSelectionner(){
		List<Joueur> listSelectionner = new ArrayList<>();
		for (Joueur joueur : listSelectionner) {
			if (joueur.getEtat().equals(Etat.Selectionner)) {
				listSelectionner.add(joueur);
			}
		}
		return listSelectionner;
	}
	
	public String afficheJoueurSelectionner() {
		StringBuilder sb = new StringBuilder();
		for (Joueur joueur : listSelectionner()) {
			sb.append(joueur.présentation()+"\n");
		}
		return "Les joueurs séléctionnés sont :\n"+ sb.toString();
	}
	
	private int randomSizePlayer() {
		Random r = new Random();
		return r.nextInt(this.listJoueur.size());
	}
}
