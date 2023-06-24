/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DinhQuocHuyPC07859_Assignment1;

/**
 *
 * @author huyyd
 */
public class TiepThi extends NhanVien {

    private double doanhSo;
    private double hoaHong;

    public TiepThi(double doanhSo, double hoaHong, String maNV, String hoTen, double luong) {
        super(maNV, hoTen, luong , "tiepthi");
        this.doanhSo = doanhSo;
        this.hoaHong = hoaHong;
    }

    public double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public double getHoaHong() {
        return hoaHong;
    }

    public void setHoaHong(double hoaHong) {
        this.hoaHong = hoaHong;
    }

    @Override
    public double getThuNhap() {
        return this.luong + this.doanhSo + this.hoaHong;
    }

    @Override
    public void xuat() {
        System.out.printf("\n\t\t\t\t\t\tChuc vu: Nhan vien tiep thi");
        System.out.print("\n\t\t\t\t\t\tMSNV: " + this.maNV);
        System.out.printf("\n\t\t\t\t\t\tHo va ten: %s", this.hoTen);
        System.out.printf("\n\t\t\t\t\t\tLuong: %.0f", this.getThuNhap());
        System.out.printf("\n\t\t\t\t\t\tThue thu nhap: %.0f\n", this.getThueThuNhap());
        System.out.printf("\n\t\t\t\t\t\tDoanh so: %.0f", this.doanhSo);
        System.out.printf("\n\t\t\t\t\t\tHue hong: %.0f", this.hoaHong);
         System.out.println("\n\t\t\t\t\t---------------------------------------------");
    }

}
