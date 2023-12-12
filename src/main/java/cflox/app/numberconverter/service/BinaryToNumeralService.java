package cflox.app.numberconverter.service;

import cflox.app.numberconverter.util.NumeralUtility;
import org.springframework.stereotype.Service;

@Service
public class BinaryToNumeralService implements ConverterService {
    @Override
    public String convert(String binary) {
        return NumeralUtility.binaryToRoman(binary);
    }
}
