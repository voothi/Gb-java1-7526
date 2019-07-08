package ru.geekbrains.lesson_e.online;

import ru.geekbrains.lesson_e.online.zoo.*;
/*
1. Создать классы Собака, Лошадь, Птица и Кот с наследованием от класса Животное.

2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.
В качестве параметра каждому методу передается величина, означающая или длину
препятствия (для бега и плавания), или высоту (для прыжков).

3. У каждого животного есть ограничения на действия
(бег: кот 200 м., собака 500 м., Лошадь 1500 м., Птица 5 м.,;
прыжок: кот 2 м., собака 0.5 м., Лошадь 3 м., Птица 0.2 м. ;
плавание: кот и птица не умеет плавать, собака 10 м., лошадь 100 м.).

4. При попытке животного выполнить одно из этих действий,
оно должно сообщить результат.
(Например, dog1.run(150); -> результат: 'Пёсик пробежал!')

5. * Добавить животным разброс в ограничениях.
То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.

* */
public class Main {
    public static void main(String[] args) {
//        short s = 32000;
//        int i0 = s;
//        int i = 100;
//        System.out.println(i);
//
//        byte b = (byte) i;

        Cat c = new Cat(5, "Black", "Barsik");
        Dog d = new Dog(7, "White", "Bobik");
        Bird b = new Bird(2, "Yellow", "Chijik", 5);
        Parrot p = new Parrot(3, "Rainbow", "Polly", 3);
        Snake s = new Snake(10, "Brown", "Kaa");

        Animal[] zoo = {c, d, b, p, s};

        for (int i = 0; i < zoo.length; i++) {
            if (zoo[i] instanceof Bird) {
                System.out.println("enlarged a cage for " + zoo[i].getName());
            }
            zoo[i].move();
            zoo[i].voice();
            if (zoo[i] instanceof Parrot) {
                Parrot parrot = (Parrot) zoo[i];
                parrot.speak();
//                ((Parrot) zoo[i]).speak();
            }
        }
    }
}
