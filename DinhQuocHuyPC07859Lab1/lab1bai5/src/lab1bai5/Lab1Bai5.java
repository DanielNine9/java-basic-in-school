/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1bai5;

import java.util.Scanner;

/**
 *
 * Giao vien huong dan: Tran Minh Hung
 * Nguoi tao: Dinh Quoc Huy PC07859
 * @author huyyd
 */
public class Lab1Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isFalse = true;
        float java, js, en;
        do{
            try{
                do{
                    System.out.print("Nhap diem Java: ");  java = sc.nextFloat();
                    if(java < 0 || java > 10){
                         System.out.println("Ban da nhap sai moi ban nhap lai");
                    }
                }while(java < 0 || java > 10);
                do{
                     System.out.print("Nhap diem JavaScript: "); js = sc.nextFloat();
                    if(js < 0 || js > 10){
                         System.out.println("Ban da nhap sai moi ban nhap lai");
                    }
                }while(js < 0 || js > 10);
                do{
                    System.out.print("Nhap diem tieng anh 1.2: "); en = sc.nextFloat();
                    if(en < 0 || en > 10){
                         System.out.println("Ban da nhap sai moi ban nhap lai");
                    }
                }while(en < 0 || en > 10);
                double diemTb = (java + js + (en * 2)) / 4;
                System.out.println("Diem trung binh: "+ diemTb);
                isFalse = false;
            }catch(Exception e){
                System.out.println("Ban da nhap sai moi ban nhap lai");
                sc.nextLine();
            }
        }while(isFalse);
    }
}
