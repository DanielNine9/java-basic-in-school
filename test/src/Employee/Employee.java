/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employee;

/**
 *
 * @author huyyd
 */
public class Employee {
    private String name;
    private double inCome;
    public Employee() {

    }

    public Employee(String name, double inCome) {
        this.name = name;
        this.inCome = inCome;
    }

    public double getInCome() {
        return inCome;
    }

    public String getName() {
        return name;
    }

    public void setInCome(double inCome) {
        this.inCome = inCome;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void export(){
        System.out.println("Ho va ten: "+ this.getName());
        System.out.println("Luong: "+ this.getInCome());
    }
}
