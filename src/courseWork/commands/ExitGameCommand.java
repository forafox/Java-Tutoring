package courseWork.commands;

import courseWork.Game;

public class ExitGameCommand implements Command{

    Game game;

    public ExitGameCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.exit();
    }
}
