package ru.voothi.lesson6.phw;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        InputStream in;
        OutputStream out;

        try {
            FileInputStream fsi1 = new FileInputStream("TextFile1.txt");
            int b;
            while ((b = fsi1.read()) != -1) {
                System.out.print((char) b);
            }
            System.out.println(b);
            fsi1.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
