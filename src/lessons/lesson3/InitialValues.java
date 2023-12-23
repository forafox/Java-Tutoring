package lessons.lesson3;

public class InitialValues {
    boolean t;//Поля проходят инициализацию автоматически
    char c;
    byte b;
    int g = 5;//явная инициализация

    void print() {
//        int a;//Не работает, потому что это локальная переменная
//        System.out.println(a);
        System.out.println(t);
        System.out.println(c);
        System.out.println(b);
    }
}
