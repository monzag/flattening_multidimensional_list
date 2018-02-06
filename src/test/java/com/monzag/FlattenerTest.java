package com.monzag;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class FlattenerTest {

    private Flattener flattener;
    private LinkedList<Object> items;

    @BeforeEach
    void setup() {
        flattener = new Flattener();
        items = new LinkedList<>();
    }

    @Test
    void testConstructor() {
        Flattener flattener = new Flattener();
    }

}