package ru.voothi.lesson7.phw;

import javax.swing.*;

public class GameWindow extends JFrame {

    private static final int WIN_WIDTH = 507;
    private static final int WIN_HEIGHT = 555;
    private static final int WIN_POSX = 650;
    private static final int WIN_POSY = 250;

    public GameWindow () {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(WIN_WIDTH, WIN_HEIGHT);
        setLocation(WIN_POSX, WIN_POSY);
        setTitle("TicTacToe");
        setResizable(false);

        JButton btnStartGame = new JButton("Start game");
        JButton btnExit = new JButton("Exit game");

        add(btnStartGame);
        add(btnExit);

        setVisible(true);
    }
}
