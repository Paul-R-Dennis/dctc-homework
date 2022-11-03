
public class examples {



	public static void main(String[] args) {
		//int a = 7;
		//double b = 3.0;
		
		
		//System.out.println(a/b);
		
		//System.out.println(a/3);
		//System.out.println(a/3.0);
		
		//System.out.println(a % b);
		
		int cents = 8934;
		//how many quarters, dimes, nickels and pennies?
		
		int quarters = cents / 25;
		cents %= 25;
		
		int dimes = cents / 10;
		cents %= 10;
		
		int nickels = cents / 5;
		cents %= 5;
		
		int pennies = cents / 1;
		
		System.out.println("Quarters: " + quarters);
		System.out.println("Dimes: " + dimes);
		System.out.println("Nickels: " + nickels);
		System.out.println("Pennies: " + pennies);
		
		int var1;
		double var2;
		
		var1 = 4078;
		
		var2 = 1.0000;
		var2 = 1;
		
		double average;
		int total =10;
		int count = 1;
		
		average = (double) total / count; 

	}

}
