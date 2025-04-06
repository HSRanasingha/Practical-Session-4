// Practical 2 main.java
class Car {
    private String model;
    
    // Getter
    public String getModel() {
        return model;
    }

    // Setter
    public void setModel(String newModel) {
        this.model = newModel;
    }
}

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        // Corrected method call (using parentheses instead of assignment operator)
        c1.setModel("Toyota Corolla");
        System.out.println(c1.getModel());
    }
}
