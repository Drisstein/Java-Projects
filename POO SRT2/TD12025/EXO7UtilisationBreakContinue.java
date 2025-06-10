//EXO: Utilisation des boucles break et continue

import java.util.Scanner;

public class EXO7UtilisationBreakContinue {
    public static void main(String[] args) {
        Scanner lire = new Scanner(System.in);
        String ip, password;
        String passwordOK = "admin123";
        String ipOath = "192.168.1.10"; // on sarrete à cette @

        // Etape Authentification
        System.out.print("Nom d'utilsateur :");
        String username = lire.nextLine();
        System.out.println("Bienvenue, " + username + " !");
        int compt = 0;
        boolean Authentification = false;
        do {
            System.out.print("Votre Mot de Passe :");
            password = lire.nextLine();
            compt++;

            if (password.equals(passwordOK)) {
                System.out.println("Accés autorisé !");
                System.out.println("Tentative(s) :" + compt);
                Authentification = true;
                break;
            } else {
                System.out.println("Mot de passe Incorrecte,réessayez !");
            }
        } while (!Authentification);

        // Etape de Balayage
        if (Authentification) {
            System.out.print("Entrer une adresse ip:");
            ip = lire.nextLine();
            for (int i = 1; i <= 20; i++) {
                ip = "192.168.1." + i;
                if (ip.equals("192.168.1.3")) {
                    continue;
                } else if (ip.equals(ipOath)) { // ipOath = "192.168.1.10"; on sarrete à cette @
                    System.out.println("Fin du balayage !");
                    break; // Passe à l'itération suivante
                }
                System.out.println("ip" + i + " = " + "192.168.1." + i);
            }
        }
        lire.close();
    }
}
