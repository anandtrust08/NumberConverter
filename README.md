# NumberConverter
Cflox Coding Challenge

# DECIMAL/BINARY to ROMAN Numeral Converter API

## Overview

This API provides a simple way to convert decimal or binary numbers to Roman numerals. The conversion is performed using a POST request with the specified input parameters.

## API Endpoint

- **URL:** http://localhost:8080/api/convert
- **Method:** POST
- **Content Type:** application/json

## Request

### Headers

- **Content Type:** application/json

### Sample Input for converting Decimal to Roman

```json
{
  "input": "24",
  "converterType": "DECIMAL_TO_ROMAN"
}
```

- **`input`**: The decimal number you want to convert to Roman numerals.
- **`converterType`**: Specify the conversion type as "DECIMAL_TO_ROMAN".

## Response

### Sample Output

```json
{
  "output": "XXIV"
}
```

- **`output`**: The Roman numeral equivalent of the provided decimal input.

## Example Usage

### cURL

```bash
curl -X POST \
  http://localhost:8080/api/convert \
  -H 'Content-Type: application/json' \
  -d '{
  "input": "24",
  "converterType": "DECIMAL_TO_ROMAN"
}'
```

### Sample Input for converting Binary to Roman

```json
{
  "input": "110",
  "converterType": "BINARY_TO_ROMAN"
}
```

- **`input`**: The binary number you want to convert to Roman numerals.
- **`converterType`**: Specify the conversion type as "BINARY_TO_ROMAN".

## Response

### Sample Output

```json
{
  "output": "VI"
}
```

- **`output`**: The Roman numeral equivalent of the provided binary input.

## Example Usage

### cURL

```bash
curl -X POST \
  http://localhost:8080/api/convert \
  -H 'Content-Type: application/json' \
  -d '{
  "input": "110",
  "converterType": "BINARY_TO_ROMAN"
}'
```

### NOTE: Above solution is only valid for integers until 3999

#### Tipp to add new conversion (like Roman Numerals to English)
Step1: create a new service implementation of ConverterService(NumeralToEnglishService)

Step2: Add a new conversion type in ConverterType enum.(ROMAN_TO_ENGLISH)

Step3: Update ServiceFactoryImpl.class to execute service implemented in _Step1_ on receiving ConverterType mentioned in _Step2_.

Step4: Implement logic (static method) to convert Roman Numeral to English in NumeralUtility class.
