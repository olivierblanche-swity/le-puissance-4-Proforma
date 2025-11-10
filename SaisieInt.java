package Util;

import java.util.Scanner;

public class SaisieInt {

	public static int saisieInt() {
		int nb=0;
		
		boolean ok;
		do {
			try {
				ok=true;
				System.out.println("entrez un nombre entier");
				nb=new Scanner(System.in).nextInt();
			}
			catch(java.util.InputMismatchException e) {
				System.out.println("je t'ai demand� un entier !");
				ok=false;
			}
			// }while(ok==false);
		}while (! ok);
		return nb;
	}
}

