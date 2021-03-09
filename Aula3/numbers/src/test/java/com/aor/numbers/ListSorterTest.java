package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ListSorterTest {
    private List<Integer> list;
    private List<Integer> expected;

    @BeforeEach
    public void createLists(){
        list = List.of(3,2,6,1,4,5,7);

        expected = List.of(1,2,3,4,5,6,7);
    }

    @Test
    public void sort() {
        ListSorter sorter = new ListSorter(list);
        List<Integer> sorted = sorter.sort();

        Assertions.assertEquals(expected, sorted);
    }

    @Test
    public void confirmBugReport8726(){
        ListSorter sorter=new ListSorter(List.of(1,2,4,2));
        Assertions.assertEquals(List.of(1,2,2,4), sorter.sort());
    }
}
