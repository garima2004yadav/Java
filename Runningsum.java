public class Runningsum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int s[] = new int[arr.length];
        int n=arr.length;
          arr[0] = 1;
          for(int i=1;i<arr.length;i++){
            s[i] = arr[i] + s[i-1];
          }
          System.out.print(s[i]);
    }
    
}
