public class Spam {
    public static void main(String[] args) {
        int[] arr = {6,8,9,3,2};
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
    int spam = max - min;
    System.out.println("Spam element is" +spam);

}
}

