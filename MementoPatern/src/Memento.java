
public class Memento {

	private int probeg;
	private int price; 

	public Memento(int name, int price) {
		this.probeg = name;
		this.price = price; 
	}
	public int getProbeg() {
		return probeg;
	}
	public int getPrice() {
		return price;
	}
}
