
import java.util.Scanner;

public class EXO3IpConersion {
   public EXO3IpConersion() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("---CONVERTISSEUR D'IP---");
      System.out.print("Entrer une adresse IP: ");
      String var2 = var1.nextLine();
      int var3 = Integer.parseInt(var2);
      System.out.println("" + var3 + "=" + Integer.toBinaryString(var3));
   }
}
