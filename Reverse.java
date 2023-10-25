public class Reverse {
    public static void main(String[] args) {
        int n =1234;
        int rev=0;
        int r = n;
        while(r>0){
            rev = rev * 10 + r % 10;
            r/=10;
        }
        System.out.println(rev);
    }
    
}
