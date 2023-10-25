import java.util.Scanner;

    public class Month {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the months 1.January 2.Febrary 3.March 4.April and so on");
           int month = sc.nextInt();
           switch(month){
            case 1:{
                System.out.println("January is the month of winter");
                break;
            }
            case 2:{
                System.out.println("Febrary is the month of winter");
                break;
            }
            case 3:{
                System.out.println("March is the month of summer");
                break;
            }
            case 4:{
                System.out.println("April is the month of summer");
                break;
            }
            case 5:{
                System.out.println("May is the month of summer");
                break;
            }
            case 6:{
                System.out.println("June is the month of summer");
                break;
            }
            case 7:{
                System.out.println("July is the month of rainy");
                break;
            }
            case 8:{
                System.out.println("August is the month of rainy");
                break;
            }
            case 9:{
                System.out.println("September is the month of rainy");
                break;
            }
            case 10:{
                System.out.println("October is the month of autumn");
                break;
            }
            case 11:{
                System.out.println("November is the month of autumn");
                break;
            }
            case 12:{
                System.out.println("December is the month of winter");
                break;
            }
            default:{
                System.out.println("invalid choice please enter correct input");
            }
    
           }
    
    
        }
        
    }
    

    

