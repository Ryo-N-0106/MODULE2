import java.util.Scanner;

public class bai3_TimKiemDiem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Nhập điểm
        int n;
        do {
            System.out.println("Nhập số lượng sinh viên (1-100): ");
            n = input.nextInt();
            if (n <= 0 || n > 100) {
                System.out.println("Số lượng sinh viên phải từ 1 đến 100!");
            }
        } while (n <= 0 || n > 100);


        double[] diemMonHoc = new double[n];
        for (int i = 0; i < n; i++) {
            do {
                System.out.println("Nhập điểm sinh viên " + (i + 1) + " (0-10): ");
                diemMonHoc[i] = input.nextDouble();
                if (diemMonHoc[i] < 0 || diemMonHoc[i] > 10) {
                    System.out.println("Điểm từ 0-10!");
                }
            } while (diemMonHoc[i] < 0 || diemMonHoc[i] > 10);
        }

        //Tìm kiếm điểm
        System.out.println("Nhập điểm cần tìm: ");
        double searchScore = input.nextDouble();
        int countFound = 0;

        for (int i = 1; i < n; i++) {
            if (diemMonHoc[i] == searchScore) {
                System.out.println("Điểm của Sinh viên " + (i + 1));
                countFound++;
            }
        }

        if (countFound == 0) {
            System.out.println("Không có điểm cần tìm!");
        }
    }
}
