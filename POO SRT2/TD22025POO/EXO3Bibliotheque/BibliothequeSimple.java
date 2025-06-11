import java.util.ArrayList;
import java.util.Scanner;

public class BibliothequeSimple {

    // === Classe Auteur ===
    static class Auteur {
        private String nom;
        private String prenom;
        private ArrayList<Livre> livres;

        public Auteur(String nom, String prenom) {
            this.nom = nom;
            this.prenom = prenom;
            this.livres = new ArrayList<>();
        }

        public void ajouterLivre(Livre livre) {
            if (!livres.contains(livre)) {
                livres.add(livre);
            }
        }

        public String getNomComplet() {
            return prenom + " " + nom;
        }

        public ArrayList<Livre> getLivres() {
            return livres;
        }

        @Override
        public String toString() {
            return getNomComplet();
        }
    }

    // === Classe Livre ===
    static class Livre {
        private String isbn;
        private String titre;
        private int annee;
        private ArrayList<Auteur> auteurs;

        public Livre(String isbn, String titre, int annee) {
            this.isbn = isbn;
            this.titre = titre;
            if (annee > 1900) {
                this.annee = annee;
            } else {
                this.annee = 1901; // valeur par défaut minimale
            }
            this.auteurs = new ArrayList<>();
        }

        public void ajouterAuteur(Auteur auteur) {
            if (!auteurs.contains(auteur)) {
                auteurs.add(auteur);
                auteur.ajouterLivre(this); // liaison simple et claire
            }
        }

        public String getTitre() {
            return titre;
        }

        public ArrayList<Auteur> getAuteurs() {
            return auteurs;
        }

        @Override
        public String toString() {
            return "\"" + titre + "\" (" + annee + ")";
        }
    }

    // === Programme Principal ===
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Auteur> auteurs = new ArrayList<>();
        ArrayList<Livre> livres = new ArrayList<>();

        // Ajout d'auteurs
        System.out.print("Combien d'auteurs ? ");
        int nbAuteurs = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < nbAuteurs; i++) {
            System.out.print("Nom : ");
            String nom = sc.nextLine();
            System.out.print("Prénom : ");
            String prenom = sc.nextLine();
            auteurs.add(new Auteur(nom, prenom));
        }

        // Ajout de livres
        System.out.print("Combien de livres ? ");
        int nbLivres = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < nbLivres; i++) {
            System.out.print("ISBN : ");
            String isbn = sc.nextLine();
            System.out.print("Titre : ");
            String titre = sc.nextLine();
            System.out.print("Année : ");
            int annee = Integer.parseInt(sc.nextLine());

            Livre livre = new Livre(isbn, titre, annee);

            // Lier des auteurs au livre
            System.out.println("Choisissez les auteurs (indices séparés par virgule) :");
            for (int j = 0; j < auteurs.size(); j++) {
                System.out.println(j + " : " + auteurs.get(j));
            }
            System.out.print("Vos choix : ");
            String[] indices = sc.nextLine().split(",");
            for (String idx : indices) {
                int index = Integer.parseInt(idx.trim());
                if (index >= 0 && index < auteurs.size()) {
                    livre.ajouterAuteur(auteurs.get(index));
                }
            }

            livres.add(livre);
        }

        // Afficher les livres d'un auteur
        System.out.print("Nom d’un auteur à rechercher : ");
        String nomRecherche = sc.nextLine();
        for (Auteur a : auteurs) {
            if (a.getNomComplet().toLowerCase().contains(nomRecherche.toLowerCase())) {
                System.out.println("Livres de " + a + " :");
                for (Livre l : a.getLivres()) {
                    System.out.println("- " + l);
                }
            }
        }

        // Afficher les auteurs d'un livre
        System.out.print("Titre d’un livre à rechercher : ");
        String titreRecherche = sc.nextLine();
        for (Livre l : livres) {
            if (l.getTitre().toLowerCase().contains(titreRecherche.toLowerCase())) {
                System.out.println("Auteurs de " + l + " :");
                for (Auteur a : l.getAuteurs()) {
                    System.out.println("- " + a);
                }
            }
        }

        sc.close();
    }
}
