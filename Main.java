package ru.geekbrains.java1.dz.dz1.Mikhail_Petrov;

public class Main {

    // задача 2 - создаю и иициализирую переменные
    byte varByte = 1;
    short varShort = 1;
    int varInt = 1;
    long varLong = 1L;
    float varFloat = 1.0f;
    double varDouble = 1.00;
    char varChar = 'A';
    boolean varBoolean = true;

    public static void main(String[] args) {
        System.out.println(task3Calculate(2,2,2,2));
        System.out.println(task4Compare(5, 6));
        task5IsPositiveOrNegative(-30);
        System.out.println(task6IsNegative(-5));
        task7PrintName("Миша");
        task8LeapYear(2018);
    }

    // решаю задачу 3: Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода
    public static int task3Calculate(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    // решаю задачу 4: Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false
    public static boolean task4Compare(int x1, int x2) {
        if ((x1 + x2) <=20 && (x1 + x2) >= 10) {
            return true;
        } else {
            return false;
        }
                    }

    // решаю задачу 5: Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
    public static void task5IsPositiveOrNegative(int y) {
        if (y >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
}

    // решаю задачу 6: Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное
    public static boolean task6IsNegative(int z) {
        if (z < 0) {
            return true;
        }
        return false;
    }

    // решаю задачу 7: Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»
    public static void task7PrintName(String Name) {
        System.out.println("Привет, " + Name + "!");
    }

    // решаю задачу 8:  Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static void task8LeapYear(int Year) {
        if (Year % 4 == 0 && (Year % 100 !=0 || Year % 400 == 0)) {
            System.out.println("Введенный год високосный");
        } else {
            System.out.println("Введенный год не високосный");
        }
    }
}
