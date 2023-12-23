package lessons.lesson3;

public class Spoon {
    static int i;
    //Этот блок выполнится при создании экземпляра класса или
    //Когда произодйет первое обращение к статической переменной
    static {
        i = 47;
    }
}
