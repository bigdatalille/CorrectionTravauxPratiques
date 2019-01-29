package fr.adaming.inititation;

/**
 * Cette classe permet de permuter deux entiers
 * @author KESKES Taoufik
 * 29 janv. 2019
 * Permuter.java
 * TravauxPratiques
 */
public class Permuter {
	
	static int a = 13  ;
	static int b = 56 ;
	
	public static void main(String[] args) {		
		afficher() ;
		permuter() ;
		afficher() ;	
		afficher(12 , 23) ;	
	}

	private static void afficher(int i, int j) {
		System.out.println("le premier argument :"+i+"  le deuxième argument: "+j);	
	}
	

	private static void afficher() {
		System.out.println("le premier argument :"+a+"  le deuxième argument: "+b);	
	}

	/**
	 * On crée une variable temporaire avant de permuter pour ne pas perdre a
	 */
	private static void permuter() {
		int tmp ; // une variable temporaire
		tmp = a ;
		a = b ;
		b = tmp ;
	}
	
	
	
	
}
