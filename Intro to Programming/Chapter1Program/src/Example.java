import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int credits;
		
		//ask the user for the number of credits that they are taking
		System.out.print("How many credits are you taking? ");
		credits = scnr.nextInt();
		
		System.out.print("Outside of class, you should be putting in ");
		System.out.println(credits * 2);

	}

}
