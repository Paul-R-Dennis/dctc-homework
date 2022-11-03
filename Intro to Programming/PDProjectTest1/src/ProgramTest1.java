import java.util.Scanner;

public class ProgramTest1 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int[] cutScores = new int[3];
		cutScores[0] = 210;
		cutScores[1] = 230;
		cutScores[2] = 250;
		int levelAns;
		int score;
		
		do {
		
		System.out.println("Enter a level number (1-3)");
		levelAns = scnr.nextInt();
		if (levelAns < 1 || levelAns > 3) {
			System.out.println("Input invalid - Please enter a number 1-3");
		}
		
		} while (levelAns < 1 || levelAns > 3);
		
		System.out.println("What is your score?");
		score = scnr.nextInt();
		
		if (score < cutScores[levelAns-1]) {
			System.out.println("You do not qualify. The score required was " + cutScores[levelAns-1] + ".");
			System.out.println("You would have needed " + (cutScores[levelAns-1] - score) + " more points to qualify.");
		}
		if (score >= cutScores[levelAns-1]) {
			System.out.println("You qualify. The score required was " + cutScores[levelAns-1] + ".");
		}
	}

}
