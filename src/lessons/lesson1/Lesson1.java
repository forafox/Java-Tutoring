package lessons.lesson1;

public class Lesson1 {
    public void start(){
    System.out.println("Hello world!");

    String s = "5"; // Это неявное создание объекта и присвоение ссылки
    String str = new String("555"); // Явное создание объекта
    // Метод  == Функция
    // Конструктор - метод, который создает объект
    // new - создание объекта или создание экземпляра класса
    String test1 = "555";
    test1=s;

//
//        System.out.println(test1.hashCode());
//        System.out.println(s.hashCode());
//
//        int a=5;
//        Integer b=a;
//        System.out.println(b.hashCode());

    //Зоны видимости
        for (int a = 0; a < 10; a++) {
        int number=5;
    }

    Snake snake = new Snake();
    //sout
        System.out.println(snake.size);
        snake.setName("Polina");
        snake.increment();
        snake.printName();

         Snake snake2 = new Snake();
        snake2.increment();

        snake.setName("Andrey");
         snake2.animalName="not Snake";
        System.out.println(snake.animalName);
        System.out.println(snake2.animalName);
        System.out.println(snake.countOfSnake);
}
}
