package cflox.app.numberconverter.controller;

import cflox.app.numberconverter.model.UserRequestDTO;
import cflox.app.numberconverter.model.UserResponseDTO;
import cflox.app.numberconverter.service.ConverterService;
import cflox.app.numberconverter.service.ServiceFactory;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class NumeralControllerImpl implements NumeralController {

    private final ServiceFactory serviceFactory;

    @Override
    public ResponseEntity<UserResponseDTO> convert(UserRequestDTO request) {
    ConverterService converterService = serviceFactory.getService(request.getConverterType());
    String result = converterService.convert(request.getInput());
    UserResponseDTO userResponseDTO = new UserResponseDTO();
    userResponseDTO.setOutput(result);
        return ResponseEntity.ok(userResponseDTO);
    }
}
