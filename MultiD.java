import java.util.Scanner;
public class MultiD {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        for(int j=0;j<arr[0].length;j++){
            arr[i][j] = sc.nextInt();
        }
    }
    
}
