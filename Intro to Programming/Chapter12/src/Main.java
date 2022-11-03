import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		int credits = 0;

		boolean x = true;
		//scnr.close();

		//while(x) {
		//try {
		do {
			try {
				System.out.println("Enter the # of credits (1 - 32)");
				credits = scnr.nextInt();
			} 
			catch ( InputMismatchException problem1) {
				System.out.println("Problem with the input");
				scnr.next();
				//System.out.println(problem1.getMessage());
				//System.out.println(problem1.getStackTrace());
			}
			catch (Exception catchAll) {
				System.out.println(catchAll.getMessage());
			}



		} while (credits < 1 || credits > 32);

		if (credits <= 16)
			System.out.println("First Semester");
		else
			System.out.println("Second Semeseter");
		//	x = false;

		System.out.println("All done");
	}

}
