package cflox.app.numberconverter.controller;

import cflox.app.numberconverter.service.NumeralService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class NumeralController {
    private NumeralService numeralService;

    @GetMapping("/{decimal}")
    public String convertDecimalToRoman(@PathVariable int decimal){
        return "";
    }
}
