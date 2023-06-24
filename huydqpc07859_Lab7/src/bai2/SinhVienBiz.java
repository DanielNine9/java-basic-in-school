/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author huyyd
 */
public class SinhVienBiz extends SinhVienPoly {

        private double marketing, sales;

        public SinhVienBiz(double marketing, double sales, String name, String major) {
                super(name, major);
                this.marketing = marketing;
                this.sales = sales;
        }

        @Override
        public double getDiem() {
                return (this.marketing + this.sales) / 2;
        }

}
