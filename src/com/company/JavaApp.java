package com.company;
import java.util.Scanner;

public class JavaApp {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println(calculate(2, 2, 2, 2));
        System.out.println(task10and20(5, 6));
        isPositiveOrNegative(-30);
        System.out.println(isNegative(5));
        greetings("Дмитрий");
        System.out.println(isLeapYear(2021));

    }

    public static float calculate(float a, float b, float c, float d) {
        return a * (b + c/d);
    }

    public static boolean task10and20(int x1, int x2) {
        int sum = x1 + x2;
        if (sum >= 10) {
            if (sum <= 20) {
                return true;
            }
        }
        return false;
    }

    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }
    }

    public static boolean isNegative(int x) {
        if (x < 0) return true;
        return false;
    }

    public static void greetings(String name) {
        System.out.println("Привет, " + name + "!");
    }

    public static String isLeapYear(int x) {
        if (x%4 == 0) {
            if (x%100 != 0) {
                return "Високосный";
            } else if (x%400 == 0) {
                return "Високосный";
            }
        }
        return "Не високосный";
    }
}
