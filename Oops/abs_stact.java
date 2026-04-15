abstract class Vehicle {

    abstract void start();

    void fuel() {
        System.out.println("Fuel needed");
    }
}

class Car extends Vehicle {

    void start() {
        System.out.println("Car starts with key");
    }
}

public class abs_stact {
    public static void main(String[] args) {

        Vehicle v = new Car();
        v.start();
        v.fuel();
    }
}