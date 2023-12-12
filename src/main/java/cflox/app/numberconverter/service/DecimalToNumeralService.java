package cflox.app.numberconverter.service;

import cflox.app.numberconverter.util.NumeralUtility;
import org.springframework.stereotype.Service;

@Service
public class DecimalToNumeralService implements ConverterService {
    @Override
    public String convert(String decimal) {
        return NumeralUtility.decimalToRoman(Integer.parseInt(decimal));
    }
}
