import java.util.ArrayList;
import java.util.List;

public class Car implements Container{
	
	public String[] car = new String[4];

	
	{	
		car[0] = "BMW";
		car[1] = "AUDI";
		car[2] = "Porshe";
		car[3] = "Mercedes";

	}
	
	
	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return new CarIterator();
	}
	
	public class CarIterator implements Iterator{
		
		int index;

		@Override
		public boolean hasNext() {

			if(index < car.length) {
				return true;
			}

			return false;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			return car[index++];
		}
		
	}

}
