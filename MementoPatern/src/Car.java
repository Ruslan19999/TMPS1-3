import java.util.List;

public class Car {//originator
	
	Memento memento;

	private int probeg;
	private int price;
	
	public int getProbeg() {
		return probeg;
	}
	public void setProbeg(int probeg) {
		this.probeg = probeg;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	} 

    public Memento saveStateToMemento(){  
    	
    	memento = new Memento(probeg, price);
    	
		return memento;
     }  
    
     public void getStateFromMemento(Memento memento){  
        probeg = memento.getProbeg();
        price = memento.getPrice();
     }  
	
}
