package cflox.app.numberconverter.service;

import cflox.app.numberconverter.util.DecimalToRoman;
import org.springframework.stereotype.Service;

@Service
public class DecimalToNumeralService implements ConverterService {
    @Override
    public String convert(String decimal) {
        return DecimalToRoman.decimalToRoman(Integer.parseInt(decimal));
    }
}
