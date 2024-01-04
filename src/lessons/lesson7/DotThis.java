package lessons.lesson7;

public class DotThis {
    void f() { System.out.println("DotThis.f()"); }


    public class Inner {
        public DotThis outer() {
            return DotThis.this;//Возвращает ссылку на родителя
            // A plain "this" would be Inner's "this"
        }
    }

    public Inner inner() { return new Inner(); }
}

