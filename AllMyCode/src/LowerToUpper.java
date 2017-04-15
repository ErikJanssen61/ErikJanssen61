/*
 08-01
 */

import java.util.Scanner;

class LowerToUpper {

    public static void main(String args[]) {
        Scanner mijnScanner = new Scanner(System.in);
        
    	char smallLetter;
		char bigLetter;
        
		smallLetter = mijnScanner.findWithinHorizon(".", 0).charAt(0);
		System.out.println(smallLetter);
				
		bigLetter = Character.toUpperCase(smallLetter);
		System.out.println();
		System.out.println(bigLetter);
		

	}
}
