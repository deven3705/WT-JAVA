import java.util.Scanner;
public class input extends fibonacci{
    int number;

    void takeInput() {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        number = obj.nextInt();
    }
}
