package ru.voothi.lesson6.phw;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InputStream in;
        OutputStream out;

        try {
            Scanner scanner1 = new Scanner(new FileInputStream("TextFile1.txt"));
            while (scanner1.hasNext()) {
                System.out.println(scanner1.nextLine());
            }
            scanner1.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
