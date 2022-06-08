
public class Save implements Command{

	Game game;
	
	
	
	public Save(Game game) {
		this.game = game;
	}

	@Override
	public void execute() {
		game.save();
		
	}

}
