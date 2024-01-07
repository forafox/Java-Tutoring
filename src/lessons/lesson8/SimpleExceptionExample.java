package lessons.lesson8;


public class SimpleExceptionExample {
    public void f() throws SimpleException {
        System.out.println("Throw SimpleException from f()");
        throw new SimpleException();
    }
}
