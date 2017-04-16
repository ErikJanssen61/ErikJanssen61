package nextGenPackage;

/*
 * 07-02
 */

import java.util.Scanner;

public class KeepingMoreKidsQuiet {
	
    public static void main(String args[]) {
        Scanner myScanner = new Scanner(System.in);
        int gumballs;
        int kids;
        int gumballsPerKid;
        int gumballsLeft;
      
        System.out.print ("Hoe veel gomballen? ");
        gumballs = myScanner.nextInt();
        System.out.print ("Hoe veel kinderen? ");
        kids = myScanner.nextInt();
      
        gumballsPerKid = gumballs / kids;
        gumballsLeft = gumballs % kids;
      
        System.out.print("With ");
        System.out.print(gumballs);
        System.out.print(" gumballs and ");
        System.out.print(kids);
        System.out.println(" kids in the room.");
        
        System.out.print("Each kid gets ");
        System.out.print(gumballsPerKid);
        System.out.println(" gumballs.");
        
        System.out.print("Remaining: ");
        System.out.print(gumballsLeft);
        System.out.println(" gumballs.");
        
        myScanner.close();
    }

}
