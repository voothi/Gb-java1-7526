package ru.voothi.lesson1.phw;

public class Phw {
    public static void main(String[] args) {
        System.out.println(ex1Method(2,2,4,2));
        System.out.println(ex2Method(10,2));
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
//        return x;
    }
}
