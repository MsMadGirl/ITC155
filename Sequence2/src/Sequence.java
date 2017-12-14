import java.util.Scanner;

public class Sequence {
	
	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		System.out.print("Please input a number: ");
		
		int n = console.nextInt();
		
		console.close();
		
		//makes sure n is greater than 0
		if (n < 0) {
			
			throw new IllegalArgumentException("IllegalArgumentError");
				
		}//end error if
		
		if (n % 2 == 0) {n = n/2;}
		else {n = (n+1)/2;}
		
		writeSequence(n);
		
	}
	
	public static void writeSequence(int n) {
		
		//when I had the division of n inside the if even and else down here
		//odd worked but even didn't
		//with the division in main, neither works
		//wtf?
					
			if (n > 0) {

				System.out.print(n);
				//recursion
				writeSequence(n - 1);
				System.out.print(n);
				
			}//end inner if
				
	}//end writeSequence

}//end class
