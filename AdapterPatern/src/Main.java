
public class Main {

	public static void main(String[] args) {
		
		
		Process process1 = new Process(new BMW());
		process1.price();
		process1.a();
		
		Adapter adapter = new Adapter(new BMWElectro());
		Process process = new Process(adapter);
		
		process.price();
		process.a();

	}

}
