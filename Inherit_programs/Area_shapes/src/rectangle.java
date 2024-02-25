import java.util.*;
public class rectangle {
     double length,width;

    // Constructor
    public rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method
    public double calculateArea() {
        return length * width;
    }

    public void printDetails() {
        System.out.println("--------Rectangle------");
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + calculateArea());
    }
}
