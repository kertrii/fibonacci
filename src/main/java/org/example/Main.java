package org.example;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        long iterative = FibonacciIterative.fibonacci(a);
        System.out.println("Ітераційна реалізація обчислення числа Фібоначчі (" + a + ") = " + iterative);


        int b = 6;
        long recursive = FibonacciRecursive.fibonacci(b);
        System.out.println("Рекурсивна реалізація обчислення числа Фібоначчі (" + b + ") = " + recursive);
        System.out.println();

        int c = 10;
        long dp = FibonacciDP.fibonacci(c);
        System.out.println("Реалізація обчислення числа Фібоначчі за принципом динамічного програмування (" + c + ") = " + dp);
        System.out.println();
    }
}