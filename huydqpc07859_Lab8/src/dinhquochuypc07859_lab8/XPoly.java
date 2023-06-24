/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dinhquochuypc07859_lab8;

/**
 *
 * @author huyyd
 */
public class XPoly {

    public static final double sum(double... a) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        return sum;
    }

    public static final double min(double... a) {
        double min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    public static final double max(double... a) {
        double max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    private static String toUpper(String a) {
        return a.substring(0, 1).toUpperCase() + a.substring(1);
    }

    public static String toUpperFirstChat(String a) {
        String words[] = a.split(" ");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            result += toUpper(words[i]) + " ";

        }
        return result.trim();
    }
}
