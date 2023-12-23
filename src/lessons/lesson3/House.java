package lessons.lesson3;

public class House {
    Window w1 = new Window(1);//Перед конструктором

    House() {
        System.out.println("House");
        w3 = new Window(33); //Повторняа инициализация
    }

    Window w2 = new Window(2); //после конструктора

    public void f() {
        System.out.println("f");
    }

    Window w3 = new Window(3);//в самом конце
}
