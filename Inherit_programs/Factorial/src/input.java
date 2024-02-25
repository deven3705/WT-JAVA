import java.util.*;
public class input extends operation {
    void calculateFactorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        int factorial = super.fact(number);

        System.out.println("The factorial of " + number + " is " + factorial);
    }

}
