public class VoitureDerivee extends Vehicule {
    private int nombreDePortes;

    // Constructeur
    public VoitureDerivee(boolean moteur, int vitesseMax, int nombreDePortes) {
        super(moteur, vitesseMax);
        this.nombreDePortes = nombreDePortes;
    }

    // toString
    public String toString() {
        return super.toString() + ", Nombre de portes : " + nombreDePortes;
    }

    // La méthode vMax est héritée de Vehicule
}
