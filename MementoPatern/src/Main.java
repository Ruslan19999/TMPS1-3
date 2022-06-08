
public class Main {

	public static void main(String[] args) {


		Car car = new Car();
		Caretaker caretaker = new Caretaker();
		
		car.setProbeg(2000);
		car.setPrice(2000);
		
		caretaker.add(car.saveStateToMemento());
		car.getStateFromMemento(caretaker.getArr(0));
	
		
		car.setProbeg(4000);
		car.setPrice(4000);
		
		caretaker.add(car.saveStateToMemento());
		car.getStateFromMemento(caretaker.getArr(1));

		
		car.getProbeg();
		car.getPrice();
		
		System.out.println("Current State: " + car.getProbeg() + " " + car.getPrice()); 
		car.getStateFromMemento(caretaker.getArr(0));
		System.out.println("Current State: " + car.getProbeg() + " " + car.getPrice()); 
		car.getStateFromMemento(caretaker.getArr(1));
		System.out.println("Current State: " + car.getProbeg() + " " + car.getPrice()); 

	}

}
