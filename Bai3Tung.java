/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PhanManhTung
 */
import java.util.Scanner;
public class Bai3Tung {
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao 2 so mguyen a va b:");
        System.out.println("a=");
        int a=sc.nextInt();
        System.out.println("b=");
        int b=sc.nextInt();
        int c=a+b;
        int t=a-b;
        int n=a*b;
        float th=(float)a/b;
        int du=a%b;
        System.out.println("--Ket qua tinh toan--");
        System.out.println("Tong cua "+a+" Va "+b+"la:"+c+"");
        System.out.println("Hieu cua "+a+" Va "+b+"la:"+t+"");
        System.out.println("Tich cua "+a+" Va "+b+"la:"+n+"");
        System.out.println("Thuong cua "+a+" Va "+b+"la:"+th+"");
        System.out.println("Phan du cua "+a+" Va "+b+"la:"+du+"");
    }
}
