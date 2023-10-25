import java.util.Scanner;

public class Evenodd {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the value of k");
        int k=sc.nextInt();
        if(k%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
        sc.close();
    }
}
