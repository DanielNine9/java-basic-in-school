/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7.bai1;

/**
 *
 * @author huyyd
 */
public class hinhVuong extends ChuNhat{
    private double canh;

    public hinhVuong(double canh) {
        super(1, 1);
        this.canh = canh;
    }

    @Override
    public double chuVi() {
        return this.canh * 4;
    }

    @Override
    public double dienTich() {
        return Math.pow(canh, 2);
    }
    
    @Override
    public void xuat(){
        System.out.println("Canh hinh vuong: " + this.canh);
        System.out.println("Chu vi hinh vuong: "+ this.chuVi());
        System.out.println("Dien tich hinh vuong:  "+ this.dienTich());
    }
    
   
    
    
    
}
