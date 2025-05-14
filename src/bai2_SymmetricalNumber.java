import java.util.Scanner;

public class bai2_SymmetricalNumber {

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


        int reversed = 0;
        int original = number;

        while (original > 0) {
            int digit = original % 10;
            reversed = reversed * 10 + digit;
            original /= 10;
        }


        if (reversed == number) {
            System.out.println(number + " là số đối xứng.");
        } else {
            System.out.println(number + " không phải là số đối xứng.");
        }
    }
}
