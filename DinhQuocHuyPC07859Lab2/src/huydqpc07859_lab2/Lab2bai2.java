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
public class Lab2bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        double a = sc.nextDouble();
        System.out.println("Nhap b: ");
        double b = sc.nextDouble();
        System.out.println("Nhap c: ");
        double c = sc.nextDouble();
        if (a == 0) {
            if (b == 0) {
                if (c== 0) {
                    System.out.println("Phuong trinh da cho vo so nghiem!");
                } else {
                    System.out.println("Phuong trinh da cho vo nghiem!");
                }
            } else {
                System.out.println("Phuong trinh co nghiem: " + (-c / b));
            }
        }else{
            double delta = Math.pow(b,2) - 4* a * c;
            if(delta < 0){
                System.out.println("Phuong trinh da cho vo nghiem");
            }else if(delta == 0){
                System.out.println("Phuong trinh da cho co nghiem kep x1 = x2 = "+ (-b/(2*a)));
            }else{
                double x1 = (-b + Math.sqrt(delta))/(2*a);
                double x2 = (-b - Math.sqrt(delta))/(2*a);
                System.out.println("Phuong trinh da cho co 2 nghiem phan biet");
                System.out.println("x1 = "+x1);
                System.out.println("x2 = "+x2);
            }
        }
    }
}
