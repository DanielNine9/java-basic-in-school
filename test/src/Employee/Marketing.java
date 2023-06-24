/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employee;

/**
 *
 * @author huyyd
 */
public class Marketing extends Employee{
    private double marketing;

    public Marketing(String name, double inCome,double marketing) {
        super(name, inCome);
        this.marketing = marketing;
    }

    public double getMarketing() {
        return marketing;
    }

    @Override
    public void export() {
        super.export(); 
        System.out.println("Luong marketing: "+ this.getMarketing());
    }
    
    
    
}
