package fr.adaming.inititation;

import java.util.Scanner;
/**
 * 
 * @author KESKES Taoufik
 * 29 janv. 2019
 * Moyenne.java
 * TravauxPratiques
 */
public class Moyenne {
			 
	 static float tab[]= {0,0,0,0} ; //déclarer un tableau 
	 static String tab2[]= {"un", "deux", "trois", "quatre"};
	 static boolean strOk = true;
	
	 public static void main(String[] args) {
			saisirVariableTableau() ;	
			moyenne();
			
		}
	 
	public static void saisirVariableTableau() {
		
		
		Scanner sc = new Scanner(System.in); //permet de saisir au clavier 
		  String str=""; //initialisation de la variable str qui va contenir ce qu'on va saisir au clavier
		  int i = 0 ; // indice qui permet de parcourir le tableau 
		  
		  do {
			  System.out.println("Veuillez saisir un chiffre d'indice "+ i);  
			  str = sc.nextLine();
			  tab[i]=tester(str);
			  if(strOk) {
				  i++;
			  }
			} while (strOk != true || i<tab.length ); //conditions : le paramètre n'est pas un chiffre et on a pas parcouru tout le tableau 
		  sc.close(); //fermer le scanner 
	 }
	
	
	public static float moyenne() {
		float moyenne = 0 ;
		float somme = 0 ;
		
		for(int i = 0 ; i<tab.length ; i++) {
		 somme += tab[i] ;
		}
		moyenne = somme / tab.length ;
		System.out.println("la moyenne des nombres dans le tableau c'est  :   "+ moyenne ); 
		return moyenne;
	 }
	
	public static int tester(String str) {
		int resultat = 0 ;
		try {
			  resultat = Integer.parseInt(str); // permet de transformer une String en entier 
		     // si ton exécution arrive jusque là, ça signifie qu'il n'y a aucune exception lancée et que ta saisie est donc bien un chiffre
		   strOk = true;
	
		   
		  } catch(NumberFormatException e) //le format ne correspond pas à un entier c'est une exception
		  {
		   strOk=false;
			  System.out.println("Cette valeur n'est pas un chiffre, essaie encore !");
		    e.toString(); //afficher l'exception
		  }
		return resultat;
	}

	
}
