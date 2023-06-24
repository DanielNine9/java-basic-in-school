/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5bai2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author huyyd
 */
public class test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        listStudent list = new listStudent();
        int lc;
        boolean isFalse = true;
        do {
            System.out.println("Menu");
            System.out.println("1. Nhap danh sach ho ten");
            System.out.println("2. Xuat danh sach ho ten");
            System.out.println("3. Xuat danh sach sinh vien ngau nhien");
            System.out.println("4. Sap xep sinh vien theo ten giam dan");
            System.out.println("5. Tim va xoa ho ten ra khoi danh sach");
            System.out.println("0. Thoat chuong trinh");
            try {
                System.out.println("Moi ban nhap lua chon: ");
                lc = Integer.parseInt(sc.nextLine());
                switch (lc) {
                    case 1: {
                        list.nhap();
                        break;
                    }
                    case 2:
                        list.xuat();
                        break;
                    case 3:
                        list.xuatRandom();
                        break;
                    case 4:
                        list.sort();
                        break;
                    case 5:
                        list.removeByName();
                        break;
                    case 0: {
                        isFalse = false;
                        System.out.println("Chuong trinh ket thuc");
                        break;
                    }
                    default: {
                        System.out.println("Ban da nhap sai! Moi ban nhap lai");
                    }
                }
            } catch (Exception e) {
                System.out.println("Ban da nhap sai! Moi ban nhap lai");
            }
        } while (isFalse);

    }
}
