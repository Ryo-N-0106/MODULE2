import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chieuRong;
        int chieuDai;

        System.out.println("Hãy nhập chiều rộng: ");
        chieuRong = scanner.nextInt();

        System.out.println("Hãy nhập chiều dài: ");
        chieuDai = scanner.nextInt();

        int dienTich = chieuRong * chieuDai;

        System.out.println("Diện tích hcn: " + dienTich);

    }
}
