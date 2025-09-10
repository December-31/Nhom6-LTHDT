import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so tien gui (VND): ");
        double soTienGui = sc.nextDouble();

        System.out.print("Nhap lai suat hang nam (%): ");
        double laiSuatNam = sc.nextDouble();

        System.out.print("Nhap so thang gui: ");
        int soThang = sc.nextInt();

        double lai = (soTienGui * laiSuatNam * soThang) / 12 / 100;
        double tongSoTien = soTienGui + lai;

        System.out.println("Tien lai: " + lai + " VND");
        System.out.println("Tong so tien sau " + soThang + " thang: " + tongSoTien + " VND");
    }
}
