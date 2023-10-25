import java.util.*;
public class P {
    public static void main(String[] args) {
        int no,n,rem,s=0;
        Scanner sc=new
        Scanner(System.in);
        System.out.println("Enter any number");
        no=sc.nextInt();
        n=no;
        while(no!=0)
        {
            rem=n%10;
            s=s*10+rem;
            no=no/10;
        }
        if(n==s)
        System.out.println("Palindrome number is"+n);
        else
        System.out.println("Not Palindrome");
        sc.close();
    }
    
}
