/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package huydqpc07859_finaltest;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author huyyd
 */
public class ListLapTop {

        private static Scanner sc = new Scanner(System.in);
        private static ArrayList<LapTop> list = new ArrayList<>();

        public static void menu() {
                int lc;
                while (true) {
                        try {
                                System.out.println("\t\t\t\t\t\tMenu");
                                System.out.println("\t\t\t\t1. Nhap ten lap top");
                                System.out.println("\t\t\t\t2. Xuat ten lap top");
                                System.out.println("\t\t\t\t3. Tim kiem gia tien");
                                System.out.println("\t\t\t\t4. Xoa theo ten");
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
                                System.out.println("Nhap ten lap top");
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
                                System.out.println("Nhap gia lap top");
                                price = Double.parseDouble(sc.nextLine());
                                if (price > 0) {
                                        break;
                                }
                                System.out.println("Ban vua nhap sai! Moi ban nhap lai");
                        } catch (Exception e) {
                                System.out.println("Ban vua nhap sai! Moi ban nhap lai");
                        };
                }
                list.add(new LapTop(name, price));
        }

        private static void cn1() {
                int n;
                while (true) {
                        try {
                                System.out.print("Moi ban nhap so luong muon nhap vao danh sach: ");
                                n = Integer.parseInt(sc.nextLine());
                                if (n > 0) {
                                        break;
                                }
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
                for (LapTop x : list) {
                        x.xuat();
                        System.out.println("");
                }
        }

        private static void cn3() {
                double st, en;
                System.out.println("Nhap gia min: ");
                st = Double.parseDouble(sc.nextLine());
                System.out.println("Nhap gia max: ");
                en = Double.parseDouble(sc.nextLine());
                for (LapTop x : list) {
                        if (x.getPrice() >= st && x.getPrice() <= en) {
                                x.xuat();
                                System.out.println("");
                        }
                }
        }

        private static void cn4() {
                String name = sc.nextLine();
                for (LapTop x : list) {
                        if (x.getName().equalsIgnoreCase(name)) {
                                list.remove(x);
                                System.out.println("Xoa thanh cong!");
                                return;
                        }
                }
        }

}
