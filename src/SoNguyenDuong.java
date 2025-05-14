import java.util.Scanner;

public class SoNguyenDuong {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int number;
    do {
        System.out.println("Hãy nhập số nguyên dương (>0): ");
        number = input.nextInt();

        if (number <= 0) {
            System.out.println("Không phải số nguyên dương!");
        }
    } while (number <= 0);

    System.out.println("Số nguyên dương là: " + number);

        int reversed = 0; // Biến lưu số đảo ngược
        int temp = number; // Lưu số gốc để xử lý

        while (temp > 0) {
            int digit = temp % 10; // Lấy chữ số cuối
            reversed = reversed * 10 + digit; // Cộng dồn chữ số vào total
            temp = temp / 10; // Loại bỏ chữ số cuối
        }

        // In kết quả
        System.out.println("Số đảo ngược là: " + reversed);

        input.close(); // Đóng Scanner

    //System.out.println("Số đảo ngược: " + total);

    }
}
