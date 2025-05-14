import java.util.Scanner;

public class bai3_Factorial {

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

        int result = 1;
        for (int i = 1; i <= number; i++){
            result *= i;
        }
        System.out.println(number + "! = " + result);

    }
}
