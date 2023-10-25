public class Min {
    public static void main(String[] args) {
        int[] arr = {5,8,1,3,2};
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(min > arr[i])
            min = arr[i];
        }
        System.out.println("Min Element is" + min);
    }
    
}
