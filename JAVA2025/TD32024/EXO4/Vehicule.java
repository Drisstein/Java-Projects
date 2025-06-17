public class Vehicule {
    private boolean moteur;
    private int vitesseMax;

    // Constructeur
    public Vehicule(boolean moteur, int vitesseMax) {
        this.moteur = moteur;
        this.vitesseMax = vitesseMax;
    }

    // toString
    public String toString() {
        return "Vehicule [Moteur: " + (moteur ? "Oui" : "Non") + ", Vitesse Max: " + vitesseMax + " km/h]";
    }

    // Méthode pour afficher la vitesse maximale
    public void vMax() {
        System.out.println("Vitesse maximale : " + vitesseMax + " km/h");
    }

    // Getter pour vitesseMax (utile pour accès depuis d'autres classes)
    public int getVitesseMax() {
        return vitesseMax;
    }
}
