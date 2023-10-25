import java.util.Scanner;

public class Areaofrectangle {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of rectnangle");
        double length = sc.nextDouble();
        System.out.println("Enter the width of rectangle");
        double width = sc.nextDouble();
        double area = length * width;
        System.out.println("The area of rectangle:"+area);
    }    
}
