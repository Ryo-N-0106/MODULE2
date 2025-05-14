import java.util.Scanner;

public class PerfectNumber {

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

    }
}
