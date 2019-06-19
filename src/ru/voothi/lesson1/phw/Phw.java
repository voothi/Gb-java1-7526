package ru.voothi.lesson1.phw;

public class Phw {
    public static void main(String[] args) {
        System.out.println(ex1Method(2, 2, 4, 2));
        System.out.println(ex2Method(10, 2));
        ex3Method(0);
        ex4Method("Ivan");

        ex5MethodIsLeapYear(1900);
        ex5MethodIsLeapYear(2000);
    }

    static float ex1Method(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    static boolean ex2Method(int x, int y) {
        if (x + y >= 10 && x + y <= 20) {
            return true;
        } else {
            return false;
        }
    }

    static void ex3Method(int z) {
        if (z < 0) {
            System.out.println("Вы передали отрицательное число");
        } else {
            System.out.println("Вы передали положительное число");
        }
    }

    static void ex4Method(String firstName) {
        System.out.println("Привет, " + firstName + "!");
    }

    static void ex5MethodIsLeapYear(int year) {
        if ((year % 4 == 0) && year % 100 != 0) {
            System.out.println(year + " год является високосным");
        } else if (year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
}