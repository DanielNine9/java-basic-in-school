/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DinhQuocHuyPC07859_Assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author huyyd
 */
public class ListNhanVien {

        private static Scanner sc = new Scanner(System.in);
        private static ArrayList<NhanVien> list = new ArrayList<>();
        private static HashSet<String> set = new HashSet<String>();

        public static void menu() {
                boolean isFalse = true;
                int lc;
                Scanner sc = new Scanner(System.in);
                do {
                        System.out.println("\n\t\t\t\t\t+------------------MENU-------------------+");
                        System.out.println("\t\t\t\t\t| 1. Nhap danh sach nhan vien tu          |");
                        System.out.println("\t\t\t\t\t| 2. Xuat danh sach nhan vien             |");
                        System.out.println("\t\t\t\t\t| 3. Tim va hien thi nhan vien ra theo ma |");
                        System.out.println("\t\t\t\t\t| 4. Xoa nhan vien theo ma                |");
                        System.out.println("\t\t\t\t\t| 5. Cap nhat thong tin nhan vien theo ma |");
                        System.out.println("\t\t\t\t\t| 6. Tim cac nhan vien theo pham vi luong |");
                        System.out.println("\t\t\t\t\t| 7. Sap xep nhan vien theo ho va ten     |");
                        System.out.println("\t\t\t\t\t| 8. Sap xep nhan vien theo thu nhap      |");
                        System.out.println("\t\t\t\t\t| 9. Xuat 5 nhan vien co thu nhap cao nhat|");
                        System.out.println("\t\t\t\t\t| 10. Hien thi theo chuc vu               |");
                        System.out.println("\t\t\t\t\t| 0. Thoat chuong trinh                   |");
                        System.out.println("\t\t\t\t\t+-----------------------------------------+");
                        try {
                                System.out.print("Moi ban nhap lua chon: ");
                                lc = Integer.parseInt(sc.nextLine());
                                switch (lc) {
                                        case 1:
                                                list();
                                                break;
                                        case 2:
                                                xuat();
                                                break;
                                        case 3:
                                                searchByID();
                                                break;
                                        case 4: {
                                                String id = inpId();
                                                removeById(id);
                                                break;
                                        }

                                        case 5: {
                                                updateById();
                                                break;
                                        }
                                        case 6:
                                                searchByRangeSalary();
                                                break;
                                        case 7:
                                                sortByName();
                                                break;
                                        case 8:
                                                sortByIncome();
                                                break;
                                        case 9:
                                                Top5ByIncome();
                                                break;
                                        case 10:
                                                DivisionByPosition();
                                                break;
                                        case 0: {
                                                System.out.println("\t\t\t\t\t\tChuong trinh ket thuc");
                                                System.out.println("");
                                                isFalse = false;
                                                break;
                                        }
                                        default:
                                                System.out.println("Ban da nhap sai! Moi ban nhap lai");
                                }
                        } catch (Exception e) {
                                System.out.println("Ban da nhap sai! Moi ban nhap lai.");
                        }
                } while (isFalse);
                System.out.println("\t\t\t\t\t+-------------------------------------------------+");
                System.out.println("\t\t\t\t\t| Giao vien giang day: thay Tran Minh Hung        |");
                System.out.println("\t\t\t\t\t| Nguoi tao: Dinh Quoc Huy                        |");
                System.out.println("\t\t\t\t\t| MSSV: PC07859                                   |");
                System.out.println("\t\t\t\t\t+-------------------------------------------------+");
        }

        private static boolean checkName(String name) {
                for (char x : name.toCharArray()) {
                        if (Character.isDigit(x)) {
                                return false;
                        }
                }
                return true;

        }

        public static String capFirstWord(String str) {
                char[] charArray = str.toCharArray();
                boolean whiteSpace = true;

                for (int i = 0; i < charArray.length; i++) {
                        if (Character.isWhitespace(charArray[i])) {
                                whiteSpace = true;
                        } else if (whiteSpace) {
                                charArray[i] = Character.toUpperCase(charArray[i]);
                                whiteSpace = false;
                        }
                }
                return new String(charArray);
        }

