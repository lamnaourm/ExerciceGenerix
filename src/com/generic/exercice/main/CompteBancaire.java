package com.generic.exercice.main;

public class CompteBancaire<T> {
	
	private int numero;
	private double solde;
	private T proprietaire;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public T getProprietaire() {
		return proprietaire;
	}
	public void setProprietaire(T proprietaire) {
		this.proprietaire = proprietaire;
	}
	public CompteBancaire(int numero, double solde, T proprietaire) {
		super();
		this.numero = numero;
		this.solde = solde;
		this.proprietaire = proprietaire;
	}
	public CompteBancaire() {
		super();
	}
	@Override
	public String toString() {
		return "CompteBancaire [numero=" + numero + ", solde=" + solde + ", proprietaire=" + proprietaire + "]";
	}
	
	public static void transfere(CompteBancaire<?> Csource, CompteBancaire<?> Cdestination, double montant) {
		
		if(Csource.solde<montant) {
			System.out.println("Transfert echoue");
			return;
		}
		
		Csource.solde -= montant;
		Cdestination.solde += montant;
		System.out.println("Transfert effectue avec succes");
	}
	
}
