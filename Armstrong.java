import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        int n1,n2;
        Scanner sc=new
        Scanner(System.in);
        System.out.println("Enter 1st number");
        n1=sc.nextInt();
        System.out.println("Enter 2nd number");
        n2=sc.nextInt();
        for(int i=n1;i<n2;i++){
            int n,rem,sum=0;
            n=i;
            while(n!=0){
                rem=n%10;
                sum=sum+(rem*rem*rem);
                n=n/10;
            }
            if(sum==i){
                System.out.println(""+i+"is an armstrong number");
            }
            else{
                System.out.println("not");
            }
        }
        sc.close();
    }
    
}
