/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employee;

/**
 *
 * @author huyyd
 */
public class Sales extends Employee{
    private double sales;

    public Sales(String name, double inCome,double sales) {
        super(name, inCome);
        this.sales = sales;
    }

    public double getSales() {
        return sales;
    }

    @Override
    public void export() {
        super.export();
        System.out.println("Luong sales: "+ this.getSales());
    }
    
}
