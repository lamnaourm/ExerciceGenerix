package com.generic.exercice.main;

public class Entreprise {

	private String raison_sociale;
	private String adresse;
	private double capitale;
	public String getRaison_sociale() {
		return raison_sociale;
	}
	public void setRaison_sociale(String raison_sociale) {
		this.raison_sociale = raison_sociale;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public double getCapitale() {
		return capitale;
	}
	public void setCapitale(double capitale) {
		this.capitale = capitale;
	}
	public Entreprise(String raison_sociale, String adresse, double capitale) {
		super();
		this.raison_sociale = raison_sociale;
		this.adresse = adresse;
		this.capitale = capitale;
	}
	public Entreprise() {
		super();
	}
	@Override
	public String toString() {
		return "Entreprise [raison_sociale=" + raison_sociale + ", adresse=" + adresse + ", capitale=" + capitale + "]";
	}
}
