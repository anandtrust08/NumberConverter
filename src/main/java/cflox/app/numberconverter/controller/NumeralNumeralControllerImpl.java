package cflox.app.numberconverter.controller;

import cflox.app.numberconverter.model.UserRequest;
import cflox.app.numberconverter.model.UserResponse;
import cflox.app.numberconverter.service.ConverterService;
import cflox.app.numberconverter.service.ServiceFactory;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class NumeralNumeralControllerImpl implements NumeralController {

    private final ServiceFactory serviceFactory;

    @Override
    public ResponseEntity<UserResponse> convert(UserRequest request) {
    ConverterService converterService = serviceFactory.getService(request.getConverterType());
    String result = converterService.convert(request.getInput());
    UserResponse userResponse = new UserResponse();
    userResponse.setOutput(result);
        return ResponseEntity.ok(userResponse);
    }
}
