package ru.geekbrains.lesson_e.online.zoo;

import ru.geekbrains.lesson_e.online.Animal;

public class Dog extends Animal {
    public Dog(int age, String color, String name) {
        super(age, color, name);
    }

    @Override
    public void voice() {
        System.out.println(name + " barks");
    }

}
