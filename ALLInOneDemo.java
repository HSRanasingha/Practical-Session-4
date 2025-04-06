// Student class definition
/*class Student {
    String name;
    int marks;

    // Constructor for the Student class
    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

// Car class definition
class Car {
    private String model;

    // Constructor for the Car class
    public Car(String model) {
        this.model = model;
    }

    // Getter method for the model
    public String getModel() {
        return model;
    }
}*/

public class ALLInOneDemo {
    
    // Method to print a string
    public static void print(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        // Creating Student objects
        Student s1 = new Student("charle", 95);
        Student s2 = new Student("Adam", 65);
        Student s3 = new Student("Don", 55);
        
        // Printing student details
        print("Name of the student s1 is " + s1.name + " ,Marks = " + s1.marks);
        print("Name of the student s2 is " + s2.name + " ,Marks = " + s2.marks);
        print("Name of the student s3 is " + s3.name + " ,Marks = " + s3.marks);
        
        // Creating Car objects
        Car c1 = new Car("Mazda s3");
        Car c2 = new Car("Nissan Navara");
        
        // Printing car models
        print("Model of the car c1 is " + c1.getModel());
        print("Model of the car c2 is " + c2.getModel());
    }
}
