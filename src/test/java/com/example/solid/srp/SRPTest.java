package com.example.solid.srp;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
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

    @Test
    void shouldPrintInvoiceWithTotal() {
        Invoice invoice = new Invoice("Juan", 100);
        InvoiceCalculator calculator = new InvoiceCalculator();
        InvoicePrinter printer = new InvoicePrinter();

        double total = calculator.calculateTotal(invoice);
        String printed = printer.print(invoice, calculator);

        assertEquals("Factura para: " + invoice.getCustomer() + "\nTotal: " + total, printed);
    }

    @Test
    void shouldSaveInvoice() {
        Invoice invoice = new Invoice("Juan", 100);
        InvoiceRepository repository = new InvoiceRepository();

        assertDoesNotThrow(() -> repository.save(invoice));
    }
}
