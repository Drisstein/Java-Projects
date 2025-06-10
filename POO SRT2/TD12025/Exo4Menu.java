import java.util.Scanner;

public class Exo4Menu {
    public static void main(String[] args) {
        Scanner lire = new Scanner(System.in);
        System.out.println("--CALCULATRICE--");
        System.out.print("Entrer un entier : ");
        double x = lire.nextDouble();
        System.out.print("Entrer un entier : ");
        double y = lire.nextDouble();
        System.out.println("********MENU**********");
        System.out.println(
                "1.----->SOMME<------\n2.----->Produit<---------\n3.----->Minimum<------\n4.----->Maximum<------\n5.----->Moyenne<------ ");
        System.out.print("Donner votre choix :");
        int choix = lire.nextInt();
        switch (choix) {
            case 1:
                System.out.println(x + "+" + y + "=" + (x + y));
                break;
            case 2:
                System.out.println(x + "*" + y + "=" + (x * y));
                break;
            case 3:
                double Min = (x < y) ? x : y;
                System.out.println("Le minimum est :" + Min);
                break;
            case 4:
                double Max = (x > y) ? x : y;
                System.out.println("Le Maximum est : " + Max);
                break;
            case 5:
                System.out.println("Moyenne" + "=" + (x + y) / 2);
                break;

            default:
                System.out.println("Choix Indisponible !");
                break;
        }

    }
}
