package ru.voothi.lesson2.phw;

import java.util.Arrays;

public class Phw {
    public static void main(String[] args) {
//        replacingValuesInArray();
//        fillArrayValues();

//        int[] arrEx3Arg = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
//        ex3(arrEx3Arg);

//        findMinAndMax();

//        ex5();
    }

    static void replacingValuesInArray() {
        int[] arr = {1, 1, 0, 0, 1};
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

    static void fillArrayValues() {
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                arr[i] = 1;
            } else {
                arr[i] = arr[i - 1] + 3;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void ex3(int[] arrEx3Param) {
        for (int i = 0; i < arrEx3Param.length; i++) {
            if (arrEx3Param[i] < 6) {
                arrEx3Param[i] = arrEx3Param[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arrEx3Param));
    }

    static void findMinAndMax() {
        int[] arr = {3, 1, 4, 2};
        System.out.println(Arrays.toString(arr));
        int indexOfMax = 0;
        int indexOfMin = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[indexOfMax]) {
                indexOfMax = i;
            } else if (arr[i] < arr[indexOfMin]) {
                indexOfMin = i;
            }
        }
        System.out.println("Массив элементов: " + Arrays.toString(arr));
        System.out.println("Минимальный элемент: " + arr[indexOfMin] +
                " под индексом " + indexOfMin);
        System.out.println("Максимальный элемент: " + arr[indexOfMax] +
                " под индексом " + indexOfMax);
    }

    static void ex5() {
//        int[] arr0 = {1, 0, 0, 1};
//        int[] arr1 = {0, 1, 1, 0};
//        int[] arr2 = {0, 1, 1, 0};
//        int[] arr3 = {1, 0, 0, 1};

//        System.out.println(Arrays.toString(arr0));
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));
//        System.out.println(Arrays.toString(arr3));

//        int[][] array = new int[2][2];
//        int[][] array1 = {{1,2}, {3,4}};

//        int ni = 4;
//        int nj = 4;
//        int[][] array = new int[][]{
//
//                {0, 0, 0, 0},
//                {0, 0, 0, 0},
//                {0, 0, 0, 0},
//                {0, 0, 0, 0}
//        };
//
//        for (int i = 0; i < ni; i++) {
//            array[i][i] = 1;
//            for (int j = nj - 1; j >= 0; j--) {
//                array[i][j] = 1;
//                break;
//            }
//            System.out.println(Arrays.toString(array[i]));
//        }

    }
}