
public class Main {

	public static void main(String[] args) {


		Shop shop = new Shop();
		People people = new People(shop);
		
		shop.changeData("Samsung 3423", 4000);

	}

}
