package com.bridgelabz.validator;

public class UserValidatorException extends Exception{
    UserValidatorException(){
        super("give valid input");
    }
    UserValidatorException(String message){
        super(message);
    }
}
