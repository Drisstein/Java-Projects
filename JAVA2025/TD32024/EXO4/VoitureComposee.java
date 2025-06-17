public class VoitureComposee {
    private Vehicule ve;
    private int nombreDePortes;

    // Constructeur
    public VoitureComposee(boolean moteur, int vitesseMax, int nombreDePortes) {
        this.ve = new Vehicule(moteur, vitesseMax);
        this.nombreDePortes = nombreDePortes;
    }

    // toString
    public String toString() {
        return ve.toString() + ", Nombre de portes : " + nombreDePortes;
    }

    // Affichage de la vitesse maximale
    public void afficherVitesseMax() {
        ve.vMax();
    }
}
