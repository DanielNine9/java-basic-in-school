/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitest;

import java.util.Scanner;

/**
 *
 * @author huyyd
 */
public class bai3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n;
        double thue = 0;
        double luongThuc;

        do {
            System.out.println("Nhap vao luong nhan vien: ");
             n = Integer.parseInt(sc.nextLine());
            if(n < 0){
                System.out.println("Ban vua nhap sai! Moi ban nhap lai");
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
