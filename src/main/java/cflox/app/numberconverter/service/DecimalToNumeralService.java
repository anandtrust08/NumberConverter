package cflox.app.numberconverter.service;

import org.springframework.stereotype.Service;

@Service
public class DecimalToNumeralService implements ConverterService {
    @Override
    public String convert(String decimal) {
        return "decimal";
    }
}
