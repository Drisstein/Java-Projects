public class Main {
    public static void main(String[] args) {
        System.out.println("--- Voiture avec COMPOSITION ---");
        VoitureComposee vc = new VoitureComposee(true, 180, 4);
        System.out.println(vc.toString());
        vc.afficherVitesseMax();

        System.out.println("\n--- Voiture avec HERITAGE ---");
        VoitureDerivee vd = new VoitureDerivee(true, 220, 2);
        System.out.println(vd.toString());
        vd.vMax(); // méthode héritée directement
    }
}
