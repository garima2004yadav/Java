import java.util.Scanner;

public class Swap{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        swapWithoutVariable(num1, num2);
        
        System.out.println("After swapping (without a third variable):");
        System.out.println("First number = " + num1);
        System.out.println("Second number = " + num2);
    }
    
    public static void swapWithoutVariable(double a, double b) {
        a = a + b;
        b = a - b;
        a = a - b;
    }
}
