package com.contaazul.mars.exception;

/**
 * Created by DiogoBorges on 30/05/2017.
 */
public class PositionNotAllowedException extends RuntimeException {
    public PositionNotAllowedException(int position) {
        super("This position exceeds the allowed area: " + position);
    }
}
