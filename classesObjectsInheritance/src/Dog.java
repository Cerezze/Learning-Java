public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(int size, int weight, String name, int eyes, int legs, int tail, int teeth, String coat) {
        super(1, 1, size, weight, name);
        this.coat = coat;
        this.eyes = eyes;
        this.legs = legs;
        this.teeth = teeth;
        this.tail = tail;
    }

    private void chew(){
        System.out.println("Dog.chew() Called");
    }

    @Override
    public void eat(){
        System.out.println("Dog.eat() Called");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("Dog.walk() Called");
        move(5);
    }

    public void run(){
        System.out.println("Dog.run() Called");
        move(10);
    }
}
