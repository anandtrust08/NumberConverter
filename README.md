# NumberConverter
Cflox Coding Challenge

# DECIMAL to ROMAN Numeral Converter API

## Overview

This API provides a simple way to convert decimal numbers to Roman numerals. The conversion is performed using a POST request with the specified input parameters.

## API Endpoint

- **URL:** http://localhost:8080/api/convert
- **Method:** POST
- **Content Type:** application/json

## Request

### Headers

- **Content Type:** application/json

### Sample Input

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
