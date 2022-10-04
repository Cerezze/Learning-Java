public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public Car(int doors, int wheels, String model, String engine, String color){
        this.doors = doors;
        this.wheels = wheels;
        this.model = model;
        this.engine = engine;
        this.color = color;
    }

    public int getDoors(){
        return this.doors;
    }
}
