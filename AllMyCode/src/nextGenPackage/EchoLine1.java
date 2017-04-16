import java.util.Scanner;

/*
05-01
*/

class EchoLine1 {
	
	public static void main(String args[]) {
		
		int s = 33;
		Scanner mijnScanner = new Scanner(System.in);
		System.out.println("First type a line");
		System.out.println(mijnScanner.nextLine());
		System.out.println("Next type an Integer");
		System.out.println(mijnScanner.nextInt());
		System.out.println("Next type a Double");
		System.out.println(mijnScanner.nextDouble());
		System.out.println("Not sure what happens now");
		System.out.println(mijnScanner.next());
		
		
	}
}
