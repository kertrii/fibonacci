package org.example;

import java.util.HashMap;
import java.util.Map;

public class FibonacciDP {
    private static Map<Integer, Long> memo = new HashMap<>();

    public static long fibonacci(int c) {
        if (c <= 1) {
            return c;
        }

        if (memo.containsKey(c)) {
            return memo.get(c);
        }

        long fib = fibonacci(c - 1) + fibonacci(c - 2);
        memo.put(c, fib);
        return fib;
    }
    // Просторова складність - O(n)
    // Часова складність - O(n)
    // діаграма станів
}

