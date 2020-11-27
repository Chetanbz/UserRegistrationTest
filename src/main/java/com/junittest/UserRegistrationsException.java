package com.junittest;

public class UserRegistrationsException extends  Exception {

    ExceptionType type;

    enum ExceptionType {
        ENTERED_SHORT , ENTERED_NOT_MATCH, ;
    }

    public UserRegistrationsException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}