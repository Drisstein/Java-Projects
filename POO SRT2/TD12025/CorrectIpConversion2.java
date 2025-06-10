import java.util.Scanner;

public class CorrectIpConversion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Lecture de l'adresse IP
        System.out.println("Entrez une adresse IP (4 octets séparés par des espaces) :");
        String ligne = sc.nextLine();
        String[] parties = ligne.trim().split(" ");

        // Vérification du nombre d'octets
        if (parties.length != 4) {
            System.out.println("Adresse invalide : vous devez entrer exactement 4 octets.");
            return;
        }

        int[] octets = new int[4];

        // Conversion des octets et affichage en binaire
        System.out.print("Adresse binaire : ");
        for (int i = 0; i < 4; i++) {
            octets[i] = Integer.parseInt(parties[i]);
            if (octets[i] < 0 || octets[i] > 255) {
                System.out.println("\nOctet invalide : " + octets[i]);
                return;
            }
            String binaire = String.format("%8s", Integer.toBinaryString(octets[i])).replace(' ', '0');
            System.out.print(binaire + " ");
        }
        System.out.println();

        // Détermination de la classe
        int premierOctet = octets[0];
        char classe;
        if (premierOctet >= 0 && premierOctet <= 127) classe = 'A';
        else if (premierOctet <= 191) classe = 'B';
        else if (premierOctet <= 223) classe = 'C';
        else if (premierOctet <= 239) classe = 'D';
        else classe = 'E';

        System.out.println("Classe de l'adresse : " + classe);

        // Détermination de la nature privée ou publique
        boolean estPrivee = (premierOctet == 10) ||
                            (premierOctet == 172 && octets[1] >= 16 && octets[1] <= 31) ||
                            (premierOctet == 192 && octets[1] == 168);

        System.out.println(estPrivee ? "Adresse privée" : "Adresse publique");
    }
}
