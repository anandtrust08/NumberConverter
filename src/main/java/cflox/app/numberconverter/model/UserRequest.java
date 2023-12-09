package cflox.app.numberconverter.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequest {
    private String input;
    private ConverterType converterType;
}
