package com.example.solid.dip;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class DIPTest {

    private static class FakeDatabase implements Database {
        private boolean saved;

        @Override
        public void saveOrder() {
            saved = true;
        }
    }

    @Test
    void shouldProcessOrder() {
        Database db = new MySQLDatabase();
        OrderProcessor processor = new OrderProcessor(db);

        assertDoesNotThrow(processor::processOrder);
    }

    @Test
    void shouldSaveOrderOnProcess() {
        FakeDatabase db = new FakeDatabase();
        OrderProcessor processor = new OrderProcessor(db);

        processor.processOrder();

        assertTrue(db.saved);
    }
}