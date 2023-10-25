import java.util.Scanner;
public class CRUD {
    public static void main(String args[]) {
        Scanner sc = new
        Scanner(System.in);
        int[] arr=new int[10];
        System.out.print("Enter the elements do you wants:");
        int s=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter Elements:");
            arr[i]=sc.nextInt();
        }
        System.out.println("Array elements are:-");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+"\t");
        }
        System.out.print("\nEnter a value which you want to update:");
        int num=sc.nextInt();
        System.out.print("\nEnter index value:");
        int idx=sc.nextInt();
        arr[idx]=num;
        System.out.println("\nUpdate Array");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.print("\nEnter which value do you want to delete:");
        int ele=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ele){
                for(int j=i;j<n-1;j++){
                    arr[j]=arr[j+1];
                }
                break;
            }
            else if(i<0||i>n){
                System.out.println("You entered wrong value!!");
                break;
            }
        }
        System.out.println("After delete an element of an Array:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"\t");
        }
        sc.close();
    }
    
}
