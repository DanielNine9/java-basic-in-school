/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author huyyd
 */
public class sanPham {
    private String ten;
    private double gia;

    public sanPham() {
    }

    public sanPham(String ten, double gia) {
        this.ten = ten;
        this.gia = gia;
    }

    public double getGia() {
        return gia;
    }

    public String getTen() {
        return ten;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
}
