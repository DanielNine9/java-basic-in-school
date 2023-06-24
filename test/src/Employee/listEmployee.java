///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package Employee;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
///**
// *
// * @author huyyd
// */
//public class listEmployee {
//    private static Scanner sc = new Scanner(System.in);
//    private static ArrayList<Employee> list = new ArrayList<>();
//    
//    public static void menu(){
//        boolean loop = true;
//        int lc;
//        while(loop){
//            System.out.println("Menu");
//            System.out.println("1. Nhap");
//            System.out.println("2. Xuat");
//            System.out.println("Nhap lua chon: ");
//            lc = Integer.parseInt(sc.nextLine());
//            switch(lc){
//                case 1: cn1() break;
//                case 2: cn2() break;
//                case 0: {
//                    loop = false;
//                    System.out.println("Chuong trinh ket thuc!");
//                    break;
//                }
//                default:{
//                    System.out.println("Ban vua nhap sai!");
//                }
//            }
//        }
//        
//        private static void cn1(){
//            System.out.println("Nhap ho va ten: ");
//        }
//    }
//}
