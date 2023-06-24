/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author huyyd
 */
public class listSanPham {

        static Scanner sc = new Scanner(System.in);
        ArrayList<SanPham> list = new ArrayList<>();

        public void nhap() {
                System.out.println("Nhap ten san pham: ");
                String name = sc.nextLine();
                System.out.println("Nhap gia san pham: ");
                double price = Double.parseDouble(sc.nextLine());
                System.out.println("Nhap hang san xuat: ");
                String brand = sc.nextLine();
                SanPham product = new SanPham(name, price, brand);
                list.add(product);
        }

        public void listNhap() {
                if (list.isEmpty()) {
                        System.out.println("Nhap so luong san pham trong danh sach");
                        int n = Integer.parseInt(sc.nextLine());
                        for (int i = 0; i < n; i++) {
                                nhap();
                        }
                } else {
                        nhap();
                }
        }

        public void xuat() {
                for (SanPham x : list) {
                        if (x.getBrand().equalsIgnoreCase("nokia")) {
                                x.xuat();
                        }
                }
        }
}
