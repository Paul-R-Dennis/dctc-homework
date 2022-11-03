import java.util.Random;
import java.util.Scanner;

public class AdditionQuiz {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int answer;
		int correctCounter = 0;
		Random ran = new Random();
		int first;
		int second;
		int upperRange;
		int again;

		do {
			correctCounter = 0;
			do {
				System.out.println("Enter your max number for the problems");
				upperRange = scnr.nextInt();
			} while (upperRange < 0);

			for (int x = 1; x <= 10; x++) {
				first = ran.nextInt(upperRange + 1);
				second = ran.nextInt(upperRange + 1);
				System.out.println("What is " + first + " + " + second + "?");
				answer = scnr.nextInt();

				if (answer == first + second) {
					System.out.println("CORRECT");
					correctCounter++;
				}
				else {
					System.out.println("INCORRECT");
				}
			}
			System.out.println("You answered " + correctCounter + " questions correctly");
			
			System.out.println("Do you want another quiz? If so enter 0");
			again = scnr.nextInt();
		} while (again == 0);
	}

}
