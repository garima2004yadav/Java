public class Unsortedmissing {
    public static void main(String[] args) {
        int[] arr = {3,2,4,6,7};
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(max < arr[i])
            max = arr[i];
        }
        System.out.println("Max Element is" + max);
    
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(min > arr[i])
            min = arr[i];
        }
        System.out.println("Min Element is" + min);
    
    int sum = 0;
    for(int i=0;i<arr.length;i++){
    sum += arr[i];        }
    System.out.println("The sum is"+sum);
}
}
    



