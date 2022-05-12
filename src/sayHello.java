import java.util.Scanner;

public class sayHello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten cua ban <Enter your name>");
        String name = scanner.nextLine();
        System.out.println("Xin chao" + name);
    }
}
