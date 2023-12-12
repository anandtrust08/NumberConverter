package cflox.app.numberconverter.service;

import static cflox.app.numberconverter.model.ConverterType.BINARY_TO_ROMAN;
import static cflox.app.numberconverter.model.ConverterType.DECIMAL_TO_ROMAN;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ServiceFactoryImplTest {

    @Mock
    private BinaryToNumeralService binaryToNumeralService;

    @Mock
    private DecimalToNumeralService decimalToNumeralService;

    @InjectMocks
    private ServiceFactoryImpl serviceFactory;

    @Test
    void testGetServiceBinaryToNumeral() {
        ConverterService result = serviceFactory.getService(BINARY_TO_ROMAN);
        assertEquals(binaryToNumeralService, result);
    }

    @Test
    void testGetServiceDecimalToNumeral() {
        ConverterService result = serviceFactory.getService(DECIMAL_TO_ROMAN);
        assertEquals(decimalToNumeralService, result);
    }
}
