//Question (1)
public class ItemToPurchase {
	private String itemName = "none";
	private Double itemPrice = 0.0;
	private int itemQuantity = 0;

	public ItemToPurchase(String itemName, Double itemPrice, int itemQuantity) {
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemQuantity = itemQuantity;
	}
	public ItemToPurchase() {

	}

	public void setName(String n) {
		itemName = n; 
	}

	public String getName() {
		return itemName;
	}

	public void setPrice(Double p) {
		itemPrice = p;
	}
	public Double getPrice() {
		return itemPrice;
	}

	public void setQuantity(int q) {
		itemQuantity = q;
	}
	public int getQuantity() {
		return itemQuantity;
	}

	public String info() {
		return "Name: " + itemName + "\nPrice: " + itemPrice;
	}
	
	
}