package cflox.app.numberconverter.controller;

import cflox.app.numberconverter.model.UserRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api")
public interface NumeralController {
   @PostMapping("/convert")
   ResponseEntity<String> convert(@RequestBody UserRequest request);

}
