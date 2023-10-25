public class Secmax {
    public static void main(String[] args) {
        int arr[] = {5,4,113,4,6};
        int max = arr[0];
        int secMax = arr[0];
        for(int i=0;i < arr.length;i++){
            if(max < arr[i])
            max = arr[i];
        }
        for(int i = 0;i < arr.length;i++){
            if(secMax < arr[i] && arr[i]!=max)
            secMax=arr[i];        }
            System.out.println("The second max is"+ secMax);
    
}
}
