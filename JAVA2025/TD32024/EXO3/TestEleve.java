

public class TestEleve {
    public static void main(String[] args) {
        Eleve e1 = new Eleve("Sophie");

        System.out.println("Avant ajout des notes :");
        System.out.println(e1);

        int[] notes1 = {14, 16, 12};
        e1.ajouterNote(notes1);

        System.out.println("\nAprès ajout de notes :");
        System.out.println(e1);

        int[] notes2 = {15, 13};
        e1.ajouterNote(notes2);

        System.out.println("\nAprès ajout de nouvelles notes :");
        System.out.println(e1);
    }
}
