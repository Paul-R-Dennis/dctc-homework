//abstract data type
// library-like class
//reusable code


public class BaseballPlayer {
	//properties, data members, fields
	private String name;
	private String position;
	private int number;
	private double batAvg;
	
	public BaseballPlayer(String name, String position, int number, double batAvg) {
		//super();
		this.name = name;
		this.position = position;
		this.number = number;
		this.batAvg = batAvg;
	}
	
	public BaseballPlayer() {
		
	}

	//MUTATORS AND ACCESSORS
	//	setters and getters

	//accessors:
	//	public, value-returning, no parameters, get...
	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}

	//mutators
	//	public, void, parameter, set...
	public void setName(String n) {
		name = n;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public double getBatAvg() {
		return batAvg;
	}

	public void setBatAvg(double batAvg) {
		if (batAvg >= 0 && batAvg <= 1) {
			this.batAvg = batAvg;
		}
		else {
			this.batAvg = 0.0;
		}
	}

	public void setNumber(int num) {
		if (num >= 0 && num <= 99) {
			number = num;	
		}
		else {
			number = 0;
			//System.out.println("That's a bad number");
		}
	}
	
	//toString method
	public String toString() {
		return "Name: " + name + " Position: " + position + "\nNumber: " + number + " Batting average: " + batAvg;
	}
		
	
	
	
	
	
	

}
