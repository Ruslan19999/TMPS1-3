package Example2;

public class Cash implements Strategy{

	@Override
	public void pay(double amount) {

		System.out.println("Плата" + amount + "Наличными");

		
	}

}
