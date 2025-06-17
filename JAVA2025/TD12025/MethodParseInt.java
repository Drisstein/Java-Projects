//  Exercice4: ( indice: Integer.parseInt(nbreBinaire, 2) )
//  Ecrire un programme qui convertis un binaire fourni en ligne de commande en décimal et 
// affiche le résultat. Exemple d’exécution : 11000000 affiche 11000000 = 192 . . Il s’exécute 
// jusqu’à ce qu’on donne x.

import java.util.Scanner;

public class MethodParseInt {
    public static void main(String[] args) {
        Scanner lire = new Scanner(System.in);
        System.out.println("--Méthode To Double - ParseInt--");
        String nombre;

        System.out.print("Entrer le nombre binaire à convertir en decimal:");
        nombre = lire.next();
        System.out.println("En décimal , " + nombre + " = " + Integer.parseInt(nombre, 2));

    }
}
