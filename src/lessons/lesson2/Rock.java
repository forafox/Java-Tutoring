package lessons.lesson2;

public class Rock {
    // чтобы сгенерировать конструтор, можно воспользоваться комбинацией alt+insert (Cmd + N on macOs)

    //Конструтор по умолчанию
    public Rock() {
        System.out.println("Rock");
    }

    //Конструктор с доп. аргументами
    public Rock(int i) {
        System.out.println("Rock " + i);
    }
}
