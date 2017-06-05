package com.contaazul.mars.handlers;

import com.contaazul.mars.exception.ControlNotAllowedException;
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
public class ControlNotAllowedExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(ControlNotAllowedException.class)
    public String onError(ControlNotAllowedException exception) {
        return exception.getMessage();
    }

}
