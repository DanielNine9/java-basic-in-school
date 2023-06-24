/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author huyyd
 */
public class listStudent {

    private ArrayList<student> list = new ArrayList<>();

    public listStudent(ArrayList<student> list) {
        this.list = list;
    }

    public listStudent() {
        ArrayList<student> list = new ArrayList<>();
    }

    Scanner sc = new Scanner(System.in);

    public void nhap() {
        do {
            try {
                System.out.println("Nhap so luong phan tu vao danh sach: ");
                int n = Integer.parseInt(sc.nextLine());
                if (n < 0) {
                    System.out.println("Ban vua nhap sai! Moi ban nhap lai.");
                } else {
                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhap ho va ten: ");
                        String name = sc.nextLine();
                        student st = new student(name);
                        this.list.add(st);
                    }
                    break;
                }
            } catch (Exception e) {
                System.out.println("Ban vua nhap sai! Moi ban nhap lai.");
            }
        } while (true);

    }

    public void xuat() {
        if (this.list.isEmpty()) {
            System.out.println("Danh sach hien dang rong!");
        }
        for (student x : this.list) {
            System.out.println(x.getName());
        }
    }

    public void xuatRandom() {
        Collections.shuffle(this.list);
        for (student x : this.list) {
            System.out.println(x.getName());
        }
    }

    public void sort() {
        Collections.sort(this.list, (a, b) -> b.getName().compareTo(a.getName()));
        for (student x : this.list) {
            System.out.println(x.getName());
        }
    }

    public void removeByName() {
        System.out.println("Moi ban nhap ten hoc sinh can xoa: ");
        String name = sc.nextLine();
        for (student x : this.list) {
            if (x.getName().equalsIgnoreCase(name)) {

                if (this.list.remove(x)) {
                    System.out.println("Ban da xoa thanh cong !");
                    return;
                }
            }
        }

        System.out.println("Khong tim thay ho ten trong danh sach!");
        return;
    }
}
