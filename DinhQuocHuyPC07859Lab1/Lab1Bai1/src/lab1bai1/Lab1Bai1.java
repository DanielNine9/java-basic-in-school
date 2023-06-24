/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1bai1;

import java.util.Scanner;

/**
 *
 * Giao vien huong dan: Tran Minh Hung
 * Nguoi tao: Dinh Quoc Huy PC07859
 * @author huyyd
 */
public class Lab1Bai1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double gpa;
        boolean isFalse = true;
        System.out.print("Nhap ho va ten: "); String name = sc.nextLine();
        do{
            try{
                do{
                   System.out.print("Nhap diem trung binh: ");  gpa = sc.nextDouble();
                   if(gpa < 0 || gpa > 10) System.out.println("Ban da nhap sai moi ban nhap lai");
                }while(gpa < 0 || gpa > 10);
                System.out.printf("%s %.2f diem", name, gpa);
                isFalse = false;
            }catch(Exception e){
                 System.out.println("Ban da nhap sai moi ban nhap lai");
                 sc.nextLine();
            }
        }while(isFalse);
    }
    
}
