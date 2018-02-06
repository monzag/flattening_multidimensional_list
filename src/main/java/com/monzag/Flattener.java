package com.monzag;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Flattener {

    public LinkedList<Object> items1D = new LinkedList<>();

    public void flatteningMultiDList(List<Object> items) {
        for (Object item : items) {
            if (item instanceof List) {
                flatteningMultiDList((List) item);

            } else if (item.getClass().isArray()) {
                List<Object> listFromArray = Arrays.stream((Object[]) item).collect(Collectors.toList());
                flatteningMultiDList(listFromArray);

            } else {
                items1D.add(item);
            }
        }
    }
}
