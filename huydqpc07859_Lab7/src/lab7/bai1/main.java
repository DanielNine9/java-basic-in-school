/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7.bai1;

import java.util.Scanner;

/**
 *
 * @author huyyd
 */
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu dai hinh chu nhat: "); double dai = sc.nextDouble();
        System.out.println("Nhap chieu rong: "); double rong = sc.nextDouble();
        System.out.println(" Nhap canh hinh vuong: ");  double canh = sc.nextDouble();
        ChuNhat cn = new ChuNhat(rong, dai);
        ChuNhat hv = new hinhVuong(canh);
        cn.xuat();
        hv.xuat();
        
    }
}
