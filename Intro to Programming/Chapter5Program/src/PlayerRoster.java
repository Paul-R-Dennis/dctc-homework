import java.util.Scanner;

public class PlayerRoster {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		char option;
		int jn;
		int rating;

		int[] jerseyNum = new int[6];
		int[] ratingNum = new int[6];


		for (int x = 1; x <= 5; x++) {
			System.out.println("Enter player " + x + "'s jersey number:");
			jerseyNum[x] = scnr.nextInt();
			System.out.println("Enter player " + x + "'s rating:");
			ratingNum[x] = scnr.nextInt();
			System.out.println();
		}
		System.out.println("ROSTER");
		for (int x = 1; x <= 5; x++) {
			System.out.println("Player " + x + " -- Jersey number: " + jerseyNum[x] + ", Rating: " + ratingNum[x]);
		}
		do {
			System.out.println();
			System.out.println("MENU");
			System.out.println("u - Update player rating");
			System.out.println("a - Output players above a rating");
			System.out.println("r - Replace player");
			System.out.println("o - Output roster");
			System.out.println("q - Quit");
			System.out.println();
			System.out.println("Choose an option:");
			option = scnr.next().charAt(0);

			if (option == 'o') {
				System.out.println("ROSTER");
				for (int x = 1; x <= 5; x++) {
					System.out.println("Player " + x + " -- Jersey number: " + jerseyNum[x] + ", Rating: " + ratingNum[x]);
				}
			}
			else if (option == 'u') {
				System.out.println("Enter a jersey number:");
				jn = scnr.nextInt();
				for (int x = 1; x <= 5; x++) {
					if (jn == jerseyNum[x]) {
						System.out.println("Enter a new rating for player:");
						rating = scnr.nextInt();
						ratingNum[x] = rating;
					}
				}


			}
			else if (option == 'a') {
				System.out.println("Enter a rating:");
				rating = scnr.nextInt();
				System.out.println();
				System.out.println("ABOVE " + rating);
				for (int x = 1; x <= 5; x++) {
					if (ratingNum[x] > rating) {
						System.out.println("Player " + x + " -- Jersey number: " + jerseyNum[x] + ", Rating: " + ratingNum[x]);
					}
				}
			}
			else if (option == 'r') {
				System.out.println("Enter a jersey number:");
				jn = scnr.nextInt();
				for (int x = 1; x <= 5; x++) {
					if (jn == jerseyNum[x]) {
						System.out.println("Enter a new jersey number:");
						int jn2 = scnr.nextInt();
						jerseyNum[x] = jn2;
						System.out.println("Enter a rating for the new player");
						int rating2 = scnr.nextInt();
						ratingNum[x] = rating2;
					}
				}
			}

		} while (option != 'q');
	}
}

