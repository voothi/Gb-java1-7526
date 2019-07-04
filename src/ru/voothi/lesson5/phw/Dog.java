package ru.voothi.lesson5.phw;

public class Dog extends Animal {

    protected int swimLength;

    public Dog(int length, double hight) {
        super(length, hight);
        swimLength = 0;
    }

    public Dog(int length, double hight, int swimLength) {
        super(length, hight);
        this.swimLength = swimLength;
    }
}
