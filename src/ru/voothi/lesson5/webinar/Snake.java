package ru.geekbrains.lesson_e.online.zoo;

import ru.geekbrains.lesson_e.online.Animal;

public class Snake extends Animal {
    public Snake(int age, String color, String name) {
        super(age, color, name);
    }

    @Override
    public void voice() {
        System.out.println(name + " shshshhhshh");
    }

    @Override
    public void move() {
        System.out.println(name + " crawls");
    }
}
