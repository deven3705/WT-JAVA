public class fibo {
    public static void main(String[] args) {
        input fibonacciWithInput = new input();
        fibonacciWithInput.takeInput();
        System.out.println("The Fibonacci series is: ");
        fibonacciWithInput.generateFibonacci(fibonacciWithInput.number);
    }
}
