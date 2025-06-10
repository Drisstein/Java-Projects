
// EXO5 TD1 2025 : Conersion de Types avec opérateur Ternaire
// 1.D eclarer une variable debit représentantun débit réseau en Gbps et une variable tailleFichier,taille en Mo
// 2. Saisissez les deux variables puis les concertir en in tpour une valeur arrondie
// 3. Calculez et afficher le temps de téléchargements
//  4. Déclarez et saisissez la variable chargeCPU (en %) qui représente la charge CPU.
// Calculez une pénanlité de latence due à la charge CPU : si la charge CPU dépasse 70%, ajoutez une pénalité de chargeCPU/10 ms
// au temps de réponse.
// 6.Calculez un facteur d'am&lioration si le débit est elevé : si debit >80 Mbps, reduisons le temps de reponse de 10ms
// 7.Avec l'opérateur ternaire, dtm si le srveur est rapide ou lent en fct° du temps de reponse
// tempsReponse < 100 ms ? "Rapide":"Lent" ./.
import java.util.Scanner;

public class EXO5CPU {
    public static void main(String[] args) {
        Scanner lire = new Scanner(System.in);
        double debit; // debit en Gbps
        double tailleFichier; // taille du fichier en Mo

        System.out.print("Entrer le debit (Gbps):");
        debit = lire.nextDouble();
        System.out.print("Entrer la taille du fichier (Mo):");
        tailleFichier = lire.nextDouble();
        System.out.println("debit = " + debit + " Gbps" + "\nTaille fichier = " + tailleFichier + " Mo");

        // Calcul et affichage du temps de téléchargement
        double tempsTelechargement;
        // Saisis du chargeCPU(%)
        double chargeCPU;
        // Calcul du temps de latence du la charge CPU ,si ChargeCPU>70% =>
        // pénalté=chargeCPU/10ms au temps de reponse;
        lire.close();

    }
}
