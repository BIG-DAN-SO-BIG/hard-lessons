package com.github.bigdansobig.hardlessons.lesson3;

public class Main {

    // Задание от 03.05.2020:
    // Написать консольное приложение, в котором
    // есть класс MathOperations, с основными
    // математическими методами и константами.
    //
    // Пример работы с консолью:
    // Scanner scanner = new Scanner(System.in);
    // String s = scanner.nextLine();

    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();

        double a = 2; double b = 4;
        System.out.println("Результат умножения " + a + " и " + b + " равен: " + mathOperations.multiplicated(a,b));
        System.out.println("Результат сложения " + a + " и " + b + " равен: " + mathOperations.addition(a,b));
        System.out.println("Результат вычитания " + b + " из " + a + " равен: " + mathOperations.substraction(a,b));
        System.out.println("Результат деления " + a + " на " + b + " равен: " + mathOperations.division(a,b));
        System.out.println("Результат возведения числа " + a + " в степень " + b + " равен: " + mathOperations.exponentiation(a,b));
        System.out.println("Показываю число Пи: " + mathOperations.pi);
        System.out.println("Показываю число экспоненты: " + mathOperations.exp);
    }
}

class MathOperations {

    double pi = 3.14;
    double exp = 2.7;

    double multiplicated(double a, double b) {
        double result = a;
        for (int i=1;i<b;i++){
            result = addition(result,a);
        }
        return result;
    }
    double addition(double a, double b) {
        return a+b;
    }
    double substraction(double a, double b) {
        return a-b;
    }
    double division(double a, double b) {
        return a/b;
    }
    double exponentiation(double a, double b) {
        double result = a;
        for (int i=1; i<b; i++){
            result = multiplicated(result,a);
        }
        return result;
    }
}

// out:
// Результат умножения 2.0 и 4.0 равен: 8.0
// Результат сложения 2.0 и 4.0 равен: 6.0
// Результат вычитания 4.0 из 2.0 равен: -2.0
// Результат деления 2.0 на 4.0 равен: 0.5
// Результат возведения числа 2.0 в степень 4.0 равен: 16.0
// Показываю число Пи: 3.14
// Показываю число экспоненты: 2.7