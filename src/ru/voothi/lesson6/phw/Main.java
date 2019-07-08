package ru.voothi.lesson6.phw;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str = "";

        try {
            FileInputStream fis1 = new FileInputStream("TextFile2.txt");
            FileOutputStream fos1 = new FileOutputStream("TextFile1.txt", true);
            PrintStream ps1 = new PrintStream(fos1);
            Scanner scanner1 = new Scanner(fis1);

            while (scanner1.hasNext()) {
                str += scanner1.nextLine();
            }

            ps1.println(str);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
