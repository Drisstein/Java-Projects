//Ecrire un programme qui ne sasit que des nombres positifs 

import java.util.Scanner;

public class EXO8PositifFactoriel {
    public static void main(String[] args) {
        try (Scanner lire = new Scanner(System.in)) {
            int x;
            do {
                System.out.println("Veuillez saisir un nombre positif svp ! ");
                System.out.print("Veuillez entrer un entier: ");
                x = lire.nextInt();
            } while (x <= 0);

            // Calcul du Factoriel
            System.out.println("--CALCUL DU FACTORIEL--");
            System.out.print("Entrer un nombre : ");
            int N = lire.nextInt();
            int facto = 1;
            for (int i = 1; i <= N; i++) {
                facto *= i;
            }
            System.out.println("Le factoriel de " + N + " est : " + facto);
        }
    }

}