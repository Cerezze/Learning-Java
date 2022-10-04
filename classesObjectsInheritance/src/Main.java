public class Main {
    public static void main(String[] args) {
        Car porche = new Car(
                2,
                4,
                "not porsche",
                "V8",
                "Red");
        //Car holden = new Car();

        System.out.println(porche.getDoors());

        Animal animal = new Animal(1, 1, 1, 5, "animal");

        Dog dog = new Dog(7, 8, "Yopedf", 2 ,4,1,20, "Long Silky");

        dog.eat();
        dog.walk();
    }
}