
public class Closed implements Command{

	Game game;
	
	
	
	public Closed(Game game) {
		this.game = game;
	}

	@Override
	public void execute() {
		game.close();
		
	}

}
