

public class Vehicle {
    void start() {
        System.out.println("Vehicle starting..");
    }
    void stop() {
        System.out.println("Vehicle stopping..");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starting - vroom!");
    }
    @Override
    void stop() {
        System.out.println("Car stopping - brake applied");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike starting - kick start!");
    }
    @Override
    void stop() {
        System.out.println("Bike stopping - brake applied");
    }
}

class Day1_Inheritance {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        v1.start();
        v1.stop();
        v2.start();
        v2.stop();
    }
}