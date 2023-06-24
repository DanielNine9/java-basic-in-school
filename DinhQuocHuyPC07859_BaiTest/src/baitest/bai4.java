/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author huyyd
 */
public class bai4 {

    public static void main(String[] args) {
        boolean loop = true;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.println("\nMenu");
                System.out.println("1. Tinh tong");
                System.out.println("2. Mang 1 chieu");
                System.out.println("3. Luong nhan vien");
                System.out.println("0. Thoat chuong trinh");
                System.out.println("Moi ban nhap lua chon: ");
                int lc = Integer.parseInt(sc.nextLine());
                switch (lc) {
                    case 1: cn1(); break;
                    case 2: cn2(); break;
                    case 3: cn3(); break;
                    case 0:{
                        System.out.println("\nChuong trinh ket thuc");
                        loop = false;
                    }
                }
            } catch (Exception e) {
                System.out.println("\nBan vua nhap sai! Moi ban nhap lai");
            }
        } while (loop);
        
        
    }

    public static void cn1() {
        Scanner sc = new Scanner(System.in);
        int tong = 0;
        System.out.println("\nMoi ban nhap so bat ky: ");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; i++) {
            tong += i;
        }
        System.out.println("Tong: " + tong);
    }

    public static void cn2() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        System.out.println("\nNhap so luong phan tu trong mang: ");

        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "]");
            int a = Integer.parseInt(sc.nextLine());
            arr.add(a);
            System.out.println("");
        }
         System.out.print("\nMang truoc khi sap xep: ");
        for(int i : arr){
            System.out.print(i + " ");
        };

        Collections.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 < o2) {
                    return 1;
                } else {
                    return -1;
                }
            }

        });
        System.out.print("\nMang sau khi sap xep: ");
        for (int i : arr) {
            System.out.print(i + " ");
        };

        for (int i : arr) {
            System.out.print("\nGia tri lon nhat trong mang la: ");
            System.out.println(i);
            break;
        }
        System.out.print("\nGia tri chan trong mang la: ");
        for (int i : arr) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

    }
    
    public static void cn3() {
         Scanner sc = new Scanner(System.in);
        double n;
        double thue = 0;
        double luongThuc;

        do {
            System.out.println("\nNhap vao luong nhan vien: ");
             n = Integer.parseInt(sc.nextLine());
            if(n < 0){
                System.out.println("\nBan vua nhap sai! Moi ban nhap lai");
            }else {
                break;
            }
        } while (true);
        if (n < 15000000) {
            thue = n * 5 / 100;
        } else if (n >= 15000000 && n <= 24000000) {
            thue = n * 10 / 100;
        } else if (n > 25000000) {
            thue = n * 15 / 100;
        }
        luongThuc = n - thue;

        System.out.printf("\nLuong nhan vien la: %.0f" , n);
        System.out.printf("\nThue nhan vien la: %.0f" ,thue);
        System.out.printf("\nLuong thuc nhan la: %.0f" , luongThuc);

    }
}
