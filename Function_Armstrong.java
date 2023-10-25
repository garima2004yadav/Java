public class Function_Armstrong {
    static int arm(int num,int arm){
        while(num!=0){
            int rem=num%10;
            arm+=Math.pow(rem,3);
            num=num/10;
        }
        return arm;
    }
    public static void main(String[] args) {
        int num=153;
        int temp=num;
        int arms=0;
        int r=arm(num,arms);
        if(r==temp){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }
    }
    
}
