
public class BMW extends Car{

	public BMW(Color color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void drive() {
		System.out.println("BMW drive");
        color.color();
		
	}
}
