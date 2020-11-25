package com.junittest;

import org.junit.Assert;
import org.junit.Test;

public class UserValidatorTest {
    //First Name check test
    @Test
    public void givenFirstName_WhenProper_ShouldReturnRTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("Chetan");
        Assert.assertTrue(result);
    }
    @Test
    public void givenFirstName_WhenShort_ShouldReturnRFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("No");
        Assert.assertFalse(result);
    }
    @Test
    public void givenFirstName_WhenSpecialCharacter_ShouldReturnRFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("Chetan@");
        Assert.assertFalse(result);
    }
    // Last Name Check Test
    @Test
    public void givenLastName_WhenProper_ShouldReturnRTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateLastName("Chetan");
        Assert.assertTrue(result);
    }
    @Test
    public void givenLastName_WhenShort_ShouldReturnRFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateLastName("No");
        Assert.assertFalse(result);
    }
    @Test
    public void givenLasttName_WhenSpecialCharacter_ShouldReturnRFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateLastName("Chetan@");
        Assert.assertFalse(result);
    }
    //Email Test check
    @Test
    public void givenEmail_WhenProper_ShouldReturnRTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateEmail("Chetan123@gmail.com");
        Assert.assertTrue(result);
    }
    @Test
    public void givenEmail_WhenSecondPartMissing_ShouldReturnRFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateEmail("Chetan123@.com.co");
        Assert.assertFalse(result);
    }
    @Test
    public void givenEmail_WhenLastPartMissing_ShouldReturnRFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateEmail("Che.tan@gmail.");
        Assert.assertFalse(result);
    }
    //Mobile Test Check
    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnRTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateMobile("91 9637074619");
        Assert.assertTrue(result);
    }
    @Test
    public void givenMobileNumber_WhenNotExactTenDigit_ShouldReturnRFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateMobile("91 963707461");
        Assert.assertFalse(result);
    }
    @Test
    public void givenFirstName_WhenNoSpace_ShouldReturnRFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("919637074619");
        Assert.assertFalse(result);
    }


}
