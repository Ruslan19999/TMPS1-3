
public class Main {

	public static void main(String[] args) {

		Car car  = new Car();
		
		Iterator iterator = car.getIterator();



		while(iterator.hasNext()) {
		String name = (String)iterator.next();
		System.out.println(name);
	}
	}

}
