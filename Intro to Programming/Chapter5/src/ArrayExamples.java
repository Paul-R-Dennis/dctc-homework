import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class ArrayExamples {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		// Example 1
		//Fill up an array with values entered by the user -let the user determine how many values there will be
		//  Sort the array and display the values
		/*
		int howMany;
		do {
			System.out.println("How many values do you have? (1 or more)");
			howMany = scnr.nextInt();
		} while (howMany < 1);

		double[] numbers = new double[howMany];

		for (int x = 0; x < numbers.length; x++) {
			System.out.println("Enter value " + (x + 1));
			numbers[x] = scnr.nextDouble();
		}

		Arrays.sort(numbers);

		for (int x = 0; x < numbers.length; x++) {
			System.out.print(numbers[x] + " ");
		}

		System.out.println();

		System.out.println(Arrays.toString(numbers));

		 */
		// Example 2
		//  Simulate the rolling of a dice 1000 times
		//    Count how often each face value (1 - 6) is rolled
		//   Display the counts

		int[] counts = new int[7];
		Random ran = new Random();
		int fv;

		for (int x = 0; x < 1000; x++) {
			fv = ran.nextInt(6) + 1;
			counts[fv]++;
		}
		for (int index = 1; index < counts.length; index++) {
			System.out.println(index + " was rolled " + counts[index] + " times");
		}

	}
}
