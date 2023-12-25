package courseWork;

import courseWork.commands.*;

import java.io.File;
import java.util.Scanner;

public class GameApp {
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter your nickname: ");
            String username = scanner.nextLine();
            System.out.println("Your nickname: " + username);

            Game game = new Game(username);
            Command startGameCommand = new StartGameCommand(game);
            Command backToGameCommand = new BackToGameCommand(game);
            Command loadGameState = new LoadGameState(game);
            Command saveGameCommand = new SaveGameCommand(game);
            Command exitGameCommand = new ExitGameCommand(game);

            while (true) {
                System.out.println("1. Start Game");
                System.out.println("2. Save Game");
                System.out.println("3. Load Game");
                System.out.println("4. Back Game");
                System.out.println("5. Exit Game");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        startGameCommand.execute();
                        break;
                    case 2:
                        saveGameCommand.execute();
                        break;
                    case 3:
                        loadGameState.execute();
                        break;
                    case 4:
                        backToGameCommand.execute();
                        break;
                    case 5:
                        exitGameCommand.execute();
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } finally {
            scanner.close();
        }
    }
}
