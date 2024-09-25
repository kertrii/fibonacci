package org.example;

public class FibonacciIterative {
    public static int fibonacci(int a) {
        if (a <= 1) {
            return a;
        }
        int n = 0, m = 1, sum;
        for (int i = 2; i <= a; i++) {
            sum = n + m;
            n = m;
            m = sum;
        }
        return m;
    }
    // Просторова складність - O(n)
    // Часова складність - O(1)
    // діаграма класів
}

