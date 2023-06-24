/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6.Bai1;

import java.util.Scanner;

/**
 *
 * @author huyyd
 */
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho va ten: ");
        String name = sc.nextLine();
        String lastName = name.substring(0,name.indexOf(" ")).toUpperCase();
        String firstName = name.substring(name.lastIndexOf(" ")).toUpperCase();
        String middleName = name.substring(name.indexOf(" "),name.lastIndexOf(" "));
        System.out.println(lastName + middleName + firstName);
    }
}
