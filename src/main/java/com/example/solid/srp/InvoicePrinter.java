package com.example.solid.srp;

public class InvoicePrinter {
    public String print(Invoice invoice, InvoiceCalculator calculator) {
        return "Factura para: " + invoice.getCustomer() +
                "\nTotal: " + calculator.calculateTotal(invoice);
    }
}
