package com.mouse.rtw.demo;

import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.assertj.core.api.Assertions.assertThat;

class SorterTest {

    @Test
    void should_be_able_to_sort_correctly() {
        Comparator<String> sorter = new Sorter();

        assertThat(sorter.compare("12", "12")).isEqualTo(0);
        assertThat(sorter.compare("12", "13")).isEqualTo(1);
        assertThat(sorter.compare("5", "51")).isEqualTo(-1);
        assertThat(sorter.compare("5", "56")).isEqualTo(1);
    }
}