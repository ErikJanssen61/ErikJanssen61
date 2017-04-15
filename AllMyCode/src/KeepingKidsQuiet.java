/*
 * 07-01
*/

class KeepingKidsQuiet {

    public static void main(String args[]) {
        int gumballs;
        int kids;
        int gumballsPerKid;
        int gumballsLeft;
      
        gumballs = 57;      
        kids = 4;
        gumballsPerKid = gumballs / kids;
        gumballsLeft = gumballs - (kids * gumballsPerKid);
      
        System.out.print("Met ");
        System.out.print(gumballs);
        System.out.print(" gomballen en ");
        System.out.print(kids);
        System.out.println(" kinderen in de kamer.");
        
        System.out.print("Krijgt elk kind ");
        System.out.print(gumballsPerKid);
        System.out.println(" gomballen.");
        
        System.out.print("En blijven er over: ");
        System.out.print(gumballsLeft);
        System.out.println(" gomballen.");
    }
}
