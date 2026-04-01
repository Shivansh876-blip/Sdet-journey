

// Class is the blueprint
 class Employee {

    // private = hidden from outside world
    // no one can do e.name directly
    private String name;
    private int salary;
    private int age;

    // GETTER for name
    // public = anyone can call this method
    // String = this method returns a String value
    // getName = naming convention — always "get" + VariableName
    public String getName() {
        return name;  // sends name value back to caller
    }

    // GETTER for salary
    public int getSalary() {
        return salary;
    }

    // GETTER for age
    public int getAge() {
        return age;
    }

    // SETTER for name
    // void = returns nothing
    // setName = naming convention — always "set" + VariableName
    // String name = accepts a value from outside
    public void setName(String name) {
        this.name = name;  // this.name = class variable, name = parameter
    }

    // SETTER for salary — with validation
    public void setSalary(int salary) {
        if (salary > 0) {
            this.salary = salary;  // only set if valid
        } else {
            System.out.println("Salary cannot be zero or negative!");
        }
    }

    // SETTER for age — with validation
    public void setAge(int age) {
        if (age >= 18 && age <= 60) {
            this.age = age;
        } else {
            System.out.println("Age must be between 18 and 60!");
        }
    }
}

class Day2_Encapsulation {
    public static void main(String[] args) {

        // create object
        Employee e = new Employee();

        // set values through setters
        e.setName("Gold");
        e.setSalary(50000);
        e.setAge(25);

        // get values through getters
        System.out.println("Name: " + e.getName());
        System.out.println("Salary: " + e.getSalary());
        System.out.println("Age: " + e.getAge());

        // test validation
        e.setSalary(-1000);   // prints: Salary cannot be zero or negative!
        e.setAge(15);         // prints: Age must be between 18 and 60!
    }
}
