
public class BMW implements Car{

	private String name;
	private int price;
	
	public BMW(String name, int price) {
		
		this.name = name;
		this.price = price;
	}
	
	@Override
	public void drive() {
		
		System.out.println("BMW Name: " + name );
		System.out.println("Price: " + price);
	}

}
