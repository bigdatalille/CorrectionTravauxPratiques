package fr.adaming.inititation;

/**
 * @author KESKES Taoufik
 * 29 janv. 2019
 * Arithmetiques.java
 * TravauxPratiques
 * Cette classe nous permet d'affecter à deux entiers des 
 * valeurs et calculer leur somme et leurs produit
 */

public class Arithmetiques {
	

	
	public static void main(String[] args) {
		int a = 13  ;
		int b = 56 ;
		somme(a , b) ;
		produit(a , b) ;
		
	}

	/**
	 * Cette methode calcule le produit de deux entiers
	 * @param z
	 * @param n
	 * @return un entier
	 */
	private static int produit(int z, int n) {
		System.out.println("je suis la methode produit");
		int resultat = z*n ;
		System.out.println("le produit de "+z+" et "+n+" c'est "+resultat);
		return resultat ;
	}

	/**
	 * Cette methode calcule la somme de deux entiers
	 * @param az
	 * @param bn
	 * @return un entier
	 */
	private static int somme(int az, int bn) {
		System.out.println("je suis la methode somme");
		int resultat = az+bn ;
		System.out.println("la somme de "+az+" et "+bn+" c'est "+resultat);
		return resultat ;
	}
}
