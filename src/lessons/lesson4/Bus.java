package lessons.lesson4;

public class Bus {
    private Engine engine;
    private Wheel wheel;
    public Bus(){
        this.engine=new Engine();
        this.wheel=new Wheel();
    }

    public void start(){
        engine.start();
        wheel.setRun(true);
        System.out.println(wheel.isRun());
    }

}
