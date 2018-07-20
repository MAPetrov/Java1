package ru.geekbrains.java1.dz.dz2.Mikhail_Petrov;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        invertArray();
        System.out.println();
        System.out.println();
        fillArray();
        System.out.println();
        System.out.println();
        multiplyArray();
        System.out.println();
        System.out.println();
        diagonalArray();
        System.out.println();
        minmaxArray();
        System.out.println();
        int[] arr_input = {1, 5, 3, 3};
        System.out.println(checkSum(arr_input));
        System.out.println();
        int[] arr2_input = {1, 5, 3, 3,7};
        replaceElements(arr2_input, -2);

    }
    // 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;

    public static void invertArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
            System.out.print(arr[i] + " ");
        }
    }

    // 2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    public static void fillArray() {
        int[] arr2 = new int[8];
        int a = 0;
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = a;
            a += 3;
            System.out.print(arr2[i] + " ");
        }
    }

    // 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

    public static void multiplyArray() {
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] *= 2;
            }
            System.out.print(arr3[i] + " ");
        }
    }

    // 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

    public static void diagonalArray() {
        int[][] table = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    table[i][j] = 1;

                }
                if ((i + j) == 4) {
                    table[i][j] = 1;
                }

            }
        }
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                System.out.print(table[i][j]);
            }
            System.out.println();
        }
    }

    // 5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
    public static void minmaxArray() {
        int[] arr5 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int max = arr5[0];
        int min = arr5[0];
        for (int i = 0; i < arr5.length; i++) {
            if (arr5[i] > max) {
                max = arr5[i];
            }
            if (arr5[i] < min) {
                min = arr5[i];
            }
        }
        System.out.print("Максимальный элемент = " + max + "; минимальный элемент = " + min);
    }

    // 6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true если в массиве есть место,
    // в котором сумма левой и правой части массива равны.
    // Примеры: checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance ([2, 1, 1, 2, 1]) → false, checkBalance ([10, || 10])
    // → true, граница показана символами ||, эти символы в массив не входят.

    public static boolean checkSum(int[] arr6) {
        int Left = 0;
        int Right = 0;
        int Current = 0;
        boolean check = false;
        for (int i = 0; i < arr6.length; i++) {
            Left += arr6[i];
            Current = i + 1;
            Right = 0;
            for (int x = Current; x < arr6.length; x++) {
                Right += arr6[x];
            }
            System.out.println("left =" + Left + "right =" + Right);

            if (Left == Right) {
                check = true;
            }
        }

        return check;
    }
    // 7. **** Написать метод, которому на вход подается одномерный массив и число n
    // (может быть положительным, или отрицательным), при этом метод должен сместить все элементымассива на n позиций.
    // Для усложнения задачи нельзя пользоваться вспомогательными массивами.

    public static void replaceElements(int[] arr7, int a) {
        int move = 0;
        if (a > 0) {
            move = a;
        } else {
            move = arr7.length + a;
        }
            while (move != 0) {
                int pos0 = arr7[0];
                for (int i = 0; i < arr7.length -1; i++) {
                    arr7[i] = arr7[i + 1];
                }
                arr7[arr7.length -1] = pos0;
                move -= 1;
            }
            for (int i = 0; i < arr7.length; i++) {
            System.out.print(arr7[i]);
        }
    }
}


