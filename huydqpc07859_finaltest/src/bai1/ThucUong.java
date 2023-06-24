/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author huyyd
 */
public class ThucUong {

        private String name;
        private double price;

        public ThucUong() {
        }

        public ThucUong(String name, double price) {
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

        public double giamGia() {
                if(this.getPrice() <= 0){
                        return 0;
                }
                if (this.getPrice() <= 100000) {
                        return this.getPrice() * 0.15;
                } else if (this.getPrice() >= 100000 && this.getPrice() <= 200000) {
                        return this.getPrice() * 0.2;
                } else if (this.getPrice() > 200000) {
                        return this.getPrice() * 0.3;
                }
                return 0;
        }

        public void xuat() {
                System.out.println("Ten thuc uong: " + this.getName());
                System.out.println("Gia thuc uong: " + this.getPrice());
                System.out.println("Giam gia: " + this.giamGia());
                System.out.println("Gia can thanh toan: " + (this.getPrice() - this.giamGia()));
        }

        public void chuyenHoa() {
                System.out.println("Ten thuc uong: " + this.getName().toUpperCase());
                System.out.println("Gia thuc uong: " + this.getPrice());
                System.out.println("Giam gia: " + this.giamGia());
                System.out.println("Gia can thanh toan: " + (this.getPrice() - this.giamGia()));

        }

        public void chuyenThuong() {
                System.out.println("Ten thuc uong: " + this.getName().toLowerCase());
                System.out.println("Gia thuc uong: " + this.getPrice());
                System.out.println("Giam gia: " + this.giamGia());
                System.out.println("Gia can thanh toan: " + (this.getPrice() - this.giamGia()));

        }

}
