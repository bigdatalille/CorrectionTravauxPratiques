package fr.adaming.inititation;

import java.util.Scanner;
/**
 * Cette classe nous permet de saisir au clavier deux entiers et de calculer 
 * leur somme et leur produit
 * @author KESKES Taoufik
 * 29 janv. 2019
 * SaisieClavier.java
 * TravauxPratiques
 */

public class SaisieClavier {
	
	 static int nb1 = 0 ;
	 static int  nb2 = 0 ;
	 
	/**
	 * Permet de saisir deux entiers au clavier
	 */
	public static void saisirVariable() {
		System.out.println("veuillez saisir le premier nombre  "); 
    @SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in); 
    nb1 = sc.nextInt();
    System.out.println("veuillez saisir le deuxième nombre  "); 
     nb2 = sc.nextInt();
       System.out.println("Les nombres nb1  :  "+nb1 +" et  nb2 :  "+ nb2); 
    	}
		
	/**
	 * Permet de calculer la somme des deux entiers variables de classe
	 * @return un entier
	 */
	public static int somme() {
		int resultat = nb1+nb2 ;
		System.out.println("la somme des nombres nb1 et nb2 est  :  "+resultat ); 
		return resultat;
	}
	
	/**
	 * Permet de calculer le produit des deux entiers variables de classe
	 * @return un entier
	 */
	public static int produit() {
		int resultat = nb1*nb2 ;
		System.out.println("le produit des nombres nb1 et nb2 est  :  "+resultat ); 
		return resultat;
	}
	
	public static void main(String[] args) {
		saisirVariable() ; 
		somme();
		produit();
		
	}
    
}
