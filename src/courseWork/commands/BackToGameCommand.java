package courseWork.commands;

import courseWork.Game;

public class BackToGameCommand implements Command{


    public BackToGameCommand(Game game) {
        this.game = game;
    }

    Game game;
    @Override
    public void execute() {
        game.backToGame();
    }


}
