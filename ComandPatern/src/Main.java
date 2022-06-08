
public class Main {

	public static void main(String[] args) {

		Game game = new Game();
		
		Command close = new Closed(game);
		Command save = new Save(game);

		
		Menu menu = new Menu(close, save);
		menu.close();
		menu.save();
	}

}
