import java.util.ArrayList;
import java.util.List;

public class Caretaker {//Caretaker

	List<Memento> arr = new ArrayList<Memento>();
	
	public void add(Memento memento) {
		arr.add(memento);
	}
	
	public Memento getArr(int i) {
		return arr.get(i);
	}
}
