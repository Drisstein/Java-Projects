
/*
 * Exercice 3:
1. Créez une classe Livre avec les attributs privés suivants :
 isbn : identifiant unique du livre
 titre : titre du livre
 annee : année de publication
2. Créez le constructeur et des getters/setters pour chaque attribut. Setter de annee doit vérifier
que l'année est > 1900.
3. Créez une classe Auteur avec les attributs : nom, prénom.
Un livre peut être écrit par plusieurs auteur et un auteur peut écrire plusieurs livres.
4. Modifiez la classe Livre pour contenir une liste d’auteurs.
5. Modifiez la classe Auteur pour contenir une liste de livres.
6. Créez une méthode dans Livre pour ajouter un auteur, et dans Auteur pour ajouter un livre.
7. Dans la classe principale, affichez les livres d’un auteur donné, et les auteurs d’un livre donné.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class EXO3 {
    static class Auteur {
        private String nom;
        private String prenom;
        private ArrayList<Livre> livres = new ArrayList<>();

        public Auteur(String nom, String prenom) {
            this.nom = nom;
            this.prenom = prenom;
        }

        public void ajouterLivre(Livre livre) {
            if (!livres.contains(livre)) {
                livres.add(livre);
                livre.ajouterAuteur(this);
            }
        }

        public void afficherLivres() {
            System.out.println("Livres de " + nom + " " + prenom + " :");
            for (Livre l : livres) {
                System.out.println("- " + l.getTitre());
            }
        }

        public String getNom() {
            return nom;
        }

        public String getPrenom() {
            return prenom;
        }
    }

    static class Livre {
        private String isbn;
        private String titre;
        private int annee;
        private ArrayList<Auteur> auteurs = new ArrayList<>();

        public Livre(String isbn, String titre, int annee) {
            this.isbn = isbn;
            this.titre = titre;
            setAnnee(annee);
        }

        public String getIsbn() {
            return isbn;
        }

        public void setIsbn(String isbn) {
            this.isbn = isbn;
        }

        public String getTitre() {
            return titre;
        }

        public void setTitre(String titre) {
            this.titre = titre;
        }

        public int getAnnee() {
            return annee;
        }

        public void setAnnee(int annee) {
            if (annee > 1900) {
                this.annee = annee;
            } else {
                System.out.println("L'annee doit etre après 1900 !");
            }
        }

        public void ajouterAuteur(Auteur auteur) {
            if (!auteurs.contains(auteur)) {
                auteurs.add(auteur);
                auteur.ajouterLivre(this);
            }
        }

        public void afficherAuteurs() {
            System.out.println("Auteurs de \"" + titre + "\" :");
            for (Auteur a : auteurs) {
                System.out.println("- " + a.getNom() + " " + a.getPrenom());
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Auteur> auteurs = new ArrayList<>();
        ArrayList<Livre> livres = new ArrayList<>();

        System.out.print("Combien d'auteurs voulez-vous ajouter ? ");
        int nbAuteurs = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < nbAuteurs; i++) {
            System.out.print("Nom de l'auteur : ");
            String nom = sc.nextLine();
            System.out.print("Prénom de l'auteur : ");
            String prenom = sc.nextLine();
            auteurs.add(new Auteur(nom, prenom));
        }

        System.out.print("Combien de livres voulez-vous ajouter ? ");
        int nbLivres = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < nbLivres; i++) {
            System.out.print("ISBN du livre : ");
            String isbn = sc.nextLine();
            System.out.print("Titre du livre : ");
            String titre = sc.nextLine();
            System.out.print("Année de publication : ");
            int annee = sc.nextInt();
            sc.nextLine();
            Livre livre = new Livre(isbn, titre, annee);

            System.out.print("Combien d'auteurs pour ce livre ? ");
            int nbAuteursLivre = sc.nextInt();
            sc.nextLine();
            for (int j = 0; j < nbAuteursLivre; j++) {
                System.out.print("Nom de l'auteur n°" + (j + 1) + " : ");
                String nomAuteur = sc.nextLine();
                // Recherche de l'auteur dans la liste
                Auteur auteur = null;
                for (Auteur a : auteurs) {
                    if (a.getNom().equalsIgnoreCase(nomAuteur)) {
                        auteur = a;
                        break;
                    }
                }
                if (auteur != null) {
                    livre.ajouterAuteur(auteur);
                } else {
                    System.out.println("Auteur non trouvé, il faut l'ajouter d'abord !");
                }
            }
            livres.add(livre);
        }

        // Affichage des livres d'un auteur donné
        System.out.print("Entrer le nom d'un auteur pour voir ses livres : ");
        String nomRecherche = sc.nextLine();
        for (Auteur a : auteurs) {
            if (a.getNom().equalsIgnoreCase(nomRecherche)) {
                a.afficherLivres();
            }
        }

        // Affichage des auteurs d'un livre donné
        System.out.print("Entrer le titre d'un livre pour voir ses auteurs : ");
        String titreRecherche = sc.nextLine();
        for (Livre l : livres) {
            if (l.getTitre().equalsIgnoreCase(titreRecherche)) {
                l.afficherAuteurs();
            }
        }

        sc.close();
    }
}