        private static String inpName() {
                String name;
                do {
                        System.out.print("\t\t\t\t\t\tHo ten nhan vien: ");
                        name = sc.nextLine();
                        if (checkName(name)) {
                                break;
                        } else {
                                System.out.println("Ban vua nhap sai! Vui long nhap lai");
                        }
                } while (true);
                return capFirstWord(name);
        }

        private static void nhap() {
                System.out.println("\t\t\t\t\t---------------------------------------------");
                String id = inpIdCheck();
                String name = inpName();
                double salary = inpSalary();
                do {
                        try {

                                System.out.println("\t\t\t\t\t\tChuc vu cua nhan vien: ");
                                System.out.println("\t\t\t\t\t\t1. Truong phong");
                                System.out.println("\t\t\t\t\t\t2. Nhan vien");
                                System.out.println("\t\t\t\t\t\t3. Nhan vien Tiep thi\n");
                                System.out.print("\t\t\t\t\t\tLua chon chuc vu: ");
                                int cv = Integer.parseInt(sc.nextLine());

                                if (cv == 1) {
                                        double bonus;
                                        do {
                                                System.out.print("\t\t\t\t\t\tLuong thuong trach nhiem: ");
                                                bonus = Double.parseDouble(sc.nextLine());
                                                if (bonus < 0) {
                                                        System.out.println("Ban da nhap sai! Moi ban nhap lai.");
                                                } else {
                                                        break;
                                                }
                                        } while (true);
                                        NhanVien emp = new TruongPhong(bonus, id, name, salary);
                                        list.add(emp);
                                        break;
                                } else if (cv == 3) {
                                        double doanhSo;
                                        double hueHong;
                                        do {
                                                System.out.print("\t\t\t\t\t\tThuong doanh so: ");
                                                doanhSo = Double.parseDouble(sc.nextLine());
                                                if (doanhSo < 0) {
                                                        System.out.println("Ban vua nhap sai! Moi ban nhap lai.");
                                                } else {
                                                        break;
                                                }
                                        } while (true);

                                        do {
                                                System.out.print("\t\t\t\t\t\tThuong hue hong: ");
                                                hueHong = Double.parseDouble(sc.nextLine());
                                                if (hueHong < 0) {
                                                        System.out.println("Ban vua nhap sai! Moi ban nhap lai");
                                                } else {
                                                        break;
                                                }
                                        } while (true);

                                        NhanVien emp = new TiepThi(doanhSo, hueHong, id, name, salary);
                                        list.add(emp);
                                        break;
                                } else if (cv == 2) {
                                        NhanVien emp = new NhanVien(id, name, salary, "nhanvien");
                                        list.add(emp);
                                        break;
                                } else {
                                        System.out.println("Ban vua nhap sai! Moi ban nhap lai");
                                }
                        } catch (Exception e) {
                                System.out.println("Ban vua nhap sai! Moi ban nhap lai.");
                        }
                } while (true);
        }

        private static void addList() {
                do {
                        try {
                                System.out.print("\t\t\t\t\t   Moi ban nhap vao so luong danh sach: ");
                                int n = Integer.parseInt(sc.nextLine());
                                if (n <= 0) {
                                        System.out.println("Ban vua nhap sai! Moi ban nhap lai.");
                                } else {
                                        for (int i = 0; i < n; i++) {
                                                nhap();
                                        }
                                        break;
                                }

                        } catch (Exception e) {
                                System.out.println("Ban vua nhap sai! Moi ban nhap lai.");
                        }
                } while (true);

        }

