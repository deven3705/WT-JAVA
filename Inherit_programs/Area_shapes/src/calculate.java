import java.util.Scanner;

public class calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the user input for the rectangle
        System.out.println("Enter the length of the rectangle:");
        double length = sc.nextDouble();
        System.out.println("Enter the width of the rectangle:");
        double width = sc.nextDouble();

        // Get the user input for the circle
        System.out.println("Enter the radius of the circle:");
        double radius = sc.nextDouble();

        // Create instances of the Rectangle and Circle classes
        rectangle rect = new rectangle(length, width);
        circle cle = new circle(radius);

        // Print the details of the rectangle and circle
        System.out.println();
        rect.printDetails();
        System.out.println();
        cle.printDetails();
    }
}
