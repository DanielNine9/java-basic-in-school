/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5bai3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 *
 * @author huyyd
 */
public class listProduct {

    private static ArrayList<SanPham> list = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void menu() {
        boolean isLoop = true;
        do {
            System.out.println("Menu");
            System.out.println("1. Nhap danh sach san pham");
            System.out.println("2. Sap xep giam dan theo gia");
            System.out.println("3. Tim va xoa san pham theo ten");
            System.out.println("4. Xuat gia trung binh cua san pham");
            System.out.println("0. Thoat chuong trinh");
            System.out.println("Moi ban nhap lua chon: ");
            try {
                switch (Integer.parseInt(sc.nextLine())) {
                    case 1:
                        cn1();
                        break;
                    case 2:
                        cn2();
                        break;
                    case 3:
                        cn3();
                        break;
                    case 4:
                        cn4();
                        break;
                    case 0: {
                        System.out.println("Chuong trinh ket thuc!");
                        isLoop = false;
                        break;
                    }
                    default: {
                        System.out.println("Ban vua nhap sai! Moi ban nhap lai.");
                    }
                }
            } catch (Exception e) {
                System.out.println("Ban vua nhap sai1! Moi ban nhap lai.");
            }
        } while (isLoop);
    }

    private static void cn1() {
        do {
            try {
                System.out.println("Nhap so luong san pham vao danh sach: ");
                int n = Integer.parseInt(sc.nextLine());
                if (n < 0) {
                    System.out.println("Ban vua nhap sai! Moi ban nhap lai.");
                } else {
                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhap ten san pham: ");
                        String name = sc.nextLine();
                        System.out.println("Nhap gia san pham: ");
                        double price = Double.parseDouble(sc.nextLine());
                        list.add(new SanPham(name, price));
                    }
                    break;
                }
            } catch (Exception e) {
                System.out.println("Ban vua nhap sa! Moi ban nhap lai.");
            }
        } while (true);
    }

    private static void cn2() {
        if (list.isEmpty()) {
            System.out.println("Danh sach hien tai rong!");
            return;
        }
        Collections.sort(list, (o1, o2) -> o1.getPrice() < o2.getPrice() ? 1 : -1);
        for (SanPham x : list) {
            System.out.println(x);
        }
    }

    private static void cn3() {
        if (list.isEmpty()) {
            System.out.println("Danh sach hien tai rong!");
            return;
        }
        int cnt = 0;
        System.out.print("Moi ban nhap ten san pham can xoa: ");
        String name = sc.nextLine();

        Iterator<SanPham> iter = list.iterator();
        while (iter.hasNext()) {
            if (iter.next().getName().equalsIgnoreCase(name)) {
                iter.remove();
                ++cnt;
            }
        }
        if (cnt > 0) {
            System.out.printf("Xoa %d san pham %s trong danh sach!", cnt, name);
        } else {
            System.out.println("Ten khong co trong danh sach");
        }
        System.out.println("");
    }

    private static void cn4() {
       double totalPrice = list.stream()
                        .mapToDouble(obj -> obj.getPrice())
                        .reduce(0.0, (a, b) -> a + b);
        if (list.isEmpty()) {
            System.out.println("Danh sach hien tai rong! Gia trung binh trong danh sach: 0");
            return;
        }
        double tong = 0;
        int cnt = 0;
        for (SanPham x : list) {
            tong += x.getPrice();
        }

        System.out.printf("\nGia trung binh trong danh sach: %.0f", (tong / list.size()));
        System.out.println("");
    }
}
