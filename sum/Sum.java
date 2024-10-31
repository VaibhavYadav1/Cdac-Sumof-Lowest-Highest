import java.util.Scanner;

public class SumOfLargestAndSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Find the largest and smallest numbers using Math.max and Math.min
        int largest = Math.max(Math.max(num1, num2), num3);
        int smallest = Math.min(Math.min(num1, num2), num3);

        // Calculate the sum
        int sum = largest + smallest;

        System.out.println("The sum of the largest and smallest numbers is: " + sum);
    }
}
