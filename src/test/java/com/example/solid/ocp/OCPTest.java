package com.example.solid.ocp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class OCPTest {

    @Test
    void shouldApplyVipDiscount() {
        DiscountCalculator calculator = new DiscountCalculator();
        double discount = calculator.calculateDiscount(new VipDiscount(), 100);

        assertEquals(20, discount);
    }

    @Test
    void shouldApplyRegularDiscount() {
        DiscountCalculator calculator = new DiscountCalculator();
        double discount = calculator.calculateDiscount(new RegularDiscount(), 100);

        assertEquals(10, discount);
    }
}