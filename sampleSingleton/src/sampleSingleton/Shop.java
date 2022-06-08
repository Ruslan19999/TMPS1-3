package sampleSingleton;

public class Shop {
	private static 	Shop shop;//экземпляр

	private String nname = "Name \n";
	private String address = "Address \n";
	
	
	
	public static synchronized Shop getShop() {
		if(shop == null) {//если объект еще не создан
			shop = new Shop();//создать новый объект
		}
		return shop;// вернуть ранее созданный объект
	}
	

	
	public Shop addShop(String name,String adress) {
		nname += name + "\n";
		address += adress + "\n";
		return shop;
	}
	public void showe() {
		System.out.println(nname );
		System.out.println(address );
	}
	

	
	
}
