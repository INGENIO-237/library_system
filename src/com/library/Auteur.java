package com.library;

public class Auteur {

	private String prenom;
	private String nom;
	private String nationalite;
	
	public Auteur(String prenom, String nom, String nationalite) {
		this.prenom = prenom;
		this.nom = nom;
		this.nationalite = nationalite;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getNationalite() {
		return nationalite;
	}
	
	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}
	
	public String toString() {
		return "Auteur : " + this.prenom + " - " + this.nom + " - " + this.nationalite;
	}
}
