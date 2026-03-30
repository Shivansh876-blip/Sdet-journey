package OOps;

public class Vehicle {
    void start() {
        System.out.println("Vehicle starting.."); // add a default message
    }
    void stop() {
        System.out.println("Vehicle stopping.."); // add a default message
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starting - vroom!");
    }

    @Override
    void stop() {                                  // override stop() too
        System.out.println("Car stopping - brake applied");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike starting - kick start!");
    }

    @Override
    void stop() {                                  // override stop() too
        System.out.println("Bike stopping - brake applied");
    }
}

class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Car();   // polymorphism - Vehicle reference
        Vehicle v2 = new Bike();

        v1.start();   // prints: Car starting - vroom!
        v1.stop();

        v2.start();   // prints: Bike starting - kick start!
        v2.stop();
    }
}

