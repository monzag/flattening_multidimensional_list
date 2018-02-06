package com.monzag;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
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
        addNumbersAndStringsToItems();
        String expect = "[1, Test, 20.1]";
        String actual = flattener.flatteningMultiDList(items, items1D).toString();
        assertEquals(expect, actual);
    }

    @Test
    void testFlattening2DList() {
        create2DList();
        String expect = "[1, Test, 20.1, 1997, 2015]";
        String actual = flattener.flatteningMultiDList(items, items1D).toString();
        assertEquals(expect, actual);
    }

    private void addNumbersAndStringsToItems() {
        items.add(1);
        items.add("Test");
        items.add(20.1);
    }

    private void create2DList() {
        addNumbersAndStringsToItems();
        Integer[] years = {1997, 2015};
        items.add(years);
    }
    
    private void create3DList() {
        create2DList();

        LinkedList<Object> names = new LinkedList<>();
        names.add("Ala");
        names.add("Janusz");
        items.add(names);

        ArrayList<String> address = new ArrayList<>();
        address.add("London");
        address.add("Warsaw");
        address.add("Berlin");
        names.add(address);
    }
}