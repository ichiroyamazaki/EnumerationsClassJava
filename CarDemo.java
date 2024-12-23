package Handout07;

import java.util.Scanner;

public class CarDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Enter Model: ");
                Model m = Model.valueOf(input.nextLine().toUpperCase());

                System.out.println("Enter Color: ");
                Color c = Color.valueOf(input.nextLine().toUpperCase());

                System.out.println("Enter Year: ");
                int yr = input.nextInt();
                input.nextLine(); // Consume newline character

                Car car1 = new Car(yr, m, c);

                System.out.println("Enter Model for second car: ");
                m = Model.valueOf(input.nextLine().toUpperCase());

                System.out.println("Enter Color for second car: ");
                c = Color.valueOf(input.nextLine().toUpperCase());

                System.out.println("Enter Year for second car: ");
                yr = input.nextInt();
                input.nextLine(); // Consume newline character

                Car car2 = new Car(yr, m, c);

                System.out.println("Thanks for using this product!");
                System.out.println();

                car1.display();
                car2.display();

                break; // Exit the loop after successful input
            } catch (Exception e) {
                System.out.println("Error: Invalid input. Please try again!");
                input.nextLine(); // Clear the invalid input
            }
        }

        input.close(); // Close the Scanner
    }
}
