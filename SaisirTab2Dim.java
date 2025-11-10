package Util;

import java.util.Scanner;

public class SaisirTab2Dim {

	public static void SaisieTab2Dim(String msg) {
		int lig,col;
		int tab[][];

		do {
			lig=Util.UtilMethodes.saisieInt("combien de ligne");
			col=Util.UtilMethodes.saisieInt("combien de colonnes");
			tab=new int[lig][col];

			for(lig=0;lig<tab.length;lig++) {
				for(col=0;col<tab[lig].length;col++) {
					System.out.println( "entrez un nb pour la ligne "+lig+" et la colonne "+col );
					tab[lig][col]= Util.UtilMethodes.saisieInt("entrez votre nombre : ");

				}
			}

		}while(col>=0);
	}

	public class SaisirIntCarreParfaitchoix {

		public static void SaisieIntCarreParfaitchoix(String msg) {
			int lig,col,nb;
			int tab[][];

			do {
				nb=Util.UtilMethodes.saisieInt("combien de lignes et de colonnes");
				lig=nb;
				col=nb;

				tab=new int[lig][col];


				for(lig=0;lig<tab.length;lig++) {
					for(col=0;col<tab[lig].length;col++) {
						System.out.println( "entrez un nb pour la ligne "+lig+" et la colonne "+col );
						tab[lig][col]= Util.UtilMethodes.saisieInt("entrez votre nombre : ");

					}
				}

			}while(col>=0);
		}


		public class SaisirIntCarreParfait {

			public static void SaisieIntCarreParfaitchoix(String msg) {
				int lig,col,nb;
				int tab[][];

				do {
					nb=Util.UtilMethodes.saisieInt("combien de lignes et de colonnes");
					lig=nb;
					col=nb;

					tab=new int[lig][col];


					for(lig=0;lig<tab.length;lig++) {
						for(col=0;col<tab[lig].length;col++) {

							tab[lig][col]=0;

						}
					}

				}while(col>=0);
			}
		}
		
		public class SaisirCharCarreParfait {

			public static void SaisieCharCarreParfaitchoix(String msg) {
				int lig,col,nb;
				int tab[][];

				do {
					nb=Util.UtilMethodes.saisieInt("combien de lignes et de colonnes");
					lig=nb;
					col=nb;

					tab=new int[lig][col];


					for(lig=0;lig<tab.length;lig++) {
						for(col=0;col<tab[lig].length;col++) {

							tab[lig][col]='*';

						}
					}

				}while(col>=0);
			}
		}
	}
}

