package com.contaazul.mars.handlers;

import com.contaazul.mars.exception.ControlNotAllowedException;
import com.contaazul.mars.exception.PositionNotAllowedException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by DiogoBorges on 30/05/2017.
 */
@ControllerAdvice
@RestController
public class PositionNotAllowedExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(PositionNotAllowedException.class)
    public String onError(PositionNotAllowedException exception) {
        return exception.getMessage();
    }

}
