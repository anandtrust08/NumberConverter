package cflox.app.numberconverter.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BinaryToNumeralServiceTest {

    private final ConverterService binaryService = new BinaryToNumeralService();

    @Test
    void testCovert() {
        String result = binaryService.convert("12");

        assertEquals("binary", result);
    }

}
