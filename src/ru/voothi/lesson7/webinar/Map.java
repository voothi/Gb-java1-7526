package ru.voothi.lesson7.webinar;

import javax.swing.*;
import java.awt.*;

public class Map extends JPanel {
    public static final int GM_HVA = 0;
    public static final int GM_HVH = 1;

    /*
1. Полностью разобраться с кодом
(попробовать полностью самостоятельно переписать одно из окон)

2. Составить список вопросов и приложить в виде комментария к домашней работе

3. * Рачертить панель Map на поле для игры, согласно fieldSize

*/

    Map() {
        setBackground(Color.BLACK);
    }

    void startNewGame(int mode, int fieldSizeX, int filedSizeY, int winLength) {
        System.out.println("mod" + mode +
                            "\nfsX" + fieldSizeX +
                            "\n fsY" + filedSizeY +
                            "\n wLn" + winLength);
    }
}
