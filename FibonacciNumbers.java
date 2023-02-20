import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter which nth even number of fibonacci series you want to print :");
        int n = scanner.nextInt();

        int count = 0;
        int firstNum = 0;
        int secondNum = 1;
        int nthFibonacci = 0;

        while (count < n) {
            if (secondNum % 2 == 0) {
                count++;
            }

            int nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;

            if (count == n) {
                nthFibonacci = firstNum;
            }
        }

        System.out.println("The " + n + "th Fibonacci number is: " + nthFibonacci);

    }
}
