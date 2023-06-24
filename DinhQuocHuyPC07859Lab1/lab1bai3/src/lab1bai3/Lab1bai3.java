/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1bai3;

import java.util.Scanner;

/**
 *
 * Giao vien huong dan: Tran Minh Hung
 * Nguoi tao: Dinh Quoc Huy PC07859
 * @author huyyd
 */
public class Lab1bai3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double canh;
        boolean isFalse = true;
        do{
            try{
                System.out.println("Nhap canh cua hinh lap phuong: "); canh = sc.nextDouble();
                System.out.println("The tich lap phuong: "+ Math.pow(canh, 3));
                isFalse = false;
            }catch(Exception e){
                System.out.println("Ban da nhap sai moi ban nhap lai");
                sc.nextLine();
            }
        }while(isFalse);
       
    }
    
}
