import java.util.Scanner;
public class Atm {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Welcome!This is XYZ ATM");
            System.out.println("Please Choose the operation from following menu:-");
            System.out.println("1.Balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdrawal");
           int choice = sc.nextInt();
           System.out.println("Enter the ATM number");
           int a = sc.nextInt();
           int b = 2000;
           int c=0;
           switch(choice){
            case 1:{
                System.out.println("Your account balance is:"+b);
                break;
            }
            case 2:{
                System.out.println("Enter the amount to be deposited:");
                c = sc.nextInt();
                b= b+c;
                System.out.println("Your account balance is:"+b);
                break;
            }
            case 3:{
                if(b>1000){
                System.out.println("Enter the amount to withdraw:");
                c = sc.nextInt();
                if(c<b){
                    b=b-c;
                   System.out.println("Your account balance is:"+b);
                }
                else{
                    System.out.println("Sorry Your Account balance is low!!!");
                }
            }
                break;
            }
            
    
           }
    
    
        }
        
    }
    

    

