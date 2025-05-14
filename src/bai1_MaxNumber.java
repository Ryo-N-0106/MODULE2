import java.util.Scanner;

public class bai1_MaxNumber {

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

        int max = 0;
        int original = number;

        while (original > 0){
            int digit = original % 10;
            if (digit > max) {
                max = digit;
            }
            original /= 10;
        }

        System.out.println("Chữ số lớn nhất trong " + number + "là: " + max);
    }
}
