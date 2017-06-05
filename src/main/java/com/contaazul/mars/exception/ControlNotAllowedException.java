package com.contaazul.mars.exception;

/**
 * Created by DiogoBorges on 30/05/2017.
 */
public class ControlNotAllowedException extends RuntimeException {
    public ControlNotAllowedException(char control) {
        super("This control is not supported: " + control);
    }
}
