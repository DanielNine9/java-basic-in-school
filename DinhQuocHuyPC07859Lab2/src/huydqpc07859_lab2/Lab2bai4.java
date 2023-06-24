/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package huydqpc07859_lab2;

import java.util.Scanner;

/**
 *
 * @author huyyd
 */
public class Lab2bai4 {

    public static void cn1(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh da cho vo so nghiem!");
            } else {
                System.out.println("Phuong trinh da cho vo nghiem!");
            }
        } else {
            System.out.println("Phuong trinh co nghiem: " + (-b / a));
        }
    }

    public static void cn2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        double a = sc.nextDouble();
        System.out.println("Nhap b: ");
        double b = sc.nextDouble();
        System.out.println("Nhap c: ");
        double c = sc.nextDouble();
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phuong trinh da cho vo so nghiem!");
                } else {
                    System.out.println("Phuong trinh da cho vo nghiem!");
                }
            } else {
                System.out.println("Phuong trinh co nghiem: " + (-c / b));
            }
        } else {
            double delta = Math.pow(b, 2) - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phuong trinh da cho vo nghiem");
            } else if (delta == 0) {
                System.out.println("Phuong trinh da cho co nghiem kep x1 = x2 = " + (-b / (2 * a)));
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phuong trinh da cho co 2 nghiem phan biet");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
    }

    public static void cn3(double tien) {
        double tong = 0;
        if (tien > 0 && tien <= 50) {
            tong = tien * 1000;
        } else {
            tong = 50 * 1000 + (tien - 50) * 1200;
        }
        System.out.printf("Tong tien: %.0f", tong);
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lc;
        do {
            System.out.println("\t\t\t\t\t+------------------MENU------------------+");
            System.out.println("\t\t\t\t\t| 1. Tinh phuong trinh bac nhat          |");
            System.out.println("\t\t\t\t\t| 2. TInh phuong trinh bac 2             |");
            System.out.println("\t\t\t\t\t| 3. Tinh tien dien                      |");
            System.out.println("\t\t\t\t\t| 4. Thoat chuong trinh                  |");
            System.out.println("\t\t\t\t\t+----------------------------------------+");
            System.out.print("Moi ban nhap lua chon: ");
            lc = sc.nextInt();
            switch (lc) {
                case 1: {
                    System.out.println("Nhap a");
                    double a = sc.nextDouble();
                    System.out.println("Nhap b: ");
                    double b = sc.nextDouble();
                    cn1(a, b);
                    break;
                }
                case 2: {
                    cn2();
                    break;
                }
                case 3: {
                    boolean isFalse = true;
                    double tien;
                    do {
                        System.out.println("Nhap vao so dien su dung: ");
                        tien = sc.nextDouble();
                        if (tien < 0) {
                            System.out.println("Ban da nhap sai moi ban nhap lai");
                        } else {
                            isFalse = false;
                        }
                    } while (isFalse);
                    cn3(tien);
                    break;
                }
                case 0: {
                    System.out.println("     Chuong trinh ket thuc    ");
                    break;
                }
                default: {
                    System.out.println("Ban vua nhap sai moi ban nhap lai");
                    break;
                }
            }
        } while (lc != 0);
        System.out.println("\t\t\t\t\t+-----------------------------------------------------+");
        System.out.println("\t\t\t\t\t| Giao vien huong dan: thay Tran Minh Hung            |");
        System.out.println("\t\t\t\t\t| Nguoi tao: Dinh Quoc Huy                            |");
        System.out.println("\t\t\t\t\t+-----------------------------------------------------+");
    }
}
