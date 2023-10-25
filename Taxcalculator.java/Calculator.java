import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome!This is your Calculator");
        System.out.println("Please Choose the operation from following menu:-");
        System.out.println("1.addition ");
        System.out.println("2. subtraction ");
        System.out.println("3. multiplication");
        System.out.println("4. division");
       int choice = sc.nextInt();
       System.out.println("Enter the value of a");
       int a = sc.nextInt();
       System.out.println("Enter the value of b");
       int b = sc.nextInt();
       int c=0;
       switch(choice){
        case 1:{
            c=a+b;
            System.out.println("Output:"+c);
            break;
        }
        case 2:{
            c=a-b;
            System.out.println("output:"+c);
            break;
        }
        case 3:{
            c=a*b;
            System.out.println("output:"+c);
            break;
        }
        case 4:{
            c=a/b;
            System.out.println("output:"+c);
            break;
        }

       }


    }
    
}
