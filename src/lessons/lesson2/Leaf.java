package lessons.lesson2;

public class Leaf {
    int i=0;
    Leaf increment(){
        i++;
        return this; //Возвращение ссылки на текущий объект
    }

    void printI(){
        System.out.println("Current i = "+ i);
    }
}
