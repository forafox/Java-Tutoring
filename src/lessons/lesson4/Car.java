package lessons.lesson4;

public class Car {
    private int cost;
    int countOfWheel;

    boolean isNew;
    public Car(){
        cost=10000;
        countOfWheel=4;
        this.isNew=true;
    }

    public int getCost() {
        return cost;
    }
    public String getNew(){
        if(isNew){
            return "Новая!";
        }else{
            return "Не новая";
        }
    }

    public void setCost(int cost) {
        if(cost>15000){
            System.out.println("Цена сильно большая");
            return;
        } else if (cost<10000) {
            System.out.println("Цена сильно маленькая!");
            return;
        }
        this.cost = cost;
    }
    public void setNew(Boolean newState){
        this.isNew=newState;
    }
}
