import java.util.Scanner;

public class EXO10Boucles {
    public static void main(String[] args) {
        Scanner lire = new Scanner(System.in);
        System.out.println("--->BOUCLES FOR<---");
        System.out.print("Entrer le nombre de Nombre N :");
        int N = lire.nextInt();
        int Somme = 0;
        int Produit = 1;
        for (int i = 1; i <= N; i++) {
            System.out.print("Entrer un entier : ");
            double x = lire.nextDouble();
            Somme += x;
            Produit *= x;
        }
        System.out.println("Somme= " + Somme + "\nProduit=" + Produit + "\nMoyenne=" + (double) Somme / N);

        System.out.println("--->BOUCLES WHILE<---");
        System.out.print("Entrer le nombre de Nombre N :");
        int N1 = lire.nextInt();
        int i = 0;
        int Somme1 = 0;
        int Produit1 = 1;
        do {
            System.out.print("Entrer un entier : ");
            double x = lire.nextDouble();
            Somme1 += x;
            Produit1 *= x;
            i++;
        } while (N1 > 0 && i < N1);
        System.out.println("Somme= " + Somme1 + "\nProduit=" + Produit1 + "\nMoyenne=" + (double) Somme1 / N1);

        System.out.println("--->BOUCLES DO-WHILE<---");
        System.out.print("Entrer le nombre de Nombre N :");
        int N2 = lire.nextInt();
        int Somme2 = 0;
        int Produit2 = 1;
        int cp = 0;
        while (N2 >= 0 && N2 != cp) {
            System.out.print("Entrer un entier : ");
            double x = lire.nextDouble();
            Somme2 += x;
            Produit2 *= x;
            cp++;
        }
        System.out.println("Somme= " + Somme2 + "\nProduit=" + Produit2 + "\nMoyenne=" + (double) Somme2 / N2);

    }
}
