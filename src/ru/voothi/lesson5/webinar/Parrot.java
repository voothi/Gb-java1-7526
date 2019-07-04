package ru.geekbrains.lesson_e.online.zoo;

public class Parrot extends Bird {
    public Parrot(int age, String color, String name, int height) {
        super(age, color, name, height);
    }

    @Override
    public void voice() {
        System.out.println(name + " wanna cracker");
    }

    public void speak() {
        System.out.println(name + ": i love people!");
    }
}
