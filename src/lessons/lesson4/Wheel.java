package lessons.lesson4;

public class Wheel {

    private boolean isRun;

    public Wheel(){
        isRun=false;
    }

    public String isRun() {
        return this.isRun ? "Мы крутимся!" : "Мы не крутимся :(";
    }

    public void setRun(boolean run) {
        isRun = run;
    }
}
