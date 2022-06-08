
public class Menu {

	Command close;
	Command save;
	public Menu(Command close, Command save) {
		this.close = close;
		this.save = save;
	}
	
	public void close() {
		close.execute();
	}
	public void save() {
		save.execute();
	}
}
