
public class Auto {

	//изолирует клиентов от компонентов сложной подсистемы 
	
	Car Bmw;
	Car audi;
	
	public Auto() {
		Bmw = new BMW();
		audi = new Audi();
	}
	
	public void bmw() {
		Bmw.drive();
		Bmw.engineСapacity();
		Bmw.price();
	}
	public void Audi() {
		audi.drive();
		audi.engineСapacity();
		audi.price();
	}
}
