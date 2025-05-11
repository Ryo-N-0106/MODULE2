import java.util.Scanner;

public class ElectricBill {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mucTieuthu;
        System.out.printf("Mức tiêu thụ (kWh): ");
        mucTieuthu = scanner.nextDouble();

        double total = 0;

        if (mucTieuthu <= 50){
            total = mucTieuthu * 1800;
        } else if (mucTieuthu <= 100) {
            total = mucTieuthu * 1800 + (mucTieuthu - 50) * 2300;
        } else {
            total = mucTieuthu * 1800 + (mucTieuthu - 50) * 2300 + (mucTieuthu - 150) * 3000;
        }
        System.out.printf("Số điện đã tiêu thụ: ",mucTieuthu,"kWh\n");
        System.out.printf("Số tiền phải trả: %.0f",total,"VNĐ");

    }
}
