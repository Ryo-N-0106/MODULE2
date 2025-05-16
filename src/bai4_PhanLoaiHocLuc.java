import java.util.Scanner;

public class bai4_PhanLoaiHocLuc {
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

        // Phân loại học lực
        System.out.println("\nDanh sách học lực của " + n + " sinh viên: ");
        for (int i = 0; i < n; i++) {
            String hocLuc;
            if (diemMonHoc[i] >= 8) {
                hocLuc = "Giỏi";
            } else if (diemMonHoc[i] >= 6.5) {
                hocLuc = "Khá";
            } else if (diemMonHoc[i] >= 5) {
                hocLuc = "Trung bình";
            } else {
                hocLuc = "Yếu";
            }
            System.out.printf("Sinh viên %d: %s\n", (i + 1), hocLuc);
        }

    }
}
