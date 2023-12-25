package courseWork.commands;

import courseWork.Game;

public class SaveGameCommand implements Command {
    Game game;

    public SaveGameCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.saveGameState();
    }
}
