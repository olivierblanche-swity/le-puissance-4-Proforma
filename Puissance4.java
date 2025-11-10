
package Labo1;

public class Puissance4 {

    public static void main(String[] args) {
        int L = 6, C = 7, col, lig, coordl, coordc;
        char plateau[][] = new char[L][C];
        int gagnant = 0;
        char symbole;
        boolean victoire;

        // Initialisation du plateau
        for (int i = 0; i < plateau.length; i++) {
            for (int j = 0; j < plateau[0].length; j++) {
                plateau[i][j] = '*';
            }
        }

        for (int i = 1; i <= L * C; i++) {
            System.out.println("Tour " + i + " - Etat du plateau :");
            System.out.println("1\t2\t3\t4\t5\t6\t7");
            System.out.println("-\t-\t-\t-\t-\t-\t-");
            Util.UtilTab.affiche(plateau);

            System.out.println("Tour du joueur " + (i % 2 == 1 ? '1' : '2'));
            boolean colonnePleine = false;

            // Saisie d'une colonne valide
            do {
                do {
                    col = Util.UtilMethodes.saisieInt("Entrez un numéro de colonne entre 1 et 7 :") - 1;
                } while (col < 0 || col >= C);

                lig = L - 1;
                while (lig >= 0 && plateau[lig][col] != '*') {
                    lig--;
                }

                if (lig < 0) {
                    System.out.println("Colonne complète, veuillez en choisir une autre.");
                    colonnePleine = true;
                } else {
                    colonnePleine = false;
                }

            } while (colonnePleine);

            // Placement du pion
            symbole = (i % 2 == 1 ? 'X' : 'O');
            plateau[lig][col] = symbole;
            coordl = lig;
            coordc = col;

            // Vérification de victoire
            victoire = false;

            // Vérification horizontale
            int max = 0;
            for (int j = 0; j < C; j++) {
                if (plateau[coordl][j] == symbole) {
                    max++;
                    if (max >= 4) victoire = true;
                } else {
                    max = 0;
                }
            }

            // Vérification verticale
            max = 0;
            for (int j = 0; j < L; j++) {
                if (plateau[j][coordc] == symbole) {
                    max++;
                    if (max >= 4) victoire = true;
                } else {
                    max = 0;
                }
            }

            // Vérification diagonale ↘
            max = 0;
            int r = coordl, c = coordc;
            while (r > 0 && c > 0) {
                r--;
                c--;
            }
            while (r < L && c < C) {
                if (plateau[r][c] == symbole) {
                    max++;
                    if (max >= 4) victoire = true;
                } else {
                    max = 0;
                }
                r++;
                c++;
            }

            // Vérification diagonale ↙
            max = 0;
            r = coordl;
            c = coordc;
            while (r > 0 && c < C - 1) {
                r--;
                c++;
            }
            while (r < L && c >= 0) {
                if (plateau[r][c] == symbole) {
                    max++;
                    if (max >= 4) victoire = true;
                } else {
                    max = 0;
                }
                r++;
                c--;
            }

            // Si victoire détectée
            if (victoire) {
                gagnant = (i % 2 == 1 ? 1 : 2);
                break; // sortir de la boucle principale
            }
        }

        // Affichage final du résultat
        System.out.println("\nFin de la partie !");
        System.out.println("1\t2\t3\t4\t5\t6\t7");
        System.out.println("-\t-\t-\t-\t-\t-\t-");
        Util.UtilTab.affiche(plateau);

        if (gagnant == 0) {
            System.out.println("Match nul !");
        } else {
            System.out.println(" Victoire du joueur " + gagnant + " !");
        }
    }
}
