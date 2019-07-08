package ru.geekbrains.lesson_e.online;

public abstract class Animal extends Object {
    public final int currentYear = 2019;
    protected String name;
    protected int age;
    protected String color;

    public Animal(int age, String color, String name) {
        this.age = age;
        this.name = name;
        this.color = color;
    }

    public final String getName() {
        return name;
    }

    protected final void breathe() {

    }

    protected void move() {
        System.out.println(name + " walks on paws");
    }

    public abstract void voice();
}
