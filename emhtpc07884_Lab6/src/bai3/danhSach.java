/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author huyyd
 */
public class danhSach {

    private static ArrayList<sinhVien> list = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void menu() {
        boolean loop = true;
        while (loop) {
            System.out.println("Menu");
            System.out.println("1. Nhap ten sinh vien");
            System.out.println("2. Xuat  sinh vien");
            System.out.println("0. Thoat chuong trinh");
            System.out.println("Moi ban nhap lua chon: ");
            int lc = sc.nextInt();
            sc.nextLine();
            switch (lc) {
                case 1:
                    cn1();
                    break;
                case 2:
                    cn2();
                    break;
                case 0: {
                    System.out.println("Thoat chuong trinh");
                    loop = false;
                    break;
                }
                default: {
                    System.out.println("Ban vua nhap sai! Moi ban nhap lai");
                }
            }
        }
    }

    private static void cn1() {
        System.out.println("Nhap ho va ten: ");
        String ten = sc.nextLine();
        String regax = "[a-z][a-z]*";
        if (!ten.matches(regax)) {
            System.out.println("Ban vua nhap sai!");
            return;
        }
        String regax2 ="^(.+)@(.+)$";
        System.out.println("Nhap email: ");
        String email = sc.nextLine();
        if (email.matches(regax2)) {

        } else {
            System.out.println("Ban vua nhap sai!");
            return;
        }
        String regax3 = "^(\\+\\d{1,3}( )?)?((\\(\\d{1,3}\\))|\\d{1,3})[- .]?\\d{3,4}[- .]?\\d{4}$";
        System.out.println("Nhap so dien thoai");
        String sdt = sc.nextLine();
        if (!sdt.matches(regax3)) {
            System.out.println("Ban vua nhap sai!");
            return;
        }
        System.out.println("Nhap cmnd: ");
        String cmnd = sc.nextLine();
        if (cmnd.length() != 10) {
            System.out.println("Ban vua nhap sai! Moi ban nhap lai");
            return;
        }
        sinhVien sv = new sinhVien(ten, email, sdt, cmnd);
        list.add(sv);
    }

    private static void cn2() {
        for (sinhVien x : list) {
            System.out.println("Ho va ten: " + x.getTen());
            System.out.println("Email:  " + x.getEmail());
            System.out.println("So dien thoai: " + x.getSdt());
            System.out.println("Cmnd: " + x.getCmnd());
        }
    }
}
