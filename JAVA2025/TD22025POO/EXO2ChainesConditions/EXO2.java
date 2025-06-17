/*
 * Exercice  3: Utiliser les chaînes et conditions Un utilisateur doit définir un mot de passe sécurisé. 
 * Le programme vérifie que le mot de passe : 
 Contient au moins 8 caractères 
 Contient au moins une lettre majuscule 
 Contient au moins un chiffre  1. 

Créer  une  classe  Utilisateur  qui  a  deux  attributs  privés  login  et  mot  de  passe  mdp.  
Créer  les Getter/Setter des attributs. 
Ajouter une méthode afficher() qui affiche les infos d’un utilisateur. 
2. Créer  une  autre  classe  représentant  le  programme  principal.  En  plus  de  la  méthode  main,  elle 
contient deux aures méthodes static: 
 checkPassword(String mdp) : qui vérifie si le mot de passe est valide ou non. 
 createUser(String login, String mdp) : qui crée et affiche un utilisateur. 

👉 Utilisez les méthodes :  
 length() : retourne la longueur de la chaîne. 
 toCharArray() : transforme une chaîne en tableau de caractères. 
 Character.isUpperCase(char) : vérifie si le caractère est une majuscule. 
 Character.isDigit(char) : vérifie si c’est un chiffre. 
  

 */

import java.util.Scanner;

public class EXO2 {

    // Créer une classe Utilisateur qui a deux attributs privés login et mot de
    // passe mdp.
    // Créer les Getter/Setter des attributs.
    static class Utilisateur {
        private String login;
        private String mdp;

        public Utilisateur(String login, String mdp) {
            this.login = login;
            this.mdp = mdp;
        }

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public String getMdp() {
            return mdp;
        }

        public void setMdp(String mdp) {
            this.mdp = mdp;
        }

        // Ajouter une méthode afficher() qui affiche les infos d’un utilisateur.
        public void afficher() {
            System.out.println("Utilisateur: " + login + ", Mot de passe: " + mdp);
        }
    }
    //  checkPassword(String mdp) : qui vérifie si le mot de passe est valide ou
    // non.

    static boolean checkPassword(String mdp) {
        if (mdp.length() < 8) {
            return false; // Moins de 8 caractères
        }

        for (char c : mdp.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return true; // Doit contenir au moins une majuscule et un chiffre

    }

    //  createUser(String login, String mdp) : qui crée et affiche un utilisateur.
    static Utilisateur createUser(String login, String mdp) {
        if (checkPassword(mdp)) {
            Utilisateur user = new Utilisateur(login, mdp); // Créer un nouvel utilisateur
            user.afficher();
            return user;
        } else {
            System.out.println(
                    "Erreur ,Le mot de passe doit contenir au moins 8 caractères, une lettre majuscule et un chiffre.");
            return null;
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello World !");
        // 2. Créer une autre classe représentant le programme principal. En plus de la
        // méthode main, elle
        // contient deux aures méthodes static:
        Scanner lire = new Scanner(System.in);
        System.out.print("Entrez le login de l'utilisateur :");
        String login = lire.nextLine();
        System.out.print("Entrez le mot de passe  :");
        String mdp = lire.nextLine();
        Utilisateur user = createUser(login, mdp);
        if (user != null) {
            System.out.println("Utilisateur créé avec succès.");
        } else {
            System.out.println("Échec de la création de l'utilisateur.");
        }
        lire.close();
    }
}