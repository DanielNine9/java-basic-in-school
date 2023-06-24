/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author huyyd
 */
public class SinhVienIT extends SinhVienPoly{
    private double java, css, html;
    
    public SinhVienIT(double java, double css, double html, String name, String major) {
        super(name, major);
        this.java = java;
        this.css = css;
        this.html = html;
    }

    @Override
    public double getDiem() {
        return (this.css + this.java + this.html) / 3;
    }
    
}
