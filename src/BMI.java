import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("nhap can nang");
        int weight = sc1.nextInt();
        System.out.println("nhap chieu cao");
        double height = sc1.nextDouble();

        double BMI = weight / Math.pow(height, 2);
        System.out.println("Chi so BMI cua ban la " + BMI);

        if (BMI < 18.5) {
            System.out.println("Underweight");
        } else if (BMI >= 18.5 && BMI < 25.0) {
            System.out.println("Normal");
        } else if (BMI >= 25.0 && BMI < 30) {
            System.out.println("Overweight");
        } else System.out.println("Obese");
    }

}

