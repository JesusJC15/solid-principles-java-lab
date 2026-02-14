package com.example.solid.srp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SRPTest {

    @Test
    void shouldCalculateInvoiceCorrectly() {
        Invoice invoice = new Invoice("Juan", 100);
        InvoiceCalculator calculator = new InvoiceCalculator();

        double total = calculator.calculateTotal(invoice);

        assertEquals(121, total);
    }
}
