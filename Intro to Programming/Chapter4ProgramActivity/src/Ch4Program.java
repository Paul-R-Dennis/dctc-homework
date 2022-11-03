import java.util.Scanner;


public class Ch4Program {


	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String item;
		int cost;
		int category;
		int totalCost1 = 0;
		int totalCost2 = 0;
		int totalCost3 = 0;
		int keepGoing;

		do {
			System.out.println("What category is this item in?(1, 2, or 3)");
			category = scnr.nextInt();
			while (category < 1 || category > 3) {
				System.out.println("Invalid input - please enter a valid category(1-3)");
				category = scnr.nextInt();
			}
			if (category == 1) {
				System.out.println("What is the cost of the item?");
				cost = scnr.nextInt();
				while (cost < 0) {
					System.out.println("Invalid Cost - Please re-enter the cost of the item");
					cost = scnr.nextInt();
				}
				totalCost1 = totalCost1 + cost;
			}
			else if (category == 2) {
				System.out.println("What is the cost of the item?");
				cost = scnr.nextInt();
				while (cost < 0) {
					System.out.println("Invalid Cost - Please re-enter the cost of the item");
					cost = scnr.nextInt();
				}
				totalCost2 = totalCost2 + cost;
			}
			else if (category == 3) {
				System.out.println("What is the cost of the item?");
				cost = scnr.nextInt();
				while (cost < 0) {
					System.out.println("Invalid Cost - Please re-enter the cost of the item");
					cost = scnr.nextInt();
				}
				totalCost3 = totalCost3 + cost;
			}
			System.out.println("Would you like to enter another item? Enter 0 to continue");
			keepGoing = scnr.nextInt();
		} while (keepGoing == 0);
		System.out.println("Here are the total costs for all categories:");
		System.out.println("Category 1: $" + totalCost1);
		System.out.println("Category 2: $" + totalCost2);
		System.out.println("Category 3: $" + totalCost3);
		int mostExpensive = Math.max(Math.max(totalCost3,totalCost2),totalCost1);
		if (mostExpensive == totalCost1) {
			System.out.println("The most expensive category was Category 1");
		}
		else if (mostExpensive == totalCost2) {
			System.out.println("The most expensive category was Category 2");
		}
		else if (mostExpensive == totalCost3) {
			System.out.println("The most expensive category was Category 3");
		}
	}

}
