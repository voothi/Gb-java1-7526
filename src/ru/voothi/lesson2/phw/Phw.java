package ru.voothi.lesson2.phw;

public class Phw {
    public static void main(String[] args) {
//        replacingValuesInArray();
        ex2();
    }

    static void replacingValuesInArray() {
        int[] arr = { 1, 1, 0, 0, 1 };
        for (int i = 0; i < arr.length; i++) {
            System.out.println("До:\n Ключ " + i + " Значение " + arr[i]);
            if (arr[i] == 1) {
                arr[i] = 0;
            } else if (arr[i] == 0) {
                arr[i] = 1;
            }
            System.out.println("После:\n Ключ " + i + " Значение " + arr[i]);
        }
    }

    static void ex2() {
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
//            1 4 7 10 13 16 19 22
            if (i == 0) {
                arr[i] = 1;
            } else {
                arr[i] = arr[i - 1] + 3;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
//
//    static ex3() {
//    }
//
//    static ex4() {
//    }
}