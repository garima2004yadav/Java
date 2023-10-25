import java.util.*;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int arr[] = {1,2,3,4,5};
        //int[] arr2 = {1,2,3};
        int dy[] = new int[6];
        for(int i=0;i<dy.length;i++){
            System.out.println("Enter the value");
            dy[i] = sc.nextInt();
        }
        for(int i=0;i<dy.length;i++){
        System.out.println(dy[i] + " ");
        }
        sc.close();

    }
    
}
