/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

import java.util.Scanner;

/**
 *
 * @author huyyd
 */
public class SanPham {

          private String name;
          private double price;
          private String brand;

          public SanPham(String name, double price, String brand) {
                    this.name = name;
                    this.price = price;
                    this.brand = brand;
          }

          public String getName() {
                    return name;
          }

          public void setName(String name) {
                    this.name = name;
          }

          public double getPrice() {
                    return price;
          }

          public void setPrice(double price) {
                    this.price = price;
          }

          public String getBrand() {
                    return brand;
          }

          public void setBrand(String brand) {
                    this.brand = brand;
          }

          public void xuat() {
                    System.out.println("Ten san pham: " + this.name);
                    System.out.println("Gia san pham: " + this.price);
                    System.out.println("Hang san xuat: " + this.brand);
          }
}
