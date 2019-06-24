package ru.voothi.lesson2.phw;

public class Phw {
    public static void main(String[] args) {
        replacingValuesInArray();
    }

    static void replacingValuesInArray() {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 0;
        arr[3] = 0;
        arr[4] = 1;
//        int[] arr = { 1, 1, 0, 0, 1 };
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

//    static ex2() {
//    }
//
//    static ex3() {
//    }
//
//    static ex4() {
//    }
}