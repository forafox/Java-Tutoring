package lessons.lesson2;

public class OverloadingOrder {
    static void f(String s,int i){
        System.out.println("String "+ s + "Int " +i);
    }
    static void f(int i,String s){
        System.out.println("Int " +i+"String "+ s );
    }
}
