/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author huyyd
 */
public abstract class SinhVienPoly {
    private String name, major;

    public SinhVienPoly(String name, String major) {
        this.name = name;
        this.major = major;
    }
    abstract public double getDiem();
    public String getHocLuc(){
        if(this.getDiem() <  5) return "Yeu";
        else if(this.getDiem() >= 5 && this.getDiem() < 6.5) return "Trung Binh";
        else if(this.getDiem() >= 6.5 && this.getDiem() < 7.5) return "Kha";
        else if(this.getDiem() >= 7.5 && this.getDiem() < 9) return "Gioi";
        else return "Xuat Sac";
    };
    
    public void xuat(){
        System.out.println("Ho ten sinh vien: "+ this.name);
        System.out.println("Nganh hoc: "+ this.major);
        System.out.println("Diem: "+ this.getDiem());
        System.out.println("Hoc luc: "+ this.getHocLuc());
       
    }
}
