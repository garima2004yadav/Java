import java.util.Scanner;

public class Salary {
    public static void main(string[]args){
        Scanner sc = new scanner(System.in);
        System.out.println(); 
        float basic_salary = sc.nextfloat();
        float hra = basic_salary*30/100;
        float ta = basic_salary*20/100;
        float da = basic_salary*10/100;
        int pf =1500;
        float net_salary = basic_salary + hra + da + ta - pf;
        System.out.println("basic_salary:");

    }
    
}
