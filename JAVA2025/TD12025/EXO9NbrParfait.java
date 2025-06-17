import java.util.Scanner;

public class EXO9NbrParfait {
    public static boolean estParfait(int n) {
        int somme = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                somme += i;
                System.out.println("i = " + i);
            }
        }
        if (somme == n) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner lire = new Scanner(System.in);
        System.out.print("Entrer un entier n :");
        int n = lire.nextInt();

        if (estParfait(n)) {
            System.out.print(n + " est parfait car " + n + " = ");
            int somme = 0;
            for (int j = 1; j < n; j++) {
                if (n % j == 0) {
                    somme += j;
                 
                    // System.out.print(j + " + ");// Commenté pour éviter l'affichage du separateur apres le dernier diviseur
                System.out.print(j + (somme == n ? "" : ",")); // separe les diviseurs par une virgule juskau dernier 
                }
            }
        } else
            System.out.println(n + " n'est pas parfait !");

        lire.close();
    }
}