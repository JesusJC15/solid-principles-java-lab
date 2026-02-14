package com.example.solid.dip;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

public class DIPTest {

    @Test
    void shouldProcessOrder() {
        Database db = new MySQLDatabase();
        OrderProcessor processor = new OrderProcessor(db);

        assertDoesNotThrow(processor::processOrder);
    }
}