package EXO2;

import java.util.Scanner;

public class TableauReel {
    private double[] tableauDouble;
    private int N;

    // Constructeur
    public TableauReel(int N) {
        this.N = N;
        this.tableauDouble = new double[N];
    }

    // Méthode de saisie du tableau
    public void saisieTab() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisie des " + N + " éléments du tableau :");
        for (int i = 0; i < N; i++) {
            System.out.print("Élément " + (i + 1) + " : ");
            tableauDouble[i] = scanner.nextDouble();
        }
    }

    // Méthode pour calculer la somme des valeurs du tableau
    public double calculSomme() {
        double somme = 0;
        for (double val : tableauDouble) {
            somme += val;
        }
        return somme;
    }

    // Méthode pour incrémenter chaque valeur du tableau
    public void incrementeTab(double d) {
        for (int i = 0; i < N; i++) {
            tableauDouble[i] += d;
        }
    }

    // Méthode pour afficher les valeurs du tableau
    public void afficheTab() {
        System.out.print("Contenu du tableau : ");
        for (double val : tableauDouble) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
