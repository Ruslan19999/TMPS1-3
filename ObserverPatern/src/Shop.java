import java.util.ArrayList;
import java.util.List;

public class Shop implements Notifier{
	
	String name;
	int price;

	private List<Observer> listd = new ArrayList<>();
	
    public void changeData(String name, int price){ 
        this.name = name;
        this.price = price;
        notifyObserver();
    }

	@Override
	public void addObserver(Observer observer) {
		listd.add(observer);
		
	}

	@Override
	public void deliteObserver(Observer observer) {
		 int i = listd.indexOf(observer);
	        if (i >= 0){
	            listd.remove(i);
	        }
		
	}

	@Override
	public void notifyObserver() {
		
		 for(Observer o : listd)
	        {
	            o.update(name,price);
	        }
		
	}

}