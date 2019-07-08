package ru.voothi.lesson6.phw;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        InputStream in;
        OutputStream out;

        try {
            FileInputStream fsi1 = new FileInputStream("TextFile1.txt");
            int b = fsi1.read();
            System.out.println(b);
            fsi1.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
