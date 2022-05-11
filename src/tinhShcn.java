import java.util.Scanner;

public class tinhShcn {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chieu dai: ");
        width = scanner.nextFloat();
        System.out.println("nhap chieu dai: ");
        height = scanner.nextFloat();
        float area = width * height;
        System.out.println("dien tich la" + area);

    }
}
