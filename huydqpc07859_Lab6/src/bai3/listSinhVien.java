/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author huyyd
 */
public class listSinhVien {

    Scanner sc = new Scanner(System.in);
    ArrayList<SinhVien> list = new ArrayList<>();

    public void nhap() {
        String name,email,id, phoneNumber;
        do {
            System.out.println("Nhap ten sinh vien: ");
             name = sc.nextLine();
            if (checkName(name)) {
                break;
            } else {
                System.out.println("Ban vua nhap sai! Moi ban nhap lai");
            }
        } while (true);

        do {
            String regex = "^(.+)@(.+)$";
            System.out.println("Nhap email sinh vien: ");
             email = sc.nextLine();
            if (email.matches(regex)) {
                break;
            } else {
                System.out.println("Ban vua nhap sai! Moi ban nhap lai.");
            }
        } while (true);

        do {
            String regex = "^(\\+\\d{1,3}( )?)?((\\(\\d{1,3}\\))|\\d{1,3})[- .]?\\d{3,4}[- .]?\\d{4}$";
            System.out.println("Moi ban nhap so dien thoai: ");
             phoneNumber = sc.nextLine();
            if (phoneNumber.matches(regex)) {
                break;
            } else {
                System.out.println("Ban vua nhap sai! Moi ban nhap lai");
            }
        } while (true);
        do {
            
            System.out.println("Moi ban nhap so chung minh nhan dan: ");
             id = sc.nextLine();
             String regex = "\\d{10}";
            if (id.matches(regex)) {
                break;
            } else {
                System.out.println("Ban vua nhap sai! Moi ban nhap lai");
            }
           
        } while (true);
         
            SinhVien sv = new SinhVien(name,email, id, phoneNumber);
            list.add(sv);
    }
    
    public void listNhap(){
        if(list.isEmpty()){
            System.out.println("Moi ban nhap so luong sinh vien trong mang: "); int n = Integer.parseInt(sc.nextLine());
            for(int i = 0; i < n; i++) nhap();
        }else nhap();
    }
    
    public void xuat(){
        for(SinhVien x : list){
            x.xuat();
        }
    }
    
      private static boolean checkName(String name) {
        for (char x : name.toCharArray()) {
            if (Character.isDigit(x)) {
                return false;
            }
        }
        return true;

    }
}
