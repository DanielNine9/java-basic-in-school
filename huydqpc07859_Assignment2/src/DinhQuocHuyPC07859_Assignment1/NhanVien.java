/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DinhQuocHuyPC07859_Assignment1;

/**
 *
 * @author huyyd
 */
public class NhanVien {
    protected String maNV;
    protected String hoTen;
    protected double luong;
    private String position ;

    public NhanVien(String maNV, String hoTen, double luong , String position) {
        this.maNV = maNV.trim();
        this.hoTen = hoTen.trim();
        this.luong = luong;
        this.position = position;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV.trim();
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen.trim();
    }

    public double getLuong() {
        return luong;
    }
    
    public String getPosition(){
        return this.position;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    
    public double getThuNhap(){
        return this.luong;
    }
    
    public double getThueThuNhap(){
        if(this.luong < 9000000) {
            return 0;
        }
        else if(this.luong >= 9000000 && this.luong < 15000000){
            return  this.luong * 0.1;
        }else{
            return this.luong * 0.12;
        }
    }
    public String getFirstName() {
        String ten = this.hoTen;
        if (ten.indexOf(" ") > 0) {
            int vt = ten.lastIndexOf(" ");
            return ten.substring(vt + 1);
        } else {
            return ten;
        }
    }
    
    public void xuat(){
        System.out.printf("\n\t\t\t\t\t\tChuc vu: Nhan vien cong ty");
        System.out.print("\n\t\t\t\t\t\tMSNV: " + this.maNV);
        System.out.printf("\n\t\t\t\t\t\tHo va ten: %s", this.hoTen);
        System.out.printf("\n\t\t\t\t\t\tLuong: %.0f", this.getThuNhap());
        System.out.printf("\n\t\t\t\t\t\tThue thu nhap: %.0f\n", this.getThueThuNhap());
        System.out.println("\n\t\t\t\t\t---------------------------------------------");
    }
    
}
