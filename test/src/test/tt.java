/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author huyyd
 */
public class tt {

        private static Scanner sc = new Scanner(System.in);
        private static ArrayList<Test> list = new ArrayList<>();

        public static void menu() {
                int lc;
                while (true) {
                        try {
                                System.out.println("\t\t\t\t\t\tMenu");
                                System.out.println("\t\t\t\t1. ");
                                System.out.println("\t\t\t\t2. ");
                                System.out.println("\t\t\t\t3. ");
                                System.out.println("\t\t\t\t4. ");
                                System.out.println("\t\t\t\t0. Thoat chuong trinh");
                                System.out.print("Moi ban nhap lua chon: ");
                                lc = Integer.parseInt(sc.nextLine());
                                switch (lc) {
                                        case 1:
                                                cn1();
                                                break;
                                        case 2:
                                                cn2();
                                                break;
                                        case 3:
                                                cn3();
                                                break;
                                        case 4:
                                                cn4();
                                                break;
                                        case 0: {
                                                System.out.println("\t\t\t\t\tChuong trinh ket thuc");
                                                return;
                                        }
                                        default: {
                                                System.out.println("Ban vua nhap sai! Moi ban nhap lai.");
                                        }
                                }
                        } catch (Exception e) {
                                System.out.println("Ban vua nhap sai! Moi ban nhap lai");
                        }
                }
        }

        private static boolean checkName(String name) {
                for (char x : name.toCharArray()) {
                        if (Character.isDigit(x)) {
                                return false;
                        }
                }
                return true;
        }

        private static void nhap() {
                String name;
                double price;
                while (true) {
                        try {
                                System.out.println("Nhap");
                                name = sc.nextLine();
                                if (checkName(name)) {
                                        break;
                                }
                                System.out.println("Ban vua nhap sai! Moi ban nhap lai");
                        } catch (Exception e) {
                                System.out.println("Ban vua nhap sai! Moi ban nhap lai");
                        };
                }
                while (true) {
                        try {
                                System.out.println("Nhap");
                                price = Double.parseDouble(sc.nextLine());
                                if (price > 0) {
                                        break;
                                }
                                System.out.println("Ban vua nhap sai! Moi ban nhap lai");
                        } catch (Exception e) {
                                System.out.println("Ban vua nhap sai! Moi ban nhap lai");
                        };
                }

//                list.add(new );
        }

        private static void cn1() {
                int n;
                while (true) {
                        try {
                                System.out.print("Moi ban nhap so luong muon nhap vao danh sach: ");
                                n = Integer.parseInt(sc.nextLine());
                                if(n > 0) break;
                                System.out.println("Ban vua nhap sai! Moi ban nhap lai");
                        } catch (Exception e) {
                                System.out.println("Ban vua nhap sai! Moi ban nhap lai");
                        };
                }
                for (int i = 0; i < n; i++) {
                        nhap();
                }

        }

        private static void cn2() {
//                for(Test x : list){
//                        x.xuat();
//                }
        }

        private static void cn3() {
        }

        private static void cn4() {

        }

        public static void main(String[] args) {
                tt.menu();
        }
}
