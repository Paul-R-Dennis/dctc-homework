import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ch9Program {
	public static void main (String[] args) throws IOException {
		FileInputStream fileByteStream = null;
		double fileNum;
		Scanner inFS = null;
		double total = 0;
		double Avg = 0;
		double numCount = 0;
		
		System.out.println("Opening file Amounts.txt");
		fileByteStream = new FileInputStream("Amounts.txt");
		inFS = new Scanner(fileByteStream);
		
		System.out.println("Reading and printing numbers.");
		
		while (inFS.hasNextDouble()) {
				fileNum = inFS.nextDouble();
				System.out.printf("num: %.2f", fileNum);
				System.out.println();
				total = total + fileNum;
				numCount = numCount + 1;
		}
		
		System.out.printf("Total: %.2f", total);
		System.out.println();
		
		Avg = total / numCount;
		System.out.printf("Average: %.2f", Avg);
		System.out.println();

		System.out.println("Closing file Amounts.txt");
		fileByteStream.close();
		inFS.close();
		
	}
}
