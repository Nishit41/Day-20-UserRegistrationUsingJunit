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
    void givenFirstName_WhwnNotProper_ShouldReturnFalse(){
        Verify verify = new Verify();
        boolean result = verify.validateFirstName("Nis");
        Assertions.assertEquals(false,result);
    }
    @Test
    void givenLastName_WhwnNotProper_ShouldReturnTrue(){
        Verify verify = new Verify();
        boolean result = verify.validateLastName("Mahato");
        Assertions.assertEquals(true,result);
    }


}
