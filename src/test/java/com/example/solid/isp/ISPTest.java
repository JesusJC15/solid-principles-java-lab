package com.example.solid.isp;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

public class ISPTest {

    @Test
    void developerShouldWork() {
        Workable dev = new Developer();
        assertDoesNotThrow(dev::work);
    }

    @Test
    void humanWorkerShouldWorkAndEat() {
        HumanWorker worker = new HumanWorker();

        assertDoesNotThrow(worker::work);
        assertDoesNotThrow(worker::eat);
    }
}
