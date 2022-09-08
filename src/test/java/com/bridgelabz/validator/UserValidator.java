package com.bridgelabz.validator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.xml.validation.Validator;

public class UserValidator {
    @Test
     void givenFirstName_WhwnProper_ShouldReturnTrue(){
        Verify verify = new Verify();
        boolean result = verify.validateFirstName("Nishit");
        Assertions.assertEquals(true,result);
    }
    @Test
    void givenLastName_WhwnNotProper_ShouldReturnFalse(){
        Verify verify = new Verify();
        boolean result = verify.validateFirstName("Nis");
        Assertions.assertEquals(false,result);
    }
    @Test
    void givenLastName_WhwnNotProper_ShouldReturnTrue(){
        Verify verify = new Verify();
        boolean result = verify.validateLastName("Ranjan");
        Assertions.assertEquals(true,result);
    }
    //       E.g. abc.xyz@bl.co.in\n" +
    //       Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in)\n" +
    //       with precise @ and . positions\n" +
    @Test
    void givenEmailAddress_WhenProper_ShouldReturnTrue(){
        Verify verify = new Verify();
        boolean result = verify.validateEmailAddress("abc.xyz@bl.co.in");
        Assertions.assertEquals(true,result);
    }

}
