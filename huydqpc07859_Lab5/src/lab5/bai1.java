/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

import java.util.ArrayList;import java.util.Scanner;
;

/**
 *
 * @author huyyd
 */
public class bai1 {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<Double>();
        double tong = 0;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Nhap gia tri: ");
            double x = Double.parseDouble(sc.nextLine());
            list.add(x);
            System.out.print("Nhap them(Y/N)?");
            String y = sc.nextLine();
            if(y.equals("N") || y.equals("n")){
                break;
            }
        }
        for(double x : list){
            tong += x;
            System.out.print(x+ " ");
        }
        System.out.println("Tong: "+tong);
    }
}
