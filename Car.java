package Handout07;

public class Car {
    private int year;
    private Model model;
    private Color color;

    // Constructor
    public Car(int year, Model model, Color color) {
        this.year = year;
        this.model = model;
        this.color = color;
    }

    // Display method
    public void display() {
        System.out.println("Year: " + year);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
    }
}
