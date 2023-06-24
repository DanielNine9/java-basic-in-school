/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1bai2;

import java.util.Scanner;

/**
 *
 * Giao vien huong dan: Tran Minh Hung
 * Nguoi tao: Dinh Quoc Huy PC07859
 * @author huyyd
 */
public class Lab1Bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dai, rong;
        boolean isFalse = true;
        do{
            try{
                System.out.print("Nhap chieu dai: ");  dai = sc.nextDouble();
                System.out.print("Nhap chieu rong: ");  rong = sc.nextDouble();
                double chuVi = (dai + rong) * 2;
                double dienTich = dai * rong;
                double min = Math.min(dai, rong);
                System.out.printf("Chu vi hinh chu nhat: %.2f", chuVi);
                System.out.println("");
                System.out.printf("Dien tich hinh chu nhat: %.2f", dienTich);
                System.out.println("");
                System.out.printf("Canh nho nhat %.2f", min);
                isFalse = false;
            }catch(Exception e){
                System.out.println("Ban da nhap sai moi ban nhap lai");
                sc.nextLine();
            }
        }while(isFalse);
        
    }
    
}
