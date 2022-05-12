import java.util.Scanner;

public class dayinmonth {
    public static void main(String[] args) {
        System.out.println("nhap thang can check: ");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        switch (month) {
            case 2:
                System.out.println("thang 2 co 28 hoac 29 ngay");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("thang "+ month +" co 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("thang "+ month +" co 30 ngày");
        }
    }
}
