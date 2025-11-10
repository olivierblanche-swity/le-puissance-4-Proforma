package Util;

import java.util.Scanner;

public class UtilMethodes {
	
	public static int saisieInt() {
		int nb=0;
		boolean ok;
		do {
			try {
				ok=true;
				System.out.println( "entrez un nb" );
				nb=new Scanner(System.in).nextInt();
			}
			catch(java.util.InputMismatchException e) {
				System.out.println("je t'ai demandé un entier !");
				ok=false;
			}
			// }while(ok==false);
		}while (! ok);
		return nb;
	}
	public static int saisieInt(String msg) {
		int nb=0;
		boolean ok;
		do {
			try {
				ok=true;
				System.out.println( msg );
				nb=new Scanner(System.in).nextInt();
			}
			catch(java.util.InputMismatchException e) {
				System.out.println("je t'ai demandé un entier !");
				ok=false;
			}
			// }while(ok==false);
		}while (! ok);
		return nb;
	}
	public static double saisieDouble() {
		double nb=0;
		boolean ok=true;
		do {
			try {
				ok=true;
				System.out.println("entrez un decimal" );
				nb=new Scanner(System.in).nextDouble();
			}
			catch(java.util.InputMismatchException e) {
				System.out.println("je t'ai demandé un nb décimal !");
				ok=false;
			}
			// }while(ok==false);
		}while (! ok);
		return nb;
	}
	public static double saisieDouble(String msg) {
		double nb=0;
		boolean ok=true;
		do {
			try {
				ok=true;
				System.out.println(msg );
				nb=new Scanner(System.in).nextDouble();
			}
			catch(java.util.InputMismatchException e) {
				System.out.println("je t'ai demandé un nb décimal !");
				ok=false;
			}
			// }while(ok==false);
		}while (! ok);
		return nb;
	}
}
