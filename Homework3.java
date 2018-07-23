package ru.geekbrains.java1.dz.dz3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework3 {

    public static void main(String[] args) {
        wordGuess();
    }

//    1. Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки
// угадать это число. При каждой попытке компьютер должен сообщить больше ли указанное пользователем число
// чем загаданное, или меньше. После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»
// (1 – повторить, 0 – нет).
//
//    2 * Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
// "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
// "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
//
//    При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
//    сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь. Если слово не угадано,
// компьютер показывает буквы которые стоят на своих местах.
//            apple – загаданное
//    apricot - ответ игрока
//    ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
//    Для сравнения двух слов посимвольно, можно пользоваться:
//    String str = "apple";
//str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
//    Играем до тех пор, пока игрок не отгадает слово
//    Используем только маленькие буквы

    public static void wordGuess() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random rand = new Random();
        int x = rand.nextInt(words.length);
        String wordComputer = words[x];
        System.out.println(wordComputer);
        System.out.println("Компьютер загадал одно из слов из списка ниже. Угадайте слово и введите его в конcоли:");
        System.out.println(Arrays.toString(words));
        boolean checkIfSame = false;
        boolean mistake = false;
        do {
            Scanner scan = new Scanner(System.in);
            String wordUser = scan.next();
            checkIfSame = new String(wordComputer).equals(wordUser);
            if (checkIfSame) {
                System.out.println("Вы угадали!");
            } else {
        System.out.println("Вы не угадали. Попробуйте еще раз. Общие буквы:");
        for (int i = 0; i < Math.min(wordComputer.length(), wordUser.length()); i++) {
        if (wordComputer.charAt(i) == wordUser.charAt(i)) {
        System.out.print(wordComputer.charAt(i));
        mistake = false;
        } else {
        if (mistake) {
        } else {
        System.out.print("###############");
        mistake = true;}
        }
        }
        if (wordComputer.length() > wordUser.length() && !mistake) {
            System.out.print("###############");
        }
        System.out.println();

        }

        } while (!checkIfSame);
        }
        }



