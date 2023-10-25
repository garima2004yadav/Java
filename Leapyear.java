import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int year = 2000;
        System.out.println("enter the year");
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("leap year");
                }
                else{
                    System.out.println("not leap year");
                }  
            }
            else{
                System.out.println("not leap year");
            }
        }
    }
    
}
