package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ListSorterTest {
    private List<Integer> list;

    @Test
    public void sort() {
        List<Integer> list = new ArrayList();
        list.add(3);
        list.add(2);
        list.add(6);
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(7);

        List<Integer> expected = new ArrayList();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        expected.add(7);


        ListSorter sorter = new ListSorter(list);
        List<Integer> sorted = sorter.sort();

        Assertions.assertEquals(expected, sorted);
    }
}