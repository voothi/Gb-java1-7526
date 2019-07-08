package ru.voothi.lesson6.phw;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str = "";

       try {
           FileInputStream fis1 = new FileInputStream("TextFile2.txt");
           FileOutputStream fos1 = new FileOutputStream("TextFile1.txt");
           Scanner scanner2 = new Scanner(fis1);
            while (scanner2.hasNext()) {
//                str += scanner2.nextLine();
                fos1 = ;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
