
public interface Notifier {//набдюдаемый объект

	void addObserver(Observer observer);
	void deliteObserver(Observer observer);
	void notifyObserver();
}
