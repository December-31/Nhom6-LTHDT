/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PhanManhTung
 */
import java.util.Scanner;
public class Bai4Tung 
{
     public static void main (String[] args)
     { 
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so tien gui VND:");
        double tiengui=sc.nextDouble();
        System.out.println("Nhap lai suat hang nam %:");
        double laisuatnam=sc.nextDouble();
        System.out.println("Nhap so thang gui:");
        int thanggui=sc.nextInt();
        double laithang=laisuatnam/12/100;
        double tienlai=tiengui*laithang*thanggui;
        double tongtien=tiengui+tienlai;
        System.out.println("So tien lai la: "+tienlai+"");
        System.out.println("So tien goc cuoi ky la: "+tongtien+"");
     }
}