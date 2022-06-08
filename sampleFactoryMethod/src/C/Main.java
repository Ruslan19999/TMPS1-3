package C;

public class Main {

	public static void main(String[] args) {
		Factory factory = new Factory();
        Car BMW = factory.create("BMW");
        Car Audi = factory.create("Audi");
        BMW.drive();
        Audi.drive();

	}

}
