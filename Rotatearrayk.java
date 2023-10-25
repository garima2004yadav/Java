
import java.util.Scanner;
public class Rotatearrayk {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int n = arr.length;
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        while(k!=0){
        
        int temp = arr[arr.length-1];
        for(int i=n-2;i>=0;i--){
            arr[i+1] = arr[i];
        }
        arr[0] = temp;
        k--;
        }
        arr[0] = temp;
        for(int i:arr)
        System.out.println(i +" ");
    }
    
}
