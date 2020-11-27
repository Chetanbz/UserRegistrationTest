package com.junittest;

import org.junit.Assert;
import org.junit.Test;

public class UserValidatorTest {
    //First Name check test
    @Test
    public void givenFirstName_WhenProper_ShouldReturnRTrue() {
        UserValidator validator = new UserValidator();
        try {
            String result = validator.validateFirstName("Chetan");
            Assert.assertEquals("True",result);
        } catch (UserRegistrationsException e) {
        }
    }
    @Test
    public void givenFirstName_WhenShort_ShouldReturnShort() {
        UserValidator validator = new UserValidator();
        try {
            String result = validator.validateFirstName("No");
        } catch (UserRegistrationsException e) {
            Assert.assertEquals(UserRegistrationsException.ExceptionType.ENTERED_SHORT,e.type);

        }
    }
    @Test
    public void givenFirstName_WhenSpecialCharacter_ShouldReturnNotMatch() {
        UserValidator validator = new UserValidator();
        try {
            String result = validator.validateFirstName("Chetan@");
        } catch (UserRegistrationsException e) {
            Assert.assertEquals(UserRegistrationsException.ExceptionType.ENTERED_NOT_MATCH,e.type);
        }
    }
    /// Last Name Check
    @Test
    public void givenLastName_WhenProper_ShouldReturnRTrue() {
        UserValidator validator = new UserValidator();
        try {
            String result = validator.validateLastName("Chetan");
            Assert.assertEquals("True",result);
        } catch (UserRegistrationsException e) {
        }
    }
    @Test
    public void givenLastName_WhenShort_ShouldReturnShort() {
        UserValidator validator = new UserValidator();
        try {
            String result = validator.validateLastName("No");
        } catch (UserRegistrationsException e) {
            Assert.assertEquals(UserRegistrationsException.ExceptionType.ENTERED_SHORT,e.type);

        }
    }
    @Test
    public void givenLastName_WhenSpecialCharacter_ShouldReturnNotMatch() {
        UserValidator validator = new UserValidator();
        try {
            String result = validator.validateLastName("Chetan@");
        } catch (UserRegistrationsException e) {
            Assert.assertEquals(UserRegistrationsException.ExceptionType.ENTERED_NOT_MATCH,e.type);
        }
    }
    /// Email Check
    @Test
    public void givenEmail_WhenProper_ShouldReturnRTrue() {
        UserValidator validator = new UserValidator();
        try {
            String result = validator.validateEmail("Chetan@gmail.com");
            Assert.assertEquals("True",result);
        } catch (UserRegistrationsException e) {
        }
    }
    @Test
    public void givenEmail_WhenShort_ShouldReturnShort() {
        UserValidator validator = new UserValidator();
        try {
            String result = validator.validateEmail("No");
        } catch (UserRegistrationsException e) {
            Assert.assertEquals(UserRegistrationsException.ExceptionType.ENTERED_SHORT,e.type);

        }
    }
    @Test
    public void givenEmail_WhenNotMatch_ShouldReturnNotMatch() {
        UserValidator validator = new UserValidator();
        try {
            String result = validator.validateEmail("Chetan@.com");
        } catch (UserRegistrationsException e) {
            Assert.assertEquals(UserRegistrationsException.ExceptionType.ENTERED_NOT_MATCH,e.type);
        }
    }
    // Mobile Check
    @Test
    public void givenMobile_WhenProper_ShouldReturnRTrue() {
        UserValidator validator = new UserValidator();
        try {
            String result = validator.validateMobile("91 967074619");
            Assert.assertEquals("True",result);
        } catch (UserRegistrationsException e) {
        }
    }
    @Test
    public void givenMobile_WhenShort_ShouldReturnShort() {
        UserValidator validator = new UserValidator();
        try {
            String result = validator.validateMobile("936");
        } catch (UserRegistrationsException e) {
            Assert.assertEquals(UserRegistrationsException.ExceptionType.ENTERED_SHORT,e.type);

        }
    }
    @Test
    public void givenMobile_WhenNotMatch_ShouldReturnNotMatch() {
        UserValidator validator = new UserValidator();
        try {
            String result = validator.validateMobile("96e37074619");
        } catch (UserRegistrationsException e) {
            Assert.assertEquals(UserRegistrationsException.ExceptionType.ENTERED_NOT_MATCH,e.type);
        }
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnRTrue() {
        UserValidator validator = new UserValidator();
        try {
            String result = validator.validatePassword("Chetan123@");
            Assert.assertEquals("True",result);
        } catch (UserRegistrationsException e) {
        }
    }
    @Test
    public void givenPassword_WhenShort_ShouldReturnShort() {
        UserValidator validator = new UserValidator();
        try {
            String result = validator.validatePassword("ch");
        } catch (UserRegistrationsException e) {
            Assert.assertEquals(UserRegistrationsException.ExceptionType.ENTERED_SHORT,e.type);

        }
    }
    @Test
    public void givenMPassword_WhenNotMatch_ShouldReturnNotMatch() {
        UserValidator validator = new UserValidator();
        try {
            String result = validator.validatePassword("Chetansddfg");
        } catch (UserRegistrationsException e) {
            Assert.assertEquals(UserRegistrationsException.ExceptionType.ENTERED_NOT_MATCH,e.type);
        }
    }




    // Last Name Check Test
    /*
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
    public void givenMobile_WhenNoSpace_ShouldReturnRFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateMobile("919637074619");
        Assert.assertFalse(result);
    }
    //For Password Test
    @Test
    public void givenPassword_WhenProper_ShouldReturnRTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validatePassword("Chetan@1234");
        Assert.assertTrue(result);
    }
    @Test
    public void givenPassword_WhenLessThanEight_ShouldReturnRFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validatePassword("Chetan@");
        Assert.assertFalse(result);
    }
    @Test
    public void givenPassword_WhenNoSpecialChar_ShouldReturnRFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validatePassword("Chetanzambare");
        Assert.assertFalse(result);
    }

*/

}
