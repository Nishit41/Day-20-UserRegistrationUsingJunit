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

}
