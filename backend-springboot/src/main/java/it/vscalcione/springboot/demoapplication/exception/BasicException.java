package it.vscalcione.springboot.demoapplication.exception;

public class BasicException extends RuntimeException {

    public BasicException(String exceptionMessage) {
        super(exceptionMessage);
    }
}
