/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package huydqpc07859_lab1;

import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author huyyd
 */
public class Lab2bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tong = 0;
        double cnt= 0;
        System.out.println("Nhap vao so luong phan tu trong mang: "); int n = Integer.parseInt(sc.nextLine());
        int a[] = new int[n];
        for(int i = 0; i < n;i++){
            System.out.println("");
            System.out.print("a["+i+"] = " ); a[i] = Integer.parseInt(sc.nextLine());
        }
        Arrays.sort(a);
        System.out.println("Mang da sap xep: ");
        for (int i = 0; i < n; i++) {
            if(a[i] % 3 == 0){
                tong += a[i];
                ++cnt;
            }
            System.out.print( a[i]+ " ");
        }
        double tbc = tong / cnt;
        System.out.println("\nGia tri nho nhat trong mang: "+ a[0]);
        System.out.println("\nTrung binh cong cac so chia het cho 3 la: "+ tbc);
    }
}
