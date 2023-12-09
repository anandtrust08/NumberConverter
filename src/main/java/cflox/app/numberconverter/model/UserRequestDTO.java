package cflox.app.numberconverter.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequestDTO {
    private String input;
    private ConverterType converterType;
}
