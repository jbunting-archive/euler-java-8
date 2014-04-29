package com.potetm;

import com.google.common.math.LongMath;

import java.util.function.LongSupplier;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

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

    public static class FibSupplier implements LongSupplier {
        private long penultimate = 0;
        private long ultimate    = 1;

        @Override
        public long getAsLong() {
            long result = LongMath.checkedAdd(penultimate, ultimate);
            penultimate = ultimate;
            ultimate = result;
            return result;
        }
    }

    public static long problem2() {
        return LongStream
                .generate(new FibSupplier())
                .limit(50) // Don't go too big. Overflow is a real thing.
                .filter(x -> x <= 4_000_000)
                .filter(x -> x % 2 == 0)
                .sum();
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
