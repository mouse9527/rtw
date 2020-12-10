package com.mouse.rtw.demo;

import java.util.Arrays;
import java.util.stream.Collectors;

public class NumberConcat {
    private final int[] numbers;

    public NumberConcat(int[] numbers) {
        this.numbers = numbers;
    }

    public Long max() {
        String number = Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .sorted(new Sorter())
                .collect(Collectors.joining());
        return Long.valueOf(number);
    }
}
