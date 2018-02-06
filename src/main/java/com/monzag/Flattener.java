package com.monzag;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Flattener {

    public LinkedList<Object> flatteningMultiDList(List<Object> items, LinkedList<Object> items1D) {
        for (Object item : items) {
            if (item instanceof List) {
                flatteningMultiDList((List) item, items1D);

            } else if (item.getClass().isArray()) {
                List<Object> listFromArray = Arrays.stream((Object[]) item).collect(Collectors.toList());
                flatteningMultiDList(listFromArray, items1D);

            } else {
                items1D.add(item);
            }
        }
        return items1D;
    }
}
