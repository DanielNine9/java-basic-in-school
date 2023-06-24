/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

import java.util.Scanner;

/**
 *
 * @author huyyd
 */
public class SanPham {
   private String name; 
   private double price;
   private double discount;
   
    public SanPham(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public SanPham(String name,  double price){
        this.name = name;
        this.price = price;
    }
    
    public SanPham() {
    }
    
    public double getThueNhapKhau(){
        return this.price * 0.1;
    }
    
 
    public void xuat(){
        double tax = this.getThueNhapKhau();
        System.out.println("Ten san pham: "+ this.name);
        System.out.printf("Gia san pham: %.0f\n", this.price);
        System.out.printf("Ma giam gia san pham: %.0f\n", this.discount);
        System.out.printf("Thue nhap khau: %.0f\n\n\n", tax);
    }
   
}
