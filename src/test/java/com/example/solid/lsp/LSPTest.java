package com.example.solid.lsp;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

public class LSPTest {

    @Test
    void electricCarShouldDrive() {
        Drivable car = new ElectricCar();
        assertDoesNotThrow(car::drive);
    }
}