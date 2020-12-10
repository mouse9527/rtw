package com.mouse.rtw.demo;

import java.util.Comparator;

public class Sorter implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return Long.valueOf(o2 + o1).compareTo(Long.valueOf(o1 + o2));
    }
}
