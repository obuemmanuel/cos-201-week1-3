import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double first = input.nextDouble();

        System.out.print("Enter second number: ");
        double second = input.nextDouble();

        System.out.println("Sum: " + (first + second));
        System.out.println("Difference: " + (first - second));
        System.out.println("Product: " + (first * second));

        if (second != 0) {
            System.out.println("Quotient: " + (first / second));
        } else {
            System.out.println("Division is undefined for a zero divisor.");
        }

        input.close();
    }
}