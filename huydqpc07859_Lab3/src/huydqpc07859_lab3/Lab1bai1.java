/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package huydqpc07859_lab1;

import java.util.Scanner;

/**
 *
 * @author huyyd
 */
public class Lab1bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.println("Nhap so bat ky: ");
                int n = Integer.parseInt(sc.nextLine());
                if(n < 2){
                    System.out.println("Khong phai so nguyen to");
                    return;
                }
                for (int i = 2; i < n - 1; i++) {
                    if (n % i == 0) {
                        System.out.println("Khong phai so nguyen to");
                        return;
                    }
                }
                System.out.println("La so nguyen to");
                break;
            } catch (Exception e) {
                System.out.println("Ban vua nhap sai! Moi ban nhap lai.");
            }
        } while (true);
    }
}
