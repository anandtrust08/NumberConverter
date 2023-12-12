package cflox.app.numberconverter.service;

import cflox.app.numberconverter.model.ConverterType;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ServiceFactoryImpl implements ServiceFactory{
    private final BinaryToNumeralService binaryToNumeralService;
    private final DecimalToNumeralService decimalToNumeralService;
    @Override
    public ConverterService getService(ConverterType converterType) {
      return   switch (converterType){
            case BINARY_TO_ROMAN -> binaryToNumeralService;
            case DECIMAL_TO_ROMAN -> decimalToNumeralService;
            default -> throw new IllegalArgumentException("Unsupported CoverterType: "+ converterType);
        };

    }
}
