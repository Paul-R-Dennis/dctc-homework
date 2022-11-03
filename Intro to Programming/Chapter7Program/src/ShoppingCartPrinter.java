import java.util.Scanner;
//Question (1)
public class ShoppingCartPrinter {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		//Question (2)
		ItemToPurchase i1 = new ItemToPurchase();
		ItemToPurchase i2 = new ItemToPurchase();
		
		System.out.println("Item 1");
		System.out.println("Enter the item name:");
		i1.setName(scnr.nextLine());
		System.out.println("Enter the item price:");
		i1.setPrice(scnr.nextDouble());
		System.out.println("Enter the item quantity:");
		i1.setQuantity(scnr.nextInt());
		
		scnr.nextLine();
		System.out.println();
		
		System.out.println("Item 2");
		System.out.println("Enter the item name:");
		i2.setName(scnr.nextLine());
		System.out.println("Enter the item price:");
		i2.setPrice(scnr.nextDouble());
		System.out.println("Enter the item quantity:");
		i2.setQuantity(scnr.nextInt());
		System.out.println();
		
		//Question (3)
		
		System.out.println("TOTAL COST");
		System.out.println(i1.getName() + ": " + i1.getQuantity() + " @ $" + i1.getPrice() + " = $" + i1.getQuantity()*i1.getPrice());
		System.out.println(i2.getName() + ": " + i2.getQuantity() + " @ $" + i2.getPrice() + " = $" + i2.getQuantity()*i2.getPrice());
		
		double total = (i1.getQuantity()*i1.getPrice()) + (i2.getQuantity()*i2.getPrice());
		System.out.println("Total: $" + total);
		
	}

}
