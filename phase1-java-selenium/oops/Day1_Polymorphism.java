

 class Shape {
    void area() {
        System.out.println("Area not defined");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void area() {
        double a = Math.PI * radius * radius;
        System.out.println("Area of Circle is: " + a);
    }
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    void area() {
        double a = length * breadth;
        System.out.println("Area of Rectangle is: " + a);
    }
}

class Day1_Polymorphism {
    public static void main(String[] args) {
        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(4, 6);

        s1.area();   // Area of Circle is: 78.53...
        s2.area();   // Area of Rectangle is: 24.0
    }
}