        private static void list() {
                System.out.println("\n\t\t\t\t\t---------------------------------------------");
                System.out.println("\n\t\t\t\t\t   Chuc nang 1: Nhap nhan vien vao danh sach\n\n\n");
                do {
                        if (list.isEmpty()) {
                                addList();
                                break;
                        } else {
                                do {
                                        try {
                                                System.out.println("\t\t\t\t\t\tThem nhan vien vao danh sach");
                                                System.out.println("\t\t\t\t\t\t1. Them mot nhan vien vao danh sach");
                                                System.out.println("\t\t\t\t\t\t2. Them nhieu nhan vien vao danh sach");
                                                System.out.print("\t\t\t\t\t\tLua chon: ");
                                                int lc = Integer.parseInt(sc.nextLine());
                                                System.out.println("\n\n\n");
                                                if (lc == 1) {
                                                        nhap();
                                                        break;
                                                } else if (lc == 2) {
                                                        addList();
                                                        break;
                                                } else {
                                                        System.out.println("Ban vua nhap sai! Moi ban nhap lai.");
                                                }
                                        } catch (Exception e) {
                                                System.out.println("Ban vua nhap sai! Moi ban nhap lai");
                                        }
                                } while (true);
                                break;
                        }
                } while (true);

        }

        private static void xuat() {
                System.out.println("\t\t\t\t\t---------------------------------------------");
                System.out.println("\t\t\t\t\t   Chuc nang 2: Sinh vien hien co trong danh sach\n\n\n");
                for (NhanVien x : list) {
                        if (x.getPosition().equalsIgnoreCase("truongphong")) {
                                x.xuat();
                        }
                }
                for (NhanVien x : list) {
                        if (x.getPosition().equalsIgnoreCase("nhanvien")) {
                                x.xuat();
                        }
                }
                for (NhanVien x : list) {
                        if (x.getPosition().equalsIgnoreCase("tiepthi")) {
                                x.xuat();
                        }
                }
        }

        private static String inpIdCheck() {
                String id;
                do {
                        System.out.print("\t\t\t\t\t\tMa so nhan vien: ");
                        id = sc.nextLine();
                        if (id == "") {
                                System.out.println("Vui long nhap lai");
                        } else {
                                if (set.contains(id)) {
                                        System.out.println("Ma nhan vien trung! Vui long nhap lai");
                                } else {
                                        set.add(id);
                                        break;
                                }
                        }
                } while (true);
                return id;
        }

        private static String inpId() {
                String id;
                do {
                        System.out.print("\t\t\t\t\t\tMa so nhan vien: ");
                        id = sc.nextLine();
                        if (id == "") {
                                System.out.println("Vui long nhap lai");
                        } else {
                                break;
                        }
                } while (true);
                return id;
        }

        private static double inpSalary() {
                double salary;
                do {
                        try {
                                System.out.print("\t\t\t\t\t\tLuong: ");
                                salary = Double.parseDouble(sc.nextLine());
                                if (salary < 0) {
                                        System.out.println("Ban vua nhap sai! Vui long nhap lai");
                                } else {
                                        break;
                                }
                        } catch (Exception e) {
                                System.out.println("Ban vua nhap sai! Moi ban nhap lai");
                        }
                } while (true);
                return salary;
        }

        private static void searchByID() {
                if (list.isEmpty()) {
                        System.out.println("Danh sach hien tai trong");
                        return;
                }
                System.out.println("\n\t\t\t\t\t---------------------------------------------");
                System.out.println("\n\t\t\t\t\t   Chuc nang 3: Tim va hien thi nhan vien theo MSNV\n\n\n");
                String id = inpId();
                for (NhanVien x : list) {
                        if (x.getMaNV().equalsIgnoreCase(id)) {
                                x.xuat();
                                return;
                        }
                }
                System.out.printf("Nhan vien %s khong co trong danh sach", id);
        }

        private static void exportForRemove() {
                for (NhanVien x : list) {
                        x.xuat();
                }
        }

        private static void removeById(String id) {
                if (list.isEmpty()) {
                        System.out.println("Danh sach hien tai trong");
                        return;
                }
                System.out.println("\n\t\t\t\t\t---------------------------------------------");
                System.out.println("\n\t\t\t\t\t   Chuc nang 4: Xoa nhan vien theo MSNV\n\n\n");
                for (NhanVien x : list) {
                        if (x.getMaNV().equalsIgnoreCase(id)) {
                                list.remove(x);
                                set.remove(x.getMaNV());
                                System.out.println("\t\t\t\t\t\tXoa thanh cong nhan vien");
                                exportForRemove();
                                return;
                        }
                }
                System.out.printf("Nhan vien %s khong co trong danh sach", id);
        }

