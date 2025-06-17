
//  Exercice3 : (indice : Integer.toBinaryString(nombreDecimal) )
//  Ecrire un programme qui convertis une entier fourni en ligne de commande en binaire et 
// affiche le résultat. Exemple d’exécution : 192 affiche 192 = 11000000 . Il s’exécute jusqu’à 
// ce qu’on donne x
import java.util.Scanner;

public class Method2String {
    public static void main(String[] args) {
        Scanner lire = new Scanner(System.in);
        System.out.println("--Méthode ToString--");
        System.out.print("Entrer le nombre à convertir :");
        int nombre = lire.nextInt();
        System.out.println("En binaire , " + nombre + " = " + Integer.toBinaryString(nombre));
    }
}
