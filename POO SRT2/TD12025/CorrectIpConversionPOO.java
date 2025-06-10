import java.util.Scanner;

public class CorrectIpConversionPOO {
    public static String conversionEnBinaire(String ip) {
        String[] octets = ip.split("\\.");
        String ipBinaire = "";

        for (String octet : octets) {
            int nombre = Integer.parseInt(octet);
            String binaire = Integer.toBinaryString(nombre);
            binaire = String.format("%08d", Integer.parseInt(octet));
            ipBinaire += binaire + ".";

        }
        return ipBinaire 
                .substring(0, ipBinaire.length() - 1);
    }

    //
    //
    public static String getIpClass(String ip) {
        int premierOctet = Integer.parseInt(ip.split("\\.")[0]);

        if (premierOctet >= 1 && premierOctet <= 126) {
            return "Classe A";
        } else if (premierOctet >= 128 && premierOctet <= 191) {
            return "Classe B";
        } else if (premierOctet >= 192 && premierOctet <= 223) {
            return "Classe C";
        } else if (premierOctet >= 224 && premierOctet <= 239) {
            return "Classe D (Multicast)";
        } else {
            return "Classe E (Experimental)";
        }
    }

    public static String PriveOuPublique(String ip) {
        String[] octets = ip.split("\\.");
        int premierOctet = Integer.parseInt(octets[0]);
        int SecondOctet = Integer.parseInt(octets[1]);

        if ((premierOctet == 10) || premierOctet == 172 && SecondOctet >= 16 && SecondOctet <= 31
                || (premierOctet == 192 && SecondOctet == 168)) {
            return "Adresse privée !";
        } else {
            return ("Adresse Publique !");
        }
    }

    public static void main(String[] args) {
        Scanner lire = new Scanner(System.in);
        System.out.print("Entrez une adresse IP :");
        String ip = lire.nextLine();
        System.out.println("Adresse IP en binaire :" + conversionEnBinaire(ip));
        System.out.println("Classe de l'adresse :" + getIpClass(ip));
        System.out.println("Type d'adresse : " + PriveOuPublique(ip));
        lire.close(); // Fermer le Scanner
    }
}