/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

import java.util.Scanner;

/**
 *
 * @author huyyd
 */
public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tensp;
        double gia;
        System.out.println("Moi ban nhap vao cac thong tin duoi day ");
        System.out.print("Ten san pham : ");
        tensp = sc.nextLine();
        System.out.print("Gia san pham : ");
        gia = Double.parseDouble(sc.nextLine());
        SanPham sp1 = new SanPham(tensp, gia);
        System.out.print("Ten san pham : ");
        tensp = sc.nextLine();
        System.out.print("Gia san pham : ");
        gia = Double.parseDouble(sc.nextLine());
        System.out.print("Giam gia : ");double giamgia = Double.parseDouble(sc.nextLine());
        SanPham sp2 = new SanPham(tensp , gia , giamgia);
        sp1.xuat();
        sp2.xuat();
    }
}
