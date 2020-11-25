package com.junittest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class EmailValidator {
    private String email;
    private boolean expectedResult;
    private UserValidator userValidator;

    public EmailValidator(String email, boolean expectedResult){
        super();
        this.email=email;
        this.expectedResult=expectedResult;
    }
    @Before
    public void initialize(){
        userValidator = new UserValidator();
    }
    @Parameterized.Parameters
    public static Collection input(){
          return Arrays.asList( new Object[][] {{"abc.100@yahoo.com",true},
                                                  {"abc-100@abc.net",true},
                                                  {"abc.100@abc.com.au",true},
                                                  {"abc@1.com",true},
                                                  {"abc@gmail.com.com",true},
                                                  {"abc+100@gmail.com",true},
                                                  {"abc-",false},
                                                  {"abc@.com",false},
                                                  {"abc@123gmail.a",false},
                                                  {"abc123@.com",false},
                                                  {"abc123@.com.com",false},
                                                  {".abc@abc.com",false},
                                                  {"abc()*@gmail.com",false},
                                                  {"abc@%*.com.com",false},
                                                  {"abc@abc@gmail.com",false},
                                                  {"abc@gmail.com.1a",false},
                                                  {"abc@gmail.com.aa.au",false}});

    }
    @Test
    public void testEmail(){
        Assert.assertEquals(expectedResult,userValidator.validateEmail(email));

    }

}
