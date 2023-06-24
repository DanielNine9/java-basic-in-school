/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emhtpc07884_lab6;

import java.util.Scanner;

/**
 *
 * @author huyyd
 */
public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        String name = sc.nextLine();
        String ho = name.substring(0, name.indexOf(" ")).toUpperCase();
        String tenDem = name.substring(name.indexOf(" "), name.lastIndexOf(" "));
        String ten = name.substring(name.lastIndexOf(" ")).toUpperCase();
        System.out.println("Ho ten: "+ ho + tenDem + ten);
    }
}
