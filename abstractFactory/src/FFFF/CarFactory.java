package FFFF;



public class CarFactory implements Factory{

	public Car createCar(String type) {
		switch (type) {
		case "BMW" : return new BMW(); 
		case "Audi" : return new Audi(); 
		default: return null;
	
		}
	}

	@Override
	public Tank createTank(String typeOfTank) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
