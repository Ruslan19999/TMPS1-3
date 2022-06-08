package FFFF;

public class AbstractFactory {

	public Factory createFactory(String typeOfFactory) {
		switch (typeOfFactory) {
		case "Car": return new CarFactory();
		case "Tank": return new TankFactory();
		default: return null;
		}
	}

	
}
