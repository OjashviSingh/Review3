import java.util.Scanner;

public class SmallestNumberFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int smallestNum = arr[0];
        int frequency = 1;

        for (int i = 1; i < size; i++) {
            if (arr[i] < smallestNum) {
                smallestNum = arr[i];
                frequency = 1;
            } else if (arr[i] == smallestNum) {
                frequency++;
            }
        }

        System.out.println("The smallest number in the array is: " + smallestNum);
        System.out.println("The frequency of the smallest number is: " + frequency);

    }
}
