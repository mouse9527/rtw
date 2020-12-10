package com.mouse.rtw.demo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NumberConcatTest {

    @Test
    void should_be_able_to_concat_max_number_from_array() {
        NumberConcat concat = new NumberConcat(new int[]{12,32,4,2,5,56,59,23,98,88,9});

        assertThat(concat.max()).isEqualTo(998885956543223212L);
    }
}