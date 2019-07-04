package ru.voothi.lesson5.phw;

public class Horse extends Animal {

    public Horse(int length, double hight) {
        super(length, hight);
        swimLength = 0;
    }

    public Horse(int length, double hight, int swimLength) {
        super(length, hight);
        this.swimLength = swimLength;
    }
}
