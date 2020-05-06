package com.github.bigdansobig.hardlessons.lesson2;

public class Main {

    // Задание от 02.05.2020:
    // Написать приложение, которое выводит в консоль
    // последовательность чисел фибаначи или чило фибаначи
    // под конкретным номером.
    // Более сложный вариант:
    // Сделать чтобы пользователь сам вводил номер
    // требуемого числа фибаначи
    // (или количество итераций цикла, для второго варианта)

    public static void main(String[] args) {
        Fibon fib1 = new Fibon(7);
        System.out.println("Порядковый номер числа: " + fib1.number);
        System.out.println("Число Фибоначи: " + fib1.f);
    }
}

class Fibon {

    int number;
    int f;

    Fibon(int n){
        this.number = n;
        this.f = setNumber(n);
    }

    private int setNumber(int number){
        int f1=0;   int f2=1; int fn=0;
        switch (number){
            case (0):
                fn=f1;
                break;
            case (1):
                fn=f2;
                break;
            default:
                for (int i=1; i<number; i++){
                    fn=f1+f2;
                    f1=f2;
                    f2=fn;
                }
                break;
        }
        return fn;
    }
}

// out:
// Порядковый номер числа: 7
// Число Фибоначи: 13