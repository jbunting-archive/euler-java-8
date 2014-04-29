package com.potetm;

import java.util.stream.IntStream;

public class Euler {
    private static IntStream findMultiples(int of, int limit) {
        return IntStream
                .range(1, limit)
                .filter((i) -> i % of == 0);
    }

    public static long problem1() {
        return IntStream
                .concat(findMultiples(3, 1000),
                        findMultiples(5, 1000))
                .distinct()
                .sum();
    }

    public static long problem2() {
        return Long.MIN_VALUE;
    }

    public static long problem3() {
        return Long.MIN_VALUE;
    }

    public static long problem4() {
        return Long.MIN_VALUE;
    }

    public static long problem5() {
        return Long.MIN_VALUE;
    }

    public static long problem6() {
        return Long.MIN_VALUE;
    }

    public static long problem7() {
        return Long.MIN_VALUE;
    }

    public static long problem8() {
        return Long.MIN_VALUE;
    }

    public static long problem9() {
        return Long.MIN_VALUE;
    }

    public static long problem10() {
        return Long.MIN_VALUE;
    }
}
