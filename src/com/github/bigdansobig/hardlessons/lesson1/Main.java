package com.github.bigdansobig.hardlessons.lesson1;

public class Main {

    // Задание от 01.05.2020:
    // 1. Написать программу, выводящую в консоль сумму,
    // разницу, результат деления и умножения двух или более чисел.
    // Попробовать написать данную программу используя все
    // целочисленные типы данных.
    // 2. Попробовать сканкатинировать две или более сторки.

    public static void main(String[] args) {
        byte a = 10;
        short b = 15;
        int c = 20;
        long d = 25;
        long e = 30;
        int mnoj = a * b;
        int sum = b + c;
        double del = (double) c / d;
        long raz = d - e;

        String str1 = "кек ";
        String str2 = "лол ";

        System.out.println("умножение: " + a + " * " + b + " = " + mnoj);
        System.out.println("сумма: " + b + " + " + c + " = " + sum);
        System.out.println("деление: " + c + " / " + d + " = " + del);
        System.out.println("разность: " + d + " - " + e + " = " + raz);

        System.out.println(str1 + "омг " + str2);
        System.out.println(str1 + 10 + 10);
        System.out.println(10 + 10 + " " + str1);
        System.out.println(str1 + (10 + 10));
    }
}

// out:
// умножение: 10 * 15 = 150
// сумма: 15 + 20 = 35
// деление: 20 / 25 = 0.8
// разность: 25 - 30 = -5
// кек омг лол
// кек 1010
// 20 кек
// кек 20