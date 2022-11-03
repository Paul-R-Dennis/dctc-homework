import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.io.FileNotFoundException;

public class ProgramTest2 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int numNums = 1;
		Random rd = new Random();
		int evenTotal = 0;
		int oddTotal = 0;

		System.out.println("How many numbers will you be processing (10 - 100)");
		do {

			try {
				numNums = scnr.nextInt();

				if (numNums < 10 || numNums > 100) {
					throw new IllegalArgumentException("Invalid, reenter 10 - 100");
				}
			}
			catch (NumberFormatException e) {
				System.out.println("Enter numeric whole number");
			} 
			catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}	
		} while (numNums < 10 || numNums > 100);


		int[] numbers = new int[numNums];

		for (int x = 0; x < numbers.length; x++) {
			numbers[x] = rd.nextInt(99) + 1;
		}

		Arrays.sort(numbers);

		System.out.println("The even numbers in numerical order:");
		for (int i = 0; i < numNums; i++) {
			if (numbers[i]%2==0 ) {
				System.out.print(numbers[i] + " ");
				evenTotal = evenTotal + numbers[i];
			}
		}

		System.out.println();

		System.out.println("The odd numbers in numerical order:");
		for (int i = 0; i < numNums; i++) {
			if (numbers[i]%2==1) {
				System.out.print(numbers[i] + " ");
				oddTotal = oddTotal + numbers[i];
			}
		}

		System.out.println();

		outputResults(oddTotal, evenTotal);
		scnr.close();
	}

	public static void outputResults(int oddTotal, int evenTotal) {
		int oddTotalF = oddTotal;
		int evenTotalF = evenTotal;

		if (evenTotalF > oddTotalF) {
			System.out.println("The even total " + evenTotalF);
			System.out.println("The odd total is " + oddTotalF);
			try {
				FileOutputStream fileStream = new FileOutputStream("Totals.txt");

				PrintWriter outFS = new PrintWriter(fileStream);

				outFS.println("The even total " + evenTotalF);
				outFS.println("The odd total is " + oddTotalF);
				outFS.close();
			} catch (FileNotFoundException e) {
				e.getMessage();
			}
		} 

		if (oddTotalF > evenTotalF ) {
			System.out.println("The odd total " + oddTotalF);
			System.out.println("The even total is " + evenTotalF);
			try {
				FileOutputStream fileStream = new FileOutputStream("Totals.txt");
				PrintWriter outFS = new PrintWriter(fileStream);

				outFS.println("The odd total " + oddTotalF);
				outFS.println("The even total is " + evenTotalF);
				outFS.close();

			} catch (FileNotFoundException e) {
				e.getMessage();
			}

		}
	}
}