/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package huydqpc07859_lab1;

import java.util.Scanner;

/**
 *
 * @author huyyd
 */
public class Lab2bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 2; i <= 9; i++){
            System.out.println("Bang cua chuong "+ i);
            for(int j = 1; j <= 10; j++){
                System.out.println(i + " * " + j + " = " + (i*j));
            }
            if(i == 9){
                break;
            }
            System.out.println("------------------------");
        }
    }
}
