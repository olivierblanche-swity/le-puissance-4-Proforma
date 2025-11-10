package Util;

import java.util.Scanner;

public class UtilSaisie {
	public static int saisieInt(String texteQuestion) { 
		// fonction elle renvoie au prog appelant une valeur int
		int nb=0;
		boolean ok;
		do {
			try {
				ok=true;
				System.out.println(texteQuestion);
				nb= new Scanner(System.in).nextInt();
			}
			catch (java.util.InputMismatchException e) {
				System.out.println("pas bien, je te demandais un nombre entier");
				ok=false;
			}
		} while( ! ok); // ok==false
		return nb;
	}
	public static String saisieString(String texteQuestion) { 
		// fonction elle renvoie au prog appelant une valeur int
		String texte="";
		boolean ok;
		do {

			ok=true;
			System.out.println(texteQuestion);
			texte= new Scanner(System.in).nextLine();
			if(texte.length()==0) {
				System.out.println("pas bien, je te demandais une String");
				ok=false;
			}
		} while( ! ok); // ok==false
		return texte;
	}

	public static char saisieChar(String texteQuestion) { 
		// fonction elle renvoie au prog appelant une valeur int
		char t=' ';
		String texte;
		boolean ok;
		do {

			ok=true;
			System.out.println(texteQuestion);
			texte= new Scanner(System.in).nextLine();
			if(texte.length()!=1) {
				System.out.println("un et un seul caractère");
				ok=false;
			}
			else {
				t=texte.charAt(0);
			}
		} while( ! ok); // ok==false
		return t;
	}
	public static char saisieCharMajuscule(String texteQuestion) { 
		// fonction elle renvoie au prog appelant une valeur int
		char t=' ';
		String texte;
		boolean ok;
		do {

			ok=true;
			System.out.println(texteQuestion);
			texte= new Scanner(System.in).nextLine().toUpperCase();
			if(texte.length()!=1) {
				System.out.println("un et un seul caractère");
				ok=false;
			}
			else {
				t=texte.charAt(0);
			}
		} while( ! ok); // ok==false
		return t;
	}
	public static double saisieDouble(String texteQuestion) {
		double nb=0;
		boolean ok;
		do {
			try {
				ok=true;
				System.out.println(texteQuestion);
				nb= new Scanner(System.in).nextDouble();
			}
			catch (java.util.InputMismatchException e) {
				System.out.println("pas bien, je te demandais un nombre à virgule");
				ok=false;
			}
		} while( ! ok); // ok==false
		return nb;
	}
	public static boolean encore() {
		String rep;
		boolean encore=false;
		do {
			rep=saisieString("voulez-vous recommencer ? (oui/non) ");
		}while(!rep.equalsIgnoreCase("oui") && ! rep.equalsIgnoreCase("non"));
		if(rep.equalsIgnoreCase("oui")) 
			encore=true;
		return encore;
	}
}

