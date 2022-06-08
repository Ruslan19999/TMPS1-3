package C;

public class Factory {

	public Car create(String type) {
		switch (type) {
		case "BMW" : return new BMW(); 
		case "Audi" : return new Audi(); 
		default: return null;
	
		}
	}
}
