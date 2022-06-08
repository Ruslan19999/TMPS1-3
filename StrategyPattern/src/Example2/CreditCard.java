package Example2;

public class CreditCard implements Strategy{

	private String name;
	private int cardNumber;
	
	public CreditCard(String name, int i) {
		this.name = name;
		this.cardNumber = i;
	}



	@Override
	public void pay(double amount) {
		
		System.out.println("Имя: " + name + " " + "Номер карты: " + " " + cardNumber + " " + "Сумма" + amount );
	}

}
