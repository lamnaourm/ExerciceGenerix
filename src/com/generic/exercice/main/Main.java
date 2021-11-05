package com.generic.exercice.main;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Donner le Cin");
		String cin = sc.nextLine();
		System.out.print("Donner le nom");
		String nom = sc.nextLine();
		System.out.print("Donner la date de naissance");
		LocalDate date = LocalDate.parse(sc.nextLine());
		
		
		// Liste des particuliers
		Particulier p1 = new Particulier(cin,nom,date);
	    Particulier p2 = new Particulier("QA1222","ZAID",LocalDate.of(1988, 6, 23));
	    
	    // Liste des entreprises
	    Entreprise e1 = new Entreprise("CGI","Rabat",123323.5);
	    Entreprise e2 = new Entreprise("ATOS","CASA",129999.5);
	    
	    // Liste des comptes bancaires
	    CompteBancaire<Particulier> c1 = new CompteBancaire<>(1,1023.44,p1);
	    CompteBancaire<Particulier> c2 = new CompteBancaire<>(1,19923.44,p2);
	    CompteBancaire<Entreprise> c3 = new CompteBancaire<>(1,8787823.44,e1);
	    CompteBancaire<Entreprise> c4 = new CompteBancaire<>(1,7878723.44,e2);
	    CompteBancaire<String> c5 = new CompteBancaire<>(1,23.44,"AZIZ");
	    
	    // Transfert de 1000 de c3 vers c1
	    CompteBancaire.transfere(c3, c1, 1000);
	    
	    // Affichage des comptes
	    System.out.println(c1);
	    System.out.println(c2);
	    System.out.println(c3);
	    System.out.println(c4);
	    System.out.println(c5);
	    
	}
}