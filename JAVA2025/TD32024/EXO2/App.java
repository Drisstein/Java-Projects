package EXO2;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lecture de la taille du tableau
        System.out.print("Entrez la taille du tableau : ");
        int taille = scanner.nextInt();

        // Création de l'objet TableauReel
        TableauReel tableau = new TableauReel(taille);

        // Saisie des éléments
        tableau.saisieTab();

        // Affichage avant incrémentation
        System.out.println("Avant incrémentation :");
        tableau.afficheTab();

        // Incrémentation du tableau
        System.out.print("Entrez la valeur d'incrémentation : ");
        double increment = scanner.nextDouble();
        tableau.incrementeTab(increment);

        // Affichage après incrémentation
        System.out.println("Après incrémentation :");
        tableau.afficheTab();

        // Affichage de la somme
        System.out.println("Somme des éléments : " + tableau.calculSomme());
    }
}
