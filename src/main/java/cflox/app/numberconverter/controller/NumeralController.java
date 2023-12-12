package cflox.app.numberconverter.controller;

import cflox.app.numberconverter.model.UserRequestDTO;
import cflox.app.numberconverter.model.UserResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api")
public interface NumeralController {
   @PostMapping("/convert")
   ResponseEntity<UserResponseDTO> convert(@RequestBody UserRequestDTO request);

}
