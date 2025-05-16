import java.util.Scanner;

public class bai4_PerfectNumber {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int number;
        do {
            System.out.println("Hãy nhập số nguyên dương (>0): ");
            number = input.nextInt();

            if (number <= 0) {
                System.out.println("Không phải số nguyên dương!");
            }
        } while (number <= 0);

        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        if (sum == number) {
            System.out.println(number + " là số hoàn hảo!");
        } else {
            System.out.println(number + " không phải là số hoàn hảo!");
        }
    }
}
