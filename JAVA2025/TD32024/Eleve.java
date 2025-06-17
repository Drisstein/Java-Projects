import java.util.ArrayList;
import java.util.Arrays;

public class Eleve {
    private String nom;
    private ArrayList<Integer> listeNotes;
    private double moyenne;
    private int totalNotes;
    private int sommeNotes;

    // Constructeur
    public Eleve(String nom) {
        this.nom = nom;
        this.listeNotes = new ArrayList<>();
        this.moyenne = 0;
        this.totalNotes = 0;
        this.sommeNotes = 0;
    }

    // Getter pour la moyenne
    public double getMoyenne() {
        return moyenne;
    }

    // Getter pour le nom
    public String getNom() {
        return nom;
    }

    // Getter pour la liste des notes (retourne un tableau de double)
    public double[] getListeNotes() {
        double[] notes = new double[listeNotes.size()];
        for (int i = 0; i < listeNotes.size(); i++) {
            notes[i] = listeNotes.get(i);
        }
        return notes;
    }

    // Ajouter des notes et mettre à jour la moyenne en temps constant
    public void ajouterNote(int[] notes) {
        for (int note : notes) {
            listeNotes.add(note);
            sommeNotes += note;
            totalNotes++;
        }
        if (totalNotes > 0) {
            moyenne = (double) sommeNotes / totalNotes;
        } else {
            moyenne = 0;
        }
    }

    // Redéfinition de toString()
    @Override
    public String toString() {
        return "Élève : " + nom +
                "\nNotes : " + listeNotes.toString() +
                "\nMoyenne : " + String.format("%.2f", moyenne);
    }
}
