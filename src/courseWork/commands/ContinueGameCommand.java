package courseWork.commands;

import courseWork.Game;

public class ContinueGameCommand implements Command{
    Game game;

    public ContinueGameCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
//        game.continueGame();
    }
}
