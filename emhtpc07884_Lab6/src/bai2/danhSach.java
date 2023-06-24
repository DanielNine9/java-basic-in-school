/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author huyyd
 */
public class danhSach {
    private static ArrayList<sanPham> list = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
    
    public static void menu(){
        boolean loop = true;
        while(loop){
            System.out.println("Menu");
            System.out.println("1. Nhap 5 san pham");
            System.out.println("2. Xuat  san pham");
            System.out.println("0. Thoat chuong trinh");
            System.out.println("Moi ban nhap lua chon: ");
            int lc = sc.nextInt();
            sc.nextLine();
            switch(lc){
                case 1: cn1(); break;
                case 2: cn2(); break;
                case 0: {
                    System.out.println("Thoat chuong trinh");
                    loop = false;
                    break;
                }
                default:{
                    System.out.println("Ban vua nhap sai! Moi ban nhap lai");
                }
            }
        }
    }
    
    private static void cn1() {
        String ten;
        double gia;
        for(int i = 0; i < 5; i++){
            System.out.println("Nhap ten san pham: ");
           ten = sc.nextLine();
            System.out.println("Nhap  gia san pham: ");
           gia = sc.nextDouble();
            sc.nextLine();
            sanPham sp = new sanPham(ten, gia);
            list.add(sp);
        }
    }
    
    private static void cn2(){
        for(sanPham x : list){
            System.out.println("Ten san pham: "+ x.getTen());
            System.out.println("Gia san pham: "+ x.getGia());
        }
    }
}
