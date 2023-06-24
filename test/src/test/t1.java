/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.Scanner;

/**
 *
 * @author huyyd
 */
public class t1 {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
//        String regax = "65[A-Z]\\d-((\\d{4})||(\\d{3}\\.\\d{2}))";
                String regax = "\\d";
                if (sc.nextLine().matches(regax)) {
                        System.out.println("bien so xe can tho");
                } else {
                        System.out.println("bien so xe kh phai can tho");
                }

        }
        
        
        public void capNhat(){
                System.out.println("Nhap id cap nhat");
               String id = sc.nextLine();
               for(khachsan x : list ){
                       if(x.getId().equals(id)){
                               x.setId(id);
                       }
               }
                }
}
