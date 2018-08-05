package ru.geekbrains.java1.dz.dz6;

//1. Создать классы Собака и Кот с наследованием от класса Животное.
//
//        2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.
// В качестве параметра каждому методу передается величина, означающая или длину препятствия (для бега и плавания),
// или высоту (для прыжков).
//
//        3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; прыжок: кот 2 м.,
// собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).
//
//        4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат в консоль.
// (Например, dog1.run(150); -> результат: run: true)
//
//        5. * Добавить животным разброс в ограничениях.
// То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.

public class Animal {

    int run;
    int swim;
    double jump;
    int _try;

    public Animal(int _run, int _swim, double _jump) {
        run = _run;
        swim = _swim;
        jump = _jump;
    }

    public void runTry (int _try) {
        if (_try <= run) {
            System.out.println("результат run: true");
        } else {
            System.out.println("результат run: false");
        }
    }

    public void swimTry (int _try) {
        if (_try <= swim) {
            System.out.println("результат swim: true");
        } else {
            System.out.println("результат swim: false");
        }
    }

    public void jumpTry (int _try) {
        if (_try <= jump) {
            System.out.println("результат jump: true");
        } else {
            System.out.println("результат jump: false");
        }
    }
}
