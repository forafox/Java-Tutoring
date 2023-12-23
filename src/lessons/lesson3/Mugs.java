package lessons.lesson3;

public class Mugs {
    Mug mug1;
    Mug mug2;

    //Блок нестатической инициалиализации
    {
        mug1 = new Mug(1);
        mug2 = new Mug(2);
        System.out.println("mug 1 and mug 2 инициализированы");
    }

    Mugs() {
        System.out.println("Mugs");
    }

    Mugs(int i) {
        System.out.println("Mugs(int)");
    }
}