        private static void updateById() {
                if (list.isEmpty()) {
                        System.out.println("Danh sach hien tai trong");
                        return;
                }
                System.out.println("\n\t\t\t\t\t---------------------------------------------");
                System.out.println("\n\t\t\t\t\t  Chuc nang 5: Cap nhat thong tin nhan vien theo MSNV\n\n\n");
                String id = inpId();
                for (NhanVien x : list) {
                        if (x.getMaNV().equalsIgnoreCase(id)) {
                                String update = x.getMaNV();
                                removeByIdForUpdate(update);
                                nhap();
                                System.out.println("\t\t\t\t\tCap nhat thanh cong");
                                return;
                        }
                }
                System.out.printf("Nhan vien %s khong co trong danh sach", id);
        }

        private static void searchByRangeSalary() {
                if (list.isEmpty()) {
                        System.out.println("Danh sach hien tai trong");
                        return;
                }
                System.out.println("\n\t\t\t\t\t---------------------------------------------");
                System.out.println("\n\t\t\t\t\t  Chuc nang 6: Tim kiem nhan vien theo pham vi luong\n\n\n");
                double begin, end;
                do {
                        try {
                                System.out.println("\n\t\t\t\t\t   Tim nhan vien theo khoang luong");

                                do {
                                        System.out.print("\t\t\t\t\t\tLuong bat dau: ");
                                        begin = Double.parseDouble(sc.nextLine());
                                        if (begin < 0) {
                                                System.out.println("Ban vua nhap sai! Moi ban nhap lai");
                                        } else {
                                                break;
                                        }
                                } while (true);
                                do {
                                        System.out.print("\t\t\t\t\t\tLuong ket dau: ");
                                        end = Double.parseDouble(sc.nextLine());
                                        if (end < 0 || end < begin) {
                                                System.out.println("Ban vua nhap sai! Moi ban nhap lai.");
                                        } else {
                                                break;
                                        }
                                } while (true);

                                for (NhanVien x : list) {
                                        if (x.getLuong() >= begin && x.getLuong() <= end) {
                                                x.xuat();
                                        }
                                }
                                break;
                        } catch (Exception e) {
                                System.out.println("Ban vua nhap sai! Moi ban nhap lai");
                        }
                } while (true);
                System.out.printf("Khong co nhan vien co muc luong tu %.0f den %.0f", begin, end);

        }

        private static void sortByName() {
                if (list.isEmpty()) {
                        System.out.println("Danh sach hien tai trong");
                        return;
                }
                System.out.println("\n\t\t\t\t\t---------------------------------------------");
                System.out.println("\n\t\t\t\t\t   Chuc nang 7: Sap xep nhan vien theo ho ten nhan vien\n\n\n");
                do {
                        try {
                                System.out.println("\t\t\t\t\t\t1. Sap xep theo ten tang dan");
                                System.out.println("\t\t\t\t\t\t2. Sap xep theo ten giam dan");
                                System.out.print("\t\t\t\t\t\tMoi ban nhap lua chon: ");
                                int lc = Integer.parseInt(sc.nextLine());
                                if (lc == 1) {
                                        Collections.sort(list, (a, b) -> a.getFirstName().compareTo(b.getFirstName()));
                                        xuat(); 
                                        break;
                                } else if (lc == 2) {
                                        Collections.sort(list, (a, b) -> b.getFirstName().compareTo(a.getFirstName()));
                                        xuat();
                                        break;
                                } else {
                                        System.out.println("Ban vua nhap sai! moi ban nhap lai.");
                                }
                        } catch (Exception e) {
                                System.out.println("Ban vua nhap sai! Moi ban nhap lai");
                        }

                } while (true);
        }

