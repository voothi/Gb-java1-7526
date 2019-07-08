package ru.voothi.lesson5.phw;

public class Main {
    public static void main(String[] args) {
        Animal cat1 = new Cat(200, 2);
        Animal dog1 = new Dog(500, 0.5, 10);
        ((Dog) dog1).say();
        Animal horse1 = new Horse(1500, 3, 100);
        Animal bird1 = new Bird(5, 0.2);
    }
}
