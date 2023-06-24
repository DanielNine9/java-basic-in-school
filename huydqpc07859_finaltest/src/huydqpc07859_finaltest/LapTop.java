/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package huydqpc07859_finaltest;

/**
 *
 * @author huyyd
 */
public class LapTop {
        private String name;
        private double price;

        public LapTop() {
        }

        public LapTop(String name, double price) {
                this.name = name;
                this.price = price;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public double getPrice() {
                return price;
        }

        public void setPrice(double price) {
                this.price = price;
        }
        
        
        public void xuat(){
                System.out.println("Ten lap top: "+ this.getName());
                System.out.println("Gia lap top: "+ this.getPrice());
        }
}
