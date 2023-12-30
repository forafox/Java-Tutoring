package lessons.lesson4;

public class Animal {
    private int numberOfEyes;
    private String dataOfBirth;

    public Animal() {
        System.out.println("Конструктор Animal");
    }
    public Animal(String dataOfBirth) {
        this.dataOfBirth=dataOfBirth;
        System.out.println("Конструктор Animal #2");
    }

    public String getDataOfBirth() {
        return dataOfBirth;
    }

    public void setDataOfBirth(String dataOfBirth) {
        this.dataOfBirth = dataOfBirth;
    }

    public int getNumberOfEyes() {
        return numberOfEyes;
    }

    public void setNumberOfEyes(int numberOfEyes) {
        this.numberOfEyes = numberOfEyes;
    }
}