        private static void sortByIncome() {
                if (list.isEmpty()) {
                        System.out.println("Danh sach hien tai trong");
                        return;
                }
                System.out.println("\n\t\t\t\t\t---------------------------------------------");
                System.out.println("\n\t\t\t\t\t   Chuc nang 8: Sap xep nhan vien theo thu nhap\n\n\n");
                do {
                        try {
                                System.out.println("\t\t\t\t\t\t1. Sap xep tang dan");
                                System.out.println("\t\t\t\t\t\t2. Sap xep giam dan");
                                System.out.print("\t\t\t\t\t\tMoi ban nhap lua chon");
                                int lc = Integer.parseInt(sc.nextLine());
                                if (lc == 1) {
                                        Collections.sort(list, new Comparator<NhanVien>() {
                                                @Override
                                                public int compare(NhanVien o1, NhanVien o2) {
                                                        if (o1.getThuNhap() < o2.getThuNhap()) {
                                                                return -1;
                                                        } else {
                                                                return 1;
                                                        }
                                                }
                                        });
                                        xuat();
                                        break;
                                } else if (lc == 2) {
                                        Collections.sort(list, new Comparator<NhanVien>() {
                                                @Override
                                                public int compare(NhanVien o1, NhanVien o2) {
                                                        if (o1.getThuNhap() < o2.getThuNhap()) {
                                                                return 1;
                                                        } else {
                                                                return -1;
                                                        }
                                                }
                                        });
                                        xuat();
                                        break;
                                } else {
                                        System.out.println("Ban vua nhap sai! moi ban nhap lai.");
                                }
                        } catch (Exception e) {
                                System.out.println("Ban vua nhap sai! Moi ban nhap lai.");
                        }
                } while (true);
        }

        private static void Top5ByIncome() {
                if (list.isEmpty()) {
                        System.out.println("Danh sach hien tai trong");
                        return;
                }
                System.out.println("\n\t\t\t\t\t---------------------------------------------");
                System.out.println("\n\t\t\t\t\t   Chuc nang 9: Hien thi 5 nhan vien co thu nhap cao nhat trong cong ty\n\n\n");
                Collections.sort(list, new Comparator<NhanVien>() {
                        @Override
                        public int compare(NhanVien o1, NhanVien o2) {
                                if (o1.getLuong() < o2.getLuong()) {
                                        return 1;
                                } else {
                                        return -1;
                                }
                        }
                });
                int cnt = 0;
                for (NhanVien x : list) {
                        if (cnt == 4) {
                                break;
                        }
                        System.out.println(cnt + 1);
                        x.xuat();
                        ++cnt;
                }
        }

        private static void removeByIdForUpdate(String id) {
                for (NhanVien x : list) {
                        if (x.getMaNV().equalsIgnoreCase(id)) {
                                list.remove(x);
                                set.remove(x.getMaNV());
                                x.xuat();
                                return;
                        }
                }
                System.out.printf("Nhan vien %s khong co trong danh sach", id);
        }

        private static void DivisionByPosition() {
                if (list.isEmpty()) {
                        System.out.println("Danh sach hien tai trong");
                        return;
                }
                System.out.println("\t\t\t\t\tChuc nang 10: Hien thi theo nhan vien theo chuc vu");
                String position = "";
                do {
                        try {
                                do {
                                        System.out.println("\t\t\t\t\tLua chon chuc vu");
                                        System.out.println("\t\t\t\t\t1. Truong phong");
                                        System.out.println("\t\t\t\t\t2. Nhan vien hanh chinh");
                                        System.out.println("\t\t\t\t\t3. Nhan vien tiep thi");
                                        System.out.print("\t\t\t\t\tLua chon: ");
                                        int lc = Integer.parseInt(sc.nextLine());
                                        if (lc == 1) {
                                                position = "truongphong";
                                                break;
                                        } else if (lc == 2) {
                                                position = "nhanvien";
                                                break;
                                        } else if (lc == 3) {
                                                position = "tiepthi";
                                                break;
                                        } else {
                                                System.out.println("Ban vua nhap sai! Moi ban nhap lai");
                                        }
                                } while (true);

                                for (NhanVien x : list) {
                                        if (x.getPosition().equalsIgnoreCase(position)) {
                                                x.xuat();
                                        }
                                }
                        } catch (Exception e) {
                                System.out.println("Ban vua nhap sai! Moi ban nhap lai");
                        }
                        break;
                } while (true);
        }
}
