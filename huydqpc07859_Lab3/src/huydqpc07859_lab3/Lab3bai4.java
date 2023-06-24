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
public class Lab3bai4 {
    static void sort(String[] name, double [] gpa){
    
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap so luong sinh vien: "); int n = Integer.parseInt(sc.nextLine());
        String name[] = new String[n];
        double gpa[] = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Sinh vinh thu "+(i+1)+": ");
            name[i] = sc.nextLine();
            System.out.print("Diem sinh vien thu "+ (i+1)+" ");
            gpa[i] = Double.parseDouble(sc.nextLine());
        }
        
    
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(gpa[i] < gpa[j]){
                    String tmp = name[i];
                    name[i] = name[j];
                    name[j] = tmp;
                    
                    double tmp1 = gpa[i];
                    gpa[i] = gpa[j];
                    gpa[j] = tmp1;
                } 
            }
        }
           for (int i = 0; i < n; i++) {
            System.out.print(""+name[i] + " diem " + gpa[i]);
            if(gpa[i] < 5) System.out.print(" yeu");
            else if(gpa[i] >= 5 && gpa[i] < 6.5) System.out.print(" trung binh");
            else if(gpa[i] >= 6.5 && gpa[i] < 7.5) System.out.print(" kha");
            else if(gpa[i] >= 7.5 && gpa[i] < 9 ) System.out.print(" gioi");
            else if(gpa[i] >= 9) System.out.print(" Xuat sac");
            System.out.println("");
        }
    }
}
