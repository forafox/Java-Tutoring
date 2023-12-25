package courseWork;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Game {

    String username;
    Boolean isRunning;

    private static final Map<String, String> MY_CONSTANT_MAP = new HashMap<String, String>() {{
        put("Вернуться домой", "2");
        put("Отправиться на поиски", "3");
        put("Попытаться разузнать о Бельчонке у лесных жителей", "4");
        put("Искать Бельчонка в одиночку2", "5");
        put("Расспросить Сову", "6");
        put("Расспросить Волка", "7");
        put("Поверить Сове и отправиться вглубь леса", "8");
        put("Сове не стоит верить -> Искать Бельчонка в одиночку", "5");
        put("Волк прав -> Вернуться домой", "2");
        put("-> Искать Бельчонка в одиночку", "5");
        put("Нет, потрачено слишком много времени, нужно идти дальше -> Искать Бельчонка в одиночку", "5");
        put("Нужно воспользоваться шансом и раздобыть мёд", "9");
        put("Подождать, вдруг пчёлы улетят", "10");
        put("Нужно попытаться выкрасть мёд немедленно", "11");
        put("Поесть немного и передохнуть", "12");
        put("Скорее отнести мёд Медвежонку", "13");
        put("Медвежонок ничего не знает, нужно продолжить поиски -> Искать Бельчонка в одиночку", "5");
        put("Может быть он прав и Лисёнок просто паникует -> Вернуться домой", "2");
    }};


    Map<String, Paragraph> paragraphs;
    Paragraph currentParagraph;

    public Game(String username) {
        this.username = username;
        paragraphs = new HashMap<>();
    }

    void loadParagraphs() {
        try {
            File file = new File("src/courseWork/paragraphs2.txt");

            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split("\\|");
                String id = parts[0];
                String text = parts[1];
                Map<String, String> options = new HashMap<>();

                for (int i = 2; i < parts.length; i += 2) {
                    options.put(parts[i], parts[i + 1]);
                }

                paragraphs.put(id, new Paragraph(id, text, options));
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void loadGameState() {
        loadParagraphs();
        try {
            File file = new File(username.toLowerCase() + "-save.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(":");
                if (parts.length == 2 && parts[0].equals("lastParagraph")) {
                    String lastParagraphId = parts[1].trim();
                    if (paragraphs.containsKey(lastParagraphId)) {
                        currentParagraph = paragraphs.get(lastParagraphId);
                        System.out.println("Game loaded. Resuming from paragraph: " + lastParagraphId);
                        play();
                    } else {
                        System.out.println("Error: Invalid paragraph ID in the save file.");
                    }
                    break;
                }
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void saveGameState() {
//        File userFolder = new File("/src/courseWork/" + username.toLowerCase());
//        if (!userFolder.exists()) {
//            userFolder.mkdir();
//        }
        File saveFile = new File(username.toLowerCase() + "-save.txt");
        try (PrintWriter writer = new PrintWriter(new FileWriter(saveFile, false))) {
            // Записываем данные в файл (файл будет перезаписан)
            if(this.currentParagraph==null){
                writer.println("lastParagraph:" + 1);
            }else {
                writer.println("lastParagraph:" + this.currentParagraph.id);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void backToGame() {
        File saveFile = new File(username.toLowerCase() + "-save.txt");

        if (saveFile.exists()) {
            // Если файл сохранения существует, загружаем состояние игры
            loadGameState();
        } else {
            // Если файла сохранения нет, начинаем новую игру
            startGame();
        }
    }

    public void exit() {
        System.out.println("Спасибо за игру! До встречи!");
        System.exit(0);
    }

    public void startGame() {
            loadParagraphs();
            System.out.println("Новая игра началась!");
            currentParagraph = paragraphs.get("1");
            play();
    }

    void play() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(currentParagraph.text);
            currentParagraph.options.forEach((key, value) -> System.out.println(key + '.' + value));
            System.out.println("M. Main Menu");

            String choice = scanner.next().toUpperCase();

            if (choice.equals("M")) {
                saveGameState();
                return;
            } else if (MY_CONSTANT_MAP.containsKey(currentParagraph.options.get(choice))) {
                currentParagraph = paragraphs.get(MY_CONSTANT_MAP.get(currentParagraph.options.get(choice)));
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
            if (currentParagraph.options.isEmpty()) {
                System.out.println(currentParagraph.text);
                System.out.println("Game Over. You reached the end.");
                break;
            }
        }
    }


    public Boolean getRunning() {
        return isRunning;
    }

    public void setRunning(Boolean running) {
        isRunning = running;
    }
}
