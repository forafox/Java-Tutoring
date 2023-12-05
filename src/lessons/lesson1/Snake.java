package lessons.lesson1;
/**
 * Тестовый класс для изучения базовых свойст полей , методов и ключевого слова static
 * @author Andrey
 */
public class Snake {
    // Значения по умолчанию для примитивов в полях
    int size;
    //Поле, отвечающее за имя змеи
    String name;
    String color;
    static String animalName = "Snake";
    static int countOfSnake=0;
    String getName(){
        return name;
    }

    void printName(){
        System.out.println(name);
    }
    void setName(String newName){
        name=newName;
    }
    void increment(){
        countOfSnake++;
    }

}
