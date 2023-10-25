import java.util.Scanner;
public class Simpleinterestcalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal amount");
        double principal = sc.nextDouble();
        System.out.println("Enter rate of interest");
        double rate = sc.nextDouble();
        System.out.println("Enter time(in years)");
        double time = sc.nextDouble();
        double simpleInterest = calculateSimpleInterest(principal,rate,time);
        System.out.println("Simpleinterest"+simpleInterest);
        sc.close();
     }
     public  static double calculateSimpleInterest(double principal,double rate,double time){
        double interest = (principal*rate*time)/100;
        return interest;
     }
 }
    

