package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ListDeduplicatorTest {
    List<Integer> list;
    List<Integer> expected;

    @BeforeEach
    public void createLists(){
        list=List.of(1,2,4,2,5);

        expected = List.of(1,2,4,5);
    }

    @Test
    public void deduplicate() {
        ListDeduplicator deduplicator = new ListDeduplicator(list);
        List<Integer> distinct = deduplicator.deduplicate(new ListSorter(list));

        Assertions.assertEquals(expected, distinct);
    }

    @Test
    public void confirmBugReport8726() {
        ListDeduplicator deduplicator = new ListDeduplicator(list);
        List<Integer> distinct=deduplicator.deduplicate(new StubSorter());
        Assertions.assertEquals(List.of(1,2,4), distinct);
    }

    public class StubSorter implements IListSorter{
        public List<Integer> sort(){
            return List.of(1,2,2,4);
        }
    }
}
