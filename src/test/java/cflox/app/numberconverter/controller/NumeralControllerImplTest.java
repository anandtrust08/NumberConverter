package cflox.app.numberconverter.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import cflox.app.numberconverter.model.ConverterType;
import cflox.app.numberconverter.model.UserRequestDTO;
import cflox.app.numberconverter.model.UserResponseDTO;
import cflox.app.numberconverter.service.DecimalToNumeralService;
import cflox.app.numberconverter.service.ServiceFactory;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class NumeralControllerImplTest {

     @Mock
    private ServiceFactory serviceFactory;
    @InjectMocks
    private NumeralControllerImpl numeralController;

    @Test
    void testCallService() {
        UserRequestDTO request = new UserRequestDTO();
        request.setInput("19");
        request.setConverterType(ConverterType.DECIMAL_TO_ROMAN);

       when(serviceFactory.getService(ConverterType.DECIMAL_TO_ROMAN)).thenReturn(new DecimalToNumeralService());

        UserResponseDTO result = numeralController.convert(request).getBody();

        assert result != null;
        assertEquals("XIX", result.getOutput());
    }
}
