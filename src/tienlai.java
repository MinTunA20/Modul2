import java.util.Scanner;

public class tienlai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền gửi");
        double Gmoney = sc.nextInt();
        System.out.println("Ti le lai suat %");
        double Ls = sc.nextInt();
        System.out.println("thoi gian gui");
        int time = sc.nextInt();

        double Lmoney = Gmoney * Ls/100/12 * time;
        System.out.println("So tien lai la: " + Lmoney);
    }
}
