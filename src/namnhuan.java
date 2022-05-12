import java.util.Scanner;

public class namnhuan {
    public static void main(String[] args) {
        System.out.println("nhap nam can check");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("nam " + year + " la nam nhuan!");
        } else {
            if (year % 100 == 0 && year % 400 != 0) {
                System.out.println("nam " + year + " khong phai la nam nhuan!");
            } else {
                if (year % 100 == 0 && year % 400 == 0) {
                    System.out.println("nam " + year + " la nam nhuan!");
                } else System.out.println("nam " + year + " khong phai la nam nhuan!");
            }
        }
    }
}