package ru.geekbrains.java1.dz.dz6;

public class Main {

    public static void main(String[] args) {

        Cat cat1 = new Cat(200, 0, 2);
        Cat cat2 = new Cat(300, 0, 3);
        Dog dog = new Dog(500, 10, 0.5);

        cat1.runTry(300);
        cat2.swimTry(10);
        cat1.jumpTry(1);
        dog.runTry(600);
        dog.swimTry(5);
        dog.jumpTry(1);
    }
}
