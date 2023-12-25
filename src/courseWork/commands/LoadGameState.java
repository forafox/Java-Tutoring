package courseWork.commands;

import courseWork.Game;

public class LoadGameState implements Command{
    Game game;

    public LoadGameState(Game game) {
        this.game = game;
    }

    public void execute(){
        game.loadGameState();
    }
}
