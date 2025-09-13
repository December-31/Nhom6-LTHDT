import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so nguyen thu nhat: ");
        int a = sc.nextInt();

        System.out.print("Nhap so nguyen thu hai: ");
        int b = sc.nextInt();

        System.out.println("Tong: " + (a + b));
        System.out.println("Hieu: " + (a - b));
        System.out.println("Tich: " + (a * b));

        if (b != 0) {
            System.out.println("Thuong: " + ((double)a / b));
            System.out.println("Phan du: " + (a % b));
        } else {
            System.out.println("Khong the chia cho 0.");
        }
    }
}
