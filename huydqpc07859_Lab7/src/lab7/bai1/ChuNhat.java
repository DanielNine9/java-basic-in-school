/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7.bai1;

/**
 *
 * @author huyyd
 */
public class ChuNhat {
    private double rong,dai;

    public ChuNhat(double rong, double dai) {
        this.rong = rong;
        this.dai = dai;
    }

    public double getRong() {
        return rong;
    }

    public void setRong(double rong) {
        this.rong = rong;
    }

    public double getDai() {
        return dai;
    }

    public void setDai(double dai) {
        this.dai = dai;
    }
    
    public double dienTich(){
        return this.dai * this.rong;
    }
    
    public double chuVi(){
        return (this.dai +  this.rong) * 2;
    } 
    
    public void xuat(){
        System.out.println("Chieu dai hinh chu nhat: "+ this.dai);
        System.out.println("Chieu rong hinh chu nhat: "+ this.rong);
        System.out.println("Chu vi hinh chu nhat: "+ this.chuVi());
        System.out.println("Dien tich hinh chu nhat: "+ this.dienTich());
    }
}
