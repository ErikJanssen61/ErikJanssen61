/*
 08-03
 */

import java.util.Scanner;

class ReverseWord {

  public static void main(String args[]) {
    Scanner myScanner = new Scanner(System.in);
    char c1, c2, c3, c4;

    c1 = myScanner.findWithinHorizon(".", 0).charAt(0);
    c2 = myScanner.findWithinHorizon(".", 0).charAt(0);
    c3 = myScanner.findWithinHorizon(".", 0).charAt(0);
    c4 = myScanner.findWithinHorizon(".", 0).charAt(0);

    System.out.print(c4);
    System.out.print(c3);
    System.out.print(c2);
    System.out.print(c1);
    System.out.println();
    myScanner.close();
  }
}
