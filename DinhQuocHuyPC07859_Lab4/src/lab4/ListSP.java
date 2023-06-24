/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author huyyd
 */
public class ListSP {

    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<SanPham> list = new ArrayList<>();
    private static int lc;
    private static boolean isLoop = true;

    public static void menu() {

        do {
            try {
                System.out.println("Menu");
                System.out.println("1. Nhap san pham");
                System.out.println("2. Xuat san pham");
                System.out.println("0. Thoat chuong trinh");
                System.out.println("Moi ban nhap lua chon: ");
                lc = Integer.parseInt(sc.nextLine());
                switch (lc) {
                    case 1:
                        listNhap();
                        break;
                    case 2:
                        xuat();
                        break;
                    case 0: {
                        System.out.println("Chuong trinh ket thuc");
                        isLoop = false;
                        break;
                    }
                    default: {
                        System.out.println("Ban vua nhap sai! Moi ban nhap lai");
                    }
                }
            } catch (Exception e) {
                System.out.println("Ban vua nhap sai! Moi ban nhap lai");
            }
        } while (isLoop);
    }

    private static void nhap() {
        String name;
        double price, discount;
        System.out.print("Nhap ten san pham: ");
        name = sc.nextLine();
        do {
            try {
                System.out.print("Nhap gia san pham: ");
                price = Integer.parseInt(sc.nextLine());
                if(price < 0){
                    System.out.println("Ban vua nhap sai! Moi ban nhap lai");
                }else break;
            } catch (Exception e) {
                System.out.println("Ban vua nhap sai! Moi ban nhap lai");
            };
        } while (true);
           do {
            try {
                System.out.print("Nhap ma giam gia san pham: ");
                discount = Integer.parseInt(sc.nextLine());
                if(discount < 0){
                    System.out.println("Ban vua nhap sai! Moi ban nhap lai");
                }else break;
            } catch (Exception e) {
                System.out.println("Ban vua nhap sai! Moi ban nhap lai");
            };
        } while (true);
           
           SanPham sp = new SanPham(name, price, discount);
           list.add(sp);
    }
    
    private static void listNhap(){
        for(int i = 0; i < 2; i++){
            System.out.println("id: "+( i + 1));
            nhap();
        }
    }

    private static void xuat() {
        for (SanPham x : list) {
            x.xuat();
        }
    }

}
