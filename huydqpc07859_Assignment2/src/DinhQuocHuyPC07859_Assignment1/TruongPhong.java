/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DinhQuocHuyPC07859_Assignment1;

/**
 *
 * @author huyyd
 */
public class TruongPhong extends NhanVien {

    private double trachNhiem;

    public TruongPhong(double trachNhiem, String maNV, String hoTen, double luong) {
        super(maNV, hoTen, luong , "truongphong");
        this.trachNhiem = trachNhiem;
    }

    public double getTrachNhiem() {
        return trachNhiem;
    }

    public void setTrachNhiem(double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }

    @Override
    public double getThuNhap() {
        return this.luong + this.trachNhiem;
    }

    @Override
    public void xuat() {
        System.out.printf("\n\t\t\t\t\t\tChuc vu: Truong phong");
        System.out.print("\n\t\t\t\t\t\tMSNV: " + this.maNV);
        System.out.printf("\n\t\t\t\t\t\tHo va ten: %s", this.hoTen);
        System.out.printf("\n\t\t\t\t\t\tLuong: %.0f", this.getThuNhap());
        System.out.printf("\n\t\t\t\t\t\tThue thu nhap: %.0f\n", this.getThueThuNhap());
        System.out.printf("\n\t\t\t\t\t\tTien thuong trach nhiem: %.0f", this.trachNhiem);
         System.out.println("\n\t\t\t\t\t---------------------------------------------");
    }
}
