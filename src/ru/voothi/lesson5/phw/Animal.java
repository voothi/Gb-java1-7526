package ru.voothi.lesson5.phw;

public class Animal {
    protected int length;
    protected double hight;
    protected int swimLength;

    public Animal() {
    }

    public Animal(int length, double hight) {
        this.length = length;
        this.hight = hight;
    }

    public void run(int lengthParam) {
        length += lengthParam;
    }

    public void swim(int swimLengthParam) {
        swimLength += swimLengthParam;
    }

    public void jump(double hightParam) {
        hight += hightParam;
    }
}
