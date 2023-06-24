/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author huyyd
 */
public class Test {

        public static int sum(int a, int b) {
                return a + b;
        }

        public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        Integer st = list.stream()
//                .reduce(0, (acc, el) -> acc + el);
//
//         List<Integer> numbers = Arrays.asList(150, 250, 180, 300, 220);
//        
//        int total = numbers.stream()
//            .filter(num -> num >= 200) // Lọc các số lớn hơn hoặc bằng 200
//            .mapToInt(Integer::intValue) // Chuyển đổi các số thành kiểu int
//            .sum(); // Tính tổng

//        System.out.println(total);
//        String name = "hello world";
//        
//        Arrays.stream(name.split(" ")).map(n -> n.substring(0, 1).toUpperCase() + n.substring(1)).forEach(e -> System.out.println(e + " "));
                String name = "nguyen van a";
                String fullname = Arrays.stream(name.split(" ")).map(e -> e.substring(0, 1).toUpperCase() + e.substring(1))
                        .collect(Collectors.joining(" "));
                System.out.println(fullname);
//        List<Character> list1 = Arrays.asList('h', 'a');
//        list1.stream().map(Character::toUpperCase).forEach(System.out::println);

        }

}
