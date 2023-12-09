package cflox.app.numberconverter.controller;

import cflox.app.numberconverter.model.UserRequest;
import cflox.app.numberconverter.model.UserResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api")
public interface NumeralController {
   @PostMapping("/convert")
   ResponseEntity<UserResponse> convert(@RequestBody UserRequest request);

}
