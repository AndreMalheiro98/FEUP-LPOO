package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ListAggregatorTest {
    @Test
    public void sum() {
        List<Integer> list=createLists();

        ListAggregator aggregator = new ListAggregator(list);

        int sum = aggregator.sum();

        Assertions.assertEquals(14, sum);
    }

    @Test
    public void max() {
        List<Integer> list=createLists();

        ListAggregator aggregator = new ListAggregator(list);

        int max = aggregator.max();

        Assertions.assertEquals(5, max);
    }

    @Test
    public void min() {
        List<Integer> list=createLists();

        ListAggregator aggregator = new ListAggregator(list);

        int min = aggregator.min();

        Assertions.assertEquals(1, min);
    }

    public List<Integer> createLists(){
        return List.of(1,2,4,2,5);
    }

    @Test
    public void confirmBugReport7263(){
        List<Integer> list=new ArrayList<>();
        list.add(-1);
        list.add(-4);
        list.add(-5);

        ListAggregator listAggregator = new ListAggregator(list);

        int max= listAggregator.max();
        Assertions.assertEquals(-1,max);
    }

    class StubDeduplicator implements IListDeduplicator{
        public List<Integer> deduplicate(IListSorter sorter){
            return List.of(1,2,4,5);
        }
    }
    @Test
    public void confirmBugReport8726() {
        List<Integer> list=List.of(1,2,4,2);

        ListAggregator aggregator = new ListAggregator(list);

        int distinct = aggregator.distinct(new StubDeduplicator());

        Assertions.assertEquals(4, distinct);
    }

    @Test
    public void distinct() {
        List<Integer> list=createLists();

        ListAggregator aggregator = new ListAggregator(list);

        int distinct = aggregator.distinct(new StubDeduplicator());

        Assertions.assertEquals(4, distinct);
    }
}
