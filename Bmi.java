import java.util.Scanner;

public class Bmi {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your weight in kg");
        float weight = sc.nextfloat();
        System.out.println("Enter your height in meters");
        float height = sc.nextfloat();
        float BMI = weight/height*height;
        System.out.println("BMI:" + BMI);

    }
    
}
