package com.monzag;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class FlattenerTest {

    private Flattener flattener;
    private LinkedList<Object> items;
    private LinkedList<Object> items1D;

    @BeforeEach
    void setup() {
        flattener = new Flattener();
        items = new LinkedList<>();
        items1D = new LinkedList<>();

    }

    @Test
    void testConstructor() {
        Flattener flattener = new Flattener();
    }

    @Test
    void testFlattening1DList() {
        items.add(1);
        items.add("Test");
        items.add(20.1);
        String expect = "[1, Test, 20.1]";
        String actual = flattener.flatteningMultiDList(items, items1D).toString();
        assertEquals(expect, actual);
    }
}