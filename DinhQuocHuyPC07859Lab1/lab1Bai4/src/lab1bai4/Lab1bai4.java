/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1bai4;

import java.util.Scanner;

/**
 *
 * Giao vien huong dan: Tran Minh Hung
 * Nguoi tao: Dinh Quoc Huy PC07859
 * @author huyyd
 */
public class Lab1bai4{

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isFalse = true;
        do{
            try{
                System.out.print("Nhap a: "); float a = sc.nextFloat();
                System.out.print("Nhap b: "); float b = sc.nextFloat();
                System.out.print("Nhap c: "); float c = sc.nextFloat();
                double delta = Math.pow(b,2) - 4 * a * c;
                System.out.println("Delta: "+ delta);
                if (delta < 0) {
                    System.out.println("Khong the tinh can delta vi delta la so am.");
                } else {
                    double canDelta = Math.sqrt(delta);
                    System.out.println("Can delta: "+ canDelta);
                }
                isFalse = false;
            }catch(Exception e){
                System.out.println("Ban da nhap sai moi ban nhap lai");
                sc.nextLine();
            }
        }while(isFalse);
    }
    
}
