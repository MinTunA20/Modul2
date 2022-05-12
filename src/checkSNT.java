import java.util.Scanner;

public class checkSNT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so can kiem tra: ");
        int number = scanner.nextInt();
        boolean check=true;
        if (number <= 1) {
            System.out.println(number + " khong phai la so nguyen to");
           } else {
            for (int i = 2; i < number / 2; i++) {
                if (number % i == 0) {
                    check=false;
                }
            }
        }
        if (check==false) {System.out.println(number + " khong phai la so nguyen to");}
        else System.out.println(number + " la so nguyen to");
    }
}
