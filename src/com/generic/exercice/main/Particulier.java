package com.generic.exercice.main;

import java.time.LocalDate;

public class Particulier {

	private String cin;
	private String nom;
	private LocalDate dateNaissance;
	
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public Particulier(String cin, String nom, LocalDate dateNaissance) {
		super();
		this.cin = cin;
		this.nom = nom;
		this.dateNaissance = dateNaissance;
	}
	public Particulier() {
	
	}
	
	@Override
	public String toString() {
		return "Particulier [cin=" + cin + ", nom=" + nom + ", dateNaissance=" + dateNaissance + "]";
	}
}
