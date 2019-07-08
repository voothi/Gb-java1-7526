package ru.geekbrains.lesson_e.online.zoo;

import ru.geekbrains.lesson_e.online.Animal;

public class Bird extends Animal {

    protected int flyHeight;

    public Bird(int age, String color, String name) {
        super(age, color, name);
        flyHeight = 0;
    }

    public Bird(int age, String color, String name, int flyHeight) {
        super(age, color, name);
        this.flyHeight = flyHeight;
    }

    @Override
    public void voice() {
        System.out.println(name + " tweets");
    }

}
