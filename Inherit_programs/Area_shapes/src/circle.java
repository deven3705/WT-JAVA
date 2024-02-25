public class circle {
    double radius;

    // Constructor to initialize the radius
    public circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to print the details of the circle
    public void printDetails() {
        System.out.println("-----------Circle------------");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
    }
}
