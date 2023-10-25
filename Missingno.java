public class Missingno {
    public static void main(String[] args) {
        int[] arr={1,2,4,0,5};
        int sum = 0;
        int n = arr.length;
        int totalSum = n * (n+1)/2;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        int missingno = totalSum - sum;
        System.out.println("The missing number is" +missingno);
    }
    
}
