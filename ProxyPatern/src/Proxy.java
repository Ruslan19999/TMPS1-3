public class Proxy implements Car{

	
	
	private BMW bmw;
	private String name;
	private int price;
	
	
	public Proxy(String name,int price) {
		super();
		this.name = name;
		this.price = price;
	}



	@Override
	public void drive() {
		
		if(bmw == null) {
			bmw = new BMW(name,price);
		} 
			bmw.drive();
		
	}

}
