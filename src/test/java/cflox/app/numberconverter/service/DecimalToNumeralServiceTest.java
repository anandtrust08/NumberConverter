package cflox.app.numberconverter.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DecimalToNumeralServiceTest {

    private final ConverterService decimalService = new DecimalToNumeralService();

    @Test
    void testCovert() {
        String result = decimalService.convert("12");

        assertEquals("XII", result);
    }

}
