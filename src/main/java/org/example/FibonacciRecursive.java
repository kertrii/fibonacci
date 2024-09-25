package org.example;

public class FibonacciRecursive {
    public static long fibonacci(int b) {
        if (b <= 1) {
            return b;
        }

        return fibonacci(b - 1) + fibonacci(b - 2);
    }
    // Просторова складність - O(2^n)
    // Часова складність - O(n)
    // діагарма послідовності
}

