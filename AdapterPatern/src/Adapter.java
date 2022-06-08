
public class Adapter implements Car{

	electroCar electroCar;
	
	
	
	public Adapter(electroCar electroCar) {
		super();
		this.electroCar = electroCar;// dependency injection
	}



	@Override
	public void price() {
        electroCar.price();		
	}

	@Override
	public void tankCapacity() {
		electroCar.powerReservey();
		
	}

}
