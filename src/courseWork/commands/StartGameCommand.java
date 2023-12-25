package courseWork.commands;

import courseWork.Game;

public class StartGameCommand implements Command{

    Game game;

    public StartGameCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.startGame();
    }
}
