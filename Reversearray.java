public class Reversearray {
    public static void main(String[] args) {
        int arr[] = {3,2,4,5,6,7};
        int n = arr.length;
        int start = 0;
        int end = n-1;
        while(start<end)
        {
            int temp = start;
            start = end;
            end= temp;
        }
        System.out.println("The reverse string is" +arr);


    }
    
    }
    

