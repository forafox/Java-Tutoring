package lessons.lesson3;

public class Lesson3 {
    int i=5;
    InitialValues initialValues = new InitialValues();
    public void start(){
        // Вывод информации про инициализацию по умолчанию
//        initialValues.print();

        // Порядок инициализации в классе
//        House h= new House();
//        h.f();
        //Сначала проходит инициализация полей базовыми значениями
        //Потом конструктор
        //Потом методы

        // Инициализация статических данных
//        Table.bowl1.f1(5);
        //Инициализация статических полей и методов происходит
//        а) Единожды
//        Б) Статика иницилазируется раньше, чем все остальное
        //Обращение к статическим полям и методам доступно без создания экземпляров класса

        //Явная инициализация статических членов (c помощью конструкции static)
//        System.out.println(Spoon.i);
        //Явная инициализация нестатических данных экземпляра
//        new Mugs();
//        System.out.println("new Mugs() окончено");
//        new Mugs(1);
//        System.out.println("new Mugs(int) окончено");

        //Списки аргументов переменной длины (строка)
//        printSomeArguments("Andrey","Polina","Dania");
//        printSomeArguments("1");
//        printSomeArguments();
        //Список аргументов переменной длины (Автоупаковка, Автораспаковка)
//        printSomeArguments(1,new Integer(1));
        //Перечисления
//        System.out.println(new House().toString());
        //Здесь уже будет переопределен toString(корректный вывод в консоль)
//            System.out.println(Spiciness.HOT);
            new Burrito(Spiciness.NOT).describe();
    }

    public void printSomeArguments(String ... values){
        System.out.println("Вызов метода");
        for(String value : values){
            System.out.println(value);
        }
    }
    public void printSomeArguments(Integer ... values){
        System.out.println("Вызов метода");
        for(Integer value : values){
            System.out.println(value+5);
        }
    }
}
