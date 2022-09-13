package com.bridgelabz.validator;

import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runners.Parameterized;

import javax.xml.validation.Validator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserValidator {


    @Test
     void givenFirstName_WhenProper_ShouldReturnTrue()throws UserValidatorException {
        Verify verify = new Verify();
        boolean result = verify.validateFirstName("867868");
        if (result == true) {
            System.out.println("ValidName");
        }
        else {
            throw new UserValidatorException();
        }
    }

    @Test
    void givenLastName_WhenProper_ShouldReturnTrue() throws UserValidatorException{
        Verify verify = new Verify();
        boolean result = verify.validateLastName("Ranjan");
        if (result == true) {
            System.out.println("ValidName");
        }
        else {
            throw new UserValidatorException();
        }
    }
    //       E.g. abc.xyz@bl.co.in\n" +
    //       Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in)\n" +
    //       with precise @ and . positions\n" +
    @Test
    void givenEmailAddress_WhenProper_ShouldReturnTrue(String email) throws UserValidatorException{
        Verify verify = new Verify();
        boolean result = verify.validateEmailAddress(email);
        if (result == true) {
            System.out.println("ValidName");
        }
        else {
            throw new UserValidatorException();
        }
    }
    @Test
    void givenPhoneNumber_WhenProper_ShouldReturnTrue()throws UserValidatorException{
        Verify verify = new Verify();
        boolean result = verify.validPhoneNumber("+91 9304264509");
        if (result == true) {
            System.out.println("ValidName");
        }
        else {
            throw new UserValidatorException();
        }
    }
    @Test
    void givenPassword_WhenProper_ShouldReturnTrue()throws UserValidatorException{
        Verify verify = new Verify();
        boolean result = verify.validPassword("Ranjan@#2004");
        if (result == true) {
            System.out.println("ValidName");
        }
        else {
            throw new UserValidatorException();
        }
    }
}
