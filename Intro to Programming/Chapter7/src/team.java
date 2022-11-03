
public class team {

	public static void main(String[] args) {
		
		BaseballPlayer p1 = new BaseballPlayer();
		
		//System.out.print(p1.getNumber());
		//p1.setNumber(12356677);
		
		System.out.println(p1);
		p1.setName("Joe");
		p1.setBatAvg(.199);
		System.out.println(p1);
		
		BaseballPlayer p2 = new BaseballPlayer("Miguel", "first base", 34, .108);
		System.out.println(p2);
		
	}

}
