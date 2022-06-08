package FFFF;

public class TankFactory implements Factory{

	public Tank createTank(String type) {
		switch (type) {
		case "T34" : return new T34(); 
		case "T87" : return new T87(); 
		default: return null;
	
		}
	}

	@Override
	public Car createCar(String typeOfCar) {
		// TODO Auto-generated method stub
		return null;
	}
}
