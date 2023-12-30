package lessons.lesson4;

import java.util.ArrayList;

public class Lesson4 {

    public void start(){
        //private - доступны только в пределах класса
        //public - доступен всем
        //protected - разрешает использование всем детям
        //package access -  ставится изначально

//        пакет- отдельнео множество файлов
//        Car car= new Car();
//        car.setCost(12000);
//        System.out.println("Машина новая?-"+car.getNew());
//        System.out.println(car.getCost());
//        car.countOfWheel=45;//statement
//        System.out.println(car.countOfWheel);

        //Повторное использование классов
        //Композиция
        //Наследование

//        Bus bus= new Bus();
//        bus.start();
        //наследование это "является"
        // Кошка ЯВЛЯЕТСЯ млекопитающим.
        //Млекопитающие ЯВЛЯЮТСЯ животными
        //но! машина не являетяс двигателем. Но двигатель часть машины

        Cat cat = new Cat();
    }

    void sayHello(){
        //без модификатора выставляется package access
        System.out.println("hello");
    }
}
