import java.util.Scanner;

import Example2.Cash;

import Example2.Contextt;
import Example2.CreditCard;

public class Main {

	public static void main(String[] args) {

		Contextt context = new Contextt();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Способ оплаты");
		String result = scanner.nextLine();
		System.out.println("Сума");
		int amount = scanner.nextInt();
		
		if(result.equals("Credit")){
			 context.setStrategy(new CreditCard("Gleb", 1234567));
		}else if(result.equals("Cash")) {
			context.setStrategy(new Cash());
		}
		context.Pay(amount);

	}

}
