package nextGenPackage;

/*
 * 09-02
 */

import java.util.Random;
import java.util.Scanner;

public class AnswerYesOrNo {
	
	  public static void main(String args[]) {
		    Scanner myScanner = new Scanner(System.in);
		    Random myRandom = new Random();
		    int randomNumber;

		    System.out.print("Type your question, my child:  ");
		    myScanner.nextLine();
		    
		    myScanner.close();

		    randomNumber = myRandom.nextInt(10) + 1;

		    if (randomNumber > 5) {
		      System.out.println("Yes. Isn't it obvious?");
		    } else {
		      System.out.println("No, and don't ask again.");
		    }
		  }

}
