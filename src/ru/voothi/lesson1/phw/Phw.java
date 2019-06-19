package ru.voothi.lesson1.phw;

public class Phw {
    public static void main(String[] args) {
        System.out.println(ex1Method(2,2,4,2));
    }

    public static float ex1Method(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }
}
