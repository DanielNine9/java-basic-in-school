/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author huyyd
 */
public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        
  
        System.out.println("Nhap so luong phan tu trong mang: ");
        
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            System.out.println("arr["+ i+"]");
            int a = Integer.parseInt(sc.nextLine());
            arr.add(a);
        }
        System.out.println("Mang truoc khi sap xep");
        for(int i : arr){
            System.out.print(i + " ");
        };
       Collections.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 < o2) return 1;
                else return -1;
            }
           
       });
        System.out.println("\nMang sau khi sap xep");
        for(int i : arr){
            System.out.print(i + " ");
        };
        
        for(int i : arr){
            System.out.print("\nGia tri lon nhat trong mang la: ");
            System.out.println(i);
            break;
        }
        System.out.print("Gia tri chan trong mang la: ");
        for(int i : arr){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }
      
        
    }
}
