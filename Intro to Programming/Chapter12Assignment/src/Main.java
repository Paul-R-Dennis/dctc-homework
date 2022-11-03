import java.util.Scanner;

public class Main {

	public static void validate(String answer1, String answer2) {
		int ans1 = Integer.parseInt(answer1);
		int ans2 = Integer.parseInt(answer2);

		if (ans1 < 0 || ans1 > 100) {
			throw new IllegalArgumentException("First number is out of range");
		}
		if (ans2 < 0 || ans2 > 100) {
			throw new IllegalArgumentException("Second number is out of range");
		}
		System.out.println(ans1 + "/" + ans2 + " is " + ans1/ans2);
	}

	public static void main(String[] args) {
		try {
			Scanner scnr = new Scanner(System.in);

			System.out.print("Enter the first whole number (0-100): ");
			String answer1 = scnr.nextLine();

			System.out.print("Enter the second whole number (0-100): ");
			String answer2 = scnr.nextLine();

			validate(answer1, answer2);	
		} 

		catch (NumberFormatException e) {
			System.out.println("Enter numeric whole num"
					+ "ber");
		} 
		catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		catch (ArithmeticException e) {
			System.out.println("Can't divide by 0");
		}
		
	}

}
