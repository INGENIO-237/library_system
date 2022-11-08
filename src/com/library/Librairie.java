package com.library;

import java.util.ArrayList;

public class Librairie {
	
	private ArrayList<Livre> livres = new ArrayList<>();
	
	public Librairie(ArrayList<Livre> livres) {
		for(int i = 0; i < livres.size(); i++) {
			this.livres.add(livres.get(i));
		}
	}
	
	public void ajouter(Livre livre) {
		this.livres.add(livre);
	}
	
	public String toString() {
		for(int i = 0; i < livres.size(); i++) {
			this.livres.get(i).toString();
		}
		return null;
	}
	
	public void afficherParAuteur(Auteur auteur) {
		for(int i = 0; i < livres.size(); i++) {
			if(livres.get(i).getAuteur() == auteur) {
				livres.get(i).toString();
			}
		}
	}
	
	public Livre insererLivreParAnnee(Livre livre) {
		for(int i = 0; i < livres.size(); i++) {
			if(this.livres.get(i).getAnnee_sortie() >= livre.getAnnee_sortie()) {
				this.livres.add(i, livre);
				return null;
			}
		}
		this.livres.add(this.livres.size() ,livre);
		return null;
	}
}
