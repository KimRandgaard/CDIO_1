import java.sql.SQLOutput;
import java.util.Scanner;

public class Spil {
    public static void main(String[] args) {
       //navn på spiller 1

        String another = "y";




      //slut spil
           while (another.equalsIgnoreCase("y"))
       {

           System.out.println("Spiller 1 skriv dit navn:");
           Scanner sc = new Scanner(System.in);

           String Spiller1 = sc.next();
           System.out.println("Velkommen " + Spiller1);

           //navn på spiller 2
           System.out.println("Spiller 2 skriv dit navn");
           String Spiller2 = sc.next();
           System.out.println("Velkommen " + Spiller2);

           //start spil
           System.out.println("Skriv 'Start' for at starte spillet!");
           String start = sc.next();
           start = start.toLowerCase();








           //slut på spil
           System.out.println();
           System.out.print("Vil du spille igen (y/n) ");
           another = sc.next();
       }
    }
}




