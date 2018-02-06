package com.monzag;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlattenerTest {

    private Flattener flattener;

    @BeforeEach
    void setup() {
        flattener = new Flattener();
    }
    
    @Test
    void testConstructor() {
        Flattener flattener = new Flattener();
    }
}