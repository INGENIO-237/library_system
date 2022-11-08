package com.library;

public class Livre {
	private String ISBN;
	private Auteur auteur;
	private String titre;
	private int annee_sortie;
	private int nbr_pages;
	
	public Livre(String ISBN, Auteur auteur, String titre, int annee_sortie, int nbr_pages) {
		this.ISBN = ISBN;
		this.auteur = auteur;
		this.titre = titre;
		this.annee_sortie = annee_sortie;
		this.nbr_pages = nbr_pages;
	}
	
	public Livre(Livre livre) {
		this.ISBN = livre.ISBN;
		this.auteur = livre.auteur;
		this.titre = livre.titre;
		this.annee_sortie = livre.annee_sortie;
		this.nbr_pages = livre.nbr_pages;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public Auteur getAuteur() {
		return auteur;
	}

	public void setAuteur(Auteur auteur) {
		this.auteur = auteur;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public int getAnnee_sortie() {
		return annee_sortie;
	}

	public void setAnnee_sortie(int annee_sortie) {
		this.annee_sortie = annee_sortie;
	}

	public int getNbr_pages() {
		return nbr_pages;
	}

	public void setNbr_pages(int nbr_pages) {
		this.nbr_pages = nbr_pages;
	}
	
	public String toString() {
		return "ISBN : " + this.ISBN + " Titre : " + this.titre + " Annee de sortie : " + this.annee_sortie + " Nombre de pages : " + this.nbr_pages + this.auteur.toString();
	}
}
