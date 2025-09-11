package baitap;
import java.util.Scanner; 
public class Baitap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.print("Nhap ten: ");      
        String ten = sc.nextLine();           
        System.out.println("Hello " + ten);   
        sc.close();                           
    }
}