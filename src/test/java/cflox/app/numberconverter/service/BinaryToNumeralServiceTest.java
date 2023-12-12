package cflox.app.numberconverter.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class BinaryToNumeralServiceTest {

    private final ConverterService binaryService = new BinaryToNumeralService();

    @Test
    void testCovert() {
        String result = binaryService.convert("110");

        assertEquals("VI", result);
    }

    @Test
    void testCovertErrorCase() {
        assertThrows(NumberFormatException.class,() -> binaryService.convert("210"));
    }
}
