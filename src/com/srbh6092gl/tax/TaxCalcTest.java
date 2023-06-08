package com.srbh6092gl.tax;
import static org.junit.jupiter.api.Assertions.*;

class TaxCalcTest {
    @org.junit.jupiter.api.Test
    public void calcTax() {
        assertEquals(9000.0, TaxCalc.calcTax(100000));
    }
}