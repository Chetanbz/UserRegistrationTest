package com.junittest;


interface  validate<String >{
        boolean checkResult(String a, String b);
        }

public class UserValidator {
    validate<String> input = (n,m)-> n.matches(m);

    public String validateFirstName(String inputFirstName) throws UserRegistrationsException {
        String inputPattern = "[A-Z]{1}[a-zA-Z]{2,}";
        try {
            if (input.checkResult(inputFirstName,inputPattern)) {
                return "True";
            }
            else if (inputFirstName.length() <3){
                throw new UserRegistrationsException(UserRegistrationsException.ExceptionType.ENTERED_SHORT,"No Match found");
            }
            else {
                throw new UserRegistrationsException(UserRegistrationsException.ExceptionType.ENTERED_NOT_MATCH,"No Match found");
            }
        } finally {  // if null pointer exception ocured throw below exception with message

        }
    }

    public String validateLastName(String inputLastName) throws UserRegistrationsException {
        String inputPattern = "[A-Z]{1}[a-zA-Z]{2,}";
        try {
            if (input.checkResult(inputLastName,inputPattern)) {
                return "True";
            }
            else if (inputLastName.length() <3){
                throw new UserRegistrationsException(UserRegistrationsException.ExceptionType.ENTERED_SHORT,"No Match found");
            }
            else {
                throw new UserRegistrationsException(UserRegistrationsException.ExceptionType.ENTERED_NOT_MATCH,"No Match found");
            }
        } finally {  // if null pointer exception ocured throw below exception with message

        }
    }


    public String validateEmail(String inputEmail) throws UserRegistrationsException {
        String inputPattern = "^[a-zA-Z]+([._+-]{0,1}[a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}+(?:\\.[a-z]{2,}){0,1}$";
        try {
            if (input.checkResult(inputEmail,inputPattern)) {
                return "True";
            }
            else if (inputEmail.length() <3){
                throw new UserRegistrationsException(UserRegistrationsException.ExceptionType.ENTERED_SHORT,"No Match found");
            }
            else {
                throw new UserRegistrationsException(UserRegistrationsException.ExceptionType.ENTERED_NOT_MATCH,"No Match found");
            }
        } finally {  // if null pointer exception ocured throw below exception with message

        }
    }

    public String validateMobile(String inputMobile) throws UserRegistrationsException {
        String inputPattern = "([0-9]{2})[ ][7-9][0-9]{9}";
        try {
            if (input.checkResult(inputMobile,inputPattern)) {
                return "True";
            }
            else if (inputMobile.length() <10){
                throw new UserRegistrationsException(UserRegistrationsException.ExceptionType.ENTERED_SHORT,"No Match found");
            }
            else {
                throw new UserRegistrationsException(UserRegistrationsException.ExceptionType.ENTERED_NOT_MATCH,"No Match found");
            }
        } finally {  // if null pointer exception ocured throw below exception with message

        }
    }

    public String validatePassword(String inputPassword) throws UserRegistrationsException {
        String inputPattern = "(?=.*[@*&^%#-*+!])(?=.*[0-9])(?=.*[A-Z])(.{6,})";
        try {
            if (input.checkResult(inputPassword,inputPattern)) {
                return "True";
            }
            else if (inputPassword.length() <8){
                throw new UserRegistrationsException(UserRegistrationsException.ExceptionType.ENTERED_SHORT,"No Match found");
            }
            else {
                throw new UserRegistrationsException(UserRegistrationsException.ExceptionType.ENTERED_NOT_MATCH,"No Match found");
            }
        } finally {  // if null pointer exception ocured throw below exception with message

        }
    }

}




