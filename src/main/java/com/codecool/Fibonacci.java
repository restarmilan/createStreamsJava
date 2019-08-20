package com.codecool;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class Fibonacci implements Supplier<Integer> {
    Stream<Integer> generate(int series) {
        return Stream.iterate(new int[]{0, 1}, i -> new int[]{i[1], i[0] + i[1]})
                .limit(series)
                .map(i -> i[0]);
    }

    @Override
    public Integer get() {
        return 0;
    }
}
