/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package huydqpc07859_lab2;

import java.util.Scanner;

/**
 *
 * @author huyyd
 */
public class Lab2Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: "); double a = sc.nextDouble();
        System.out.println("Nhap b:  "); double b = sc.nextDouble();
        if(a == 0){
            if(b == 0){
                System.out.println("Phuong trinh da cho vo so nghiem!");
            }else System.out.println("Phuong trinh da cho vo nghiem!");
        }else{
            System.out.println("Phuong trinh co nghiem: "+(-b/a));
        }
    }
}
