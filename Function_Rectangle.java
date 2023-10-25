import java.util.Scanner;
public class Function_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rectangle");
        double length = sc.nextDouble();
        System.out.println("Enter the width of rectangle");
        double width = sc.nextDouble();
        double area = calculatorarea(length,width);
        double parameter = calculatorparameter(length,width);
        System.out.println("Area of rectangle"+area);
        System.out.println("Parameter of rectangle"+parameter);
        sc.close();
    }
    
}
