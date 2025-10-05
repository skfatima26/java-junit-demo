package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testAdd() {
        Main m = new Main();
        assertEquals(5, m.add(2, 3));
    }
}
