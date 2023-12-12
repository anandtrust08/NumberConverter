package cflox.app.numberconverter.util;


public class DecimalToRoman {
    private DecimalToRoman(){}
    public static String decimalToRoman(int number) {
        if (number < 1 || number > 3999) {
            throw new IllegalArgumentException("Number must be between 1 and 3999");
        }
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < RomanNumeral.values().length; i++) {
            while (number >= RomanNumeral.values()[i].getValue() ) {
                result.append(RomanNumeral.values()[i].name());
                number -= RomanNumeral.values()[i].getValue();
            }
        }
        return result.toString();
    }
}
