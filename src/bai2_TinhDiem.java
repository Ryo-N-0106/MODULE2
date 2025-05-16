import java.util.Scanner;

public class bai2_TinhDiem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Hiện danh sách điểm
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
        System.out.println("\nDanh sách điểm của " + n + " sinh viên: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh viên " + (i + 1) + ": " + diemMonHoc[i]);
        }

        //Tính điểm trung bình, số sinh viên trên 5 điểm, max, min
        double sum = 0;
        int sinhVienDat = 0;
        double max = diemMonHoc[0];
        double min = diemMonHoc[0];

        for (int i =0; i < n; i++){
            sum += diemMonHoc[i];
            if (diemMonHoc[i] >= 5) {
                sinhVienDat++;
            }
            if (diemMonHoc[i] > max) {
                max = diemMonHoc[i];
            }
            if (diemMonHoc[i] < min) {
                min = diemMonHoc[i];
            }
        }

        double diemTrungBinh = sum/n;

        System.out.println("\nKết quả thống kê");
        System.out.printf("Điểm trung bình: %f\n", diemTrungBinh);
        System.out.println("Số sinh viên đạt (điểm >= 5): " + sinhVienDat);
        System.out.printf("Điểm cao nhất: %f\n", max);
        System.out.printf("Điểm thấp nhất: %f\n", min);

        //Tìm điểm bất kỳ
    }
}
