/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

/**
 *
 * @author huyyd
 */
public class SinhVien {
    private String name, email, cmnd, phoneNumber;

    public SinhVien() {
    }

    public SinhVien(String name, String email, String cmnd, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.cmnd = cmnd;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public void xuat(){
        System.out.println("Ho ten sinh vien: "+ this.name);
        System.out.println("Email sinh vien: "+ this.email);
        System.out.println("So dien thoai sinh vien: "+ this.phoneNumber);
        System.out.println("Chung minh nhan dan cua sinh vien: "+ this.cmnd);
   
    }   
}
