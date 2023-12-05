package lessons.lesson2;

public class Flower {
    int petalCount=0;
    String s="initial value";
    Flower(int petails){
        petalCount=petails;
        System.out.println("Конструктор с параметром int,petalCount= "+ petalCount);
    }
    Flower(String s){
        System.out.println("Конструктор с параметром String, s= " + s);
        this.s=s;
    }
    Flower(String s, int petals){
        this(petals);
//        this(s); Вызов повторно другого конструктора запрещен!
        this.s=s;
        System.out.println("Арументы String и int");
    }
    Flower(){
        this("default_value",50);
        System.out.println("Конструктор по умолчанию");
//        this("default_value",50);//Вызов другого конструктора не первой строчкой - запрещен!
    }

    void printValues(){
//        this(); //Вызов конструктора черeз this разрешен только в других конструкторах
        System.out.println("Current values = "+ this.s + " and " + this.petalCount);
    }

}
