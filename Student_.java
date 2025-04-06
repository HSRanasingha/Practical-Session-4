// Practical 3 student
class Student {
    String name = "harshi";
    int marks = 100;

    // Default constructor
    Student() {
        name = "NoName";
    }

    // Constructor with one parameter
    Student(String n) {
        name = n;
    }

    // Constructor with two parameters
    Student(String n, int m) {
        name = n;
        marks = m;
    }
}

class StudentDemo {
    public static void main(String[] args) {
        System.out.println("Hi from StudentDemo class");
        System.out.println("Creating an object of Student class");

        // Create an object with a name and marks
        Student s1 = new Student("nice name", 85);
        System.out.println("Creating an object of Student class");

        // Print the initial values
        System.out.println("Name value of the object is " + s1.name);
        System.out.println("Marks value of the object is " + s1.marks);

        // Set new values for the object
        s1.name = "sandunika"; // Setting the name value
        s1.marks = 99;         // Setting the marks value

        // Print the updated values
        System.out.println("Name value of the object is " + s1.name);
        System.out.println("Marks value of the object is " + s1.marks);
    }
}
