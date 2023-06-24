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
public class Lab2bai3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so dien su dung: "); double tien = sc.nextDouble();
        if(tien < 0){
            System.out.println("Ban da nhap sai moi ban nhap lai");
        }
        double tong = 0;
        if(tien > 0 && tien <= 50){
            tong = tien * 1000;
        }else{
            tong = 50 * 1000 + (tien- 50)* 1200;
        }
        System.out.printf("Tong tien: %.0f", tong);
    }
}
