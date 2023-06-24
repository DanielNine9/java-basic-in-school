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
public class cau1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tong = 0;
        System.out.println("Moi ban nhap so bat ky: ");
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i ++){
            tong += i;
        }
        System.out.println("Tong: "+ tong);
    }
}
