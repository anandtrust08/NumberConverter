package cflox.app.numberconverter.service;

import org.springframework.stereotype.Service;

@Service
public class BinaryToNumeralService implements ConverterService {
    @Override
    public String convert(String binary) {
        return "binary";
    }
}
