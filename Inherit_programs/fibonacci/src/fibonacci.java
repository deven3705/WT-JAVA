import java.util.Scanner;
public class fibonacci {
    int num1 = 0, num2 = 1, nextTerm;

    void generateFibonacci(int n) {
        for (int i = 1; i <= n; ++i) {
            System.out.println(num1 + " ");
            nextTerm = num1 + num2;
            num1 = num2;
            num2 = nextTerm;
        }
    }
}
