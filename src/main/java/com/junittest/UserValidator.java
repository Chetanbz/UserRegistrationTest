package com.junittest;

public class UserValidator {


    public boolean validateFirstName(String inputFirstName){
        String inputPattern = "[A-Z]{1}[a-zA-Z]{2,}";
        boolean result = inputFirstName.matches(inputPattern);
        return result;
    }
    public boolean validateLastName(String inputLastName){
        String inputPattern = "[A-Z]{1}[a-zA-Z]{2,}";
        boolean result = inputLastName.matches(inputPattern);
        return result;
    }
    public boolean validateEmail(String inputEmailName){
        String inputPattern = "^[a-zA-Z]+([._+-]{0,1}[a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}+(?:\\.[a-z]{2,}){0,1}$";
        boolean result  = inputEmailName.matches(inputPattern);
        return  result;

    }
    public boolean validateMobile(String inputMobile){
        String inputPattern = "([0-9]{2})[ ][7-9][0-9]{9}";
        boolean result = inputMobile.matches(inputPattern);
        return  result;
    }
    public  boolean validatePassword(String inputPassword){
        String inputPattern = "(?=.*[@*&^%#-*+!])(?=.*[0-9])(?=.*[A-Z])(.{6,})";
        boolean result = inputPassword.matches(inputPattern);
        return result;
    }

}
