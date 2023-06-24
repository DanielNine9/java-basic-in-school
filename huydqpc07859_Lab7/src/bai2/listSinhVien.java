/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author huyyd
 */
public class listSinhVien {

    private static ArrayList<SinhVienPoly> list = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void menu() {
        boolean loop = true;
        int lc;
        do {
            try {
                System.out.println("Menu");
                System.out.println("1. Nhap vao danh sach sinh vien");
                System.out.println("2. Xuat danh sach sinh vien");
                System.out.println("3. Xuat danh sach sinh vien co hoc luc gioi");
                System.out.println("4. Sap xep sinh vien theo diem");
                System.out.println("0. Thoat chuong trinh");
                System.out.println("Moi ban nhap lua chon: ");
                lc = Integer.parseInt(sc.nextLine());

                switch (lc) {
                    case 1:
                        nhap();
                        break;
                    case 2:
                        xuat();
                        break;
                    case 3:
                        xuatDiem();
                        break;
                    case 4:
                        sapxep();
                        break;
                    case 0: {
                        System.out.println("Chuong trinh ket thuc");
                        loop = false;
                    }
                    default:
                        System.out.println("Ban vua nhap sai! Moi ban nhap lai");
                }
            } catch (Exception e) {
                System.out.println("Ban vua nhap sai! vui long nhap lai");
            }
        } while (loop);
    }

    public static void nhap() {
        int lc;
        do {
            try {
                System.out.println("Nhap chuyen nganh sinh vien: ");
                System.out.println("1. Chuyen nganh cong nghe thong tin.");
                System.out.println("2. Chuyen nganh marketing");
                System.out.print("Moi ban nhap lua chon: ");
                lc = Integer.parseInt(sc.nextLine());
                if(lc == 1 || lc == 2) break;
            } catch (Exception e) {
                System.out.println("Ban vua nhap sai! Moi ban nhap lai");
            }
        } while (true);

        System.out.println("Nhap ho ten sinh vien: ");
        String name = sc.nextLine();
        if (lc == 1) {
            double java, html, css;
            do {
                try {
                    System.out.println("Nhap diem JAVA: ");
                    java = Double.parseDouble(sc.nextLine());
                    if (java < 0 || java > 10) {
                        System.out.println("Ban vua nhap sai! Moi ban nhap lai.");
                    } else {
                        break;
                    }
                } catch (Exception e) {
                    System.out.println("Ban vua nhap sai! Moi ban nhap lai");
                }
            } while (true);
            do {
                try {
                    System.out.println("Nhap diem HTML: ");

                    html = Double.parseDouble(sc.nextLine());
                    if (html < 0 || html > 10) {
                        System.out.println("Ban vua nhap sai! Moi ban nhap lai.");
                    } else {
                        break;
                    }
                } catch (Exception e) {
                    System.out.println("Ban vua nhap sai! Moi ban nhap lai");
                }

            } while (true);
            do {
                try {
                    System.out.println("Nhap diem CSS: ");
                    css = Double.parseDouble(sc.nextLine());
                    if (css < 0 || css > 10) {
                        System.out.println("Ban vua nhap sai! Moi ban nhap lai.");
                    } else {
                        break;
                    }
                } catch (Exception e) {
                    System.out.println("Ban vua nhap sai! Moi ban nhap lai");
                }
            } while (true);

            SinhVienPoly sv = new SinhVienIT(java, html, css, name, "IT");
            list.add(sv);
        } else if (lc == 2) {
            double mar, sales;
            do {
                try {
                    System.out.println("Nhap diem Marketing: ");
                    mar = Double.parseDouble(sc.nextLine());
                    if (mar < 0 || mar > 10) {
                        System.out.println("Ban vua nhap sai! Moi ban nhap lai.");
                    } else {
                        break;
                    }
                } catch (Exception e) {
                    System.out.println("Ban vua nhap sai! Moi ban nhap lai");
                }
            } while (true);
            do {
                try {
                    System.out.println("Nhap diem Sales: ");
                    sales = Double.parseDouble(sc.nextLine());
                    if (sales < 0 || sales > 10) {
                        System.out.println("Ban vua nhap sai! Moi ban nhap lai");
                    } else {
                        break;
                    }
                } catch (Exception e) {
                    System.out.println("Ban vua nhap sai! Moi ban nhap lai.");
                }
            } while (true);

            SinhVienPoly sv = new SinhVienBiz(mar, sales, name, "Biz");
            list.add(sv);
        } else {
            System.out.println("Ban vua nhap sai! Moi ban nhap lai");
        }
    }

    public static void xuat() {
        for (SinhVienPoly x : list) {
            x.xuat();
        }
    }

    public static void xuatDiem() {
        for (SinhVienPoly x : list) {
            if (x.getHocLuc() == "Gioi") {
                x.xuat();
            }
        }
    }

    public static void sapxep() {
        System.out.println("Sap xep sinh vien ");
        System.out.println("1. Sap xep sinh vien theo diem tang dan ");
        System.out.println("2. Sap xep sinh vien theo diem giam dan");
        System.out.println("Moi ban nhap lua chon: ");
        int lc = Integer.parseInt(sc.nextLine());
        if (lc == 1) {
            Collections.sort(list, new Comparator<SinhVienPoly>() {
                @Override
                public int compare(SinhVienPoly o1, SinhVienPoly o2) {
                    if (o1.getDiem() < o2.getDiem()) {
                        return -1;
                    } else {
                        return 1;
                    }

                }
            }
            );
            xuat();
        } else if (lc == 2) {
            Collections.sort(list, new Comparator<SinhVienPoly>() {
                @Override
                public int compare(SinhVienPoly o1, SinhVienPoly o2) {
                    if (o1.getDiem() < o2.getDiem()) {
                        return 1;
                    } else {
                        return -1;
                    }
                }

            });
            xuat();
        }
    }

}
