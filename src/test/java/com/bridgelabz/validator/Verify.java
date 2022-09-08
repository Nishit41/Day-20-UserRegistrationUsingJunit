package com.bridgelabz.validator;
import java.util.regex.Pattern;
public class Verify {
     static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
     static  final String LAST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
     static final String EMAIL_ADDRESS_PATTERN ="[a-z]{1,}.[a-z]+@[a-z]+.[a-z]{2,3}(.[a-z]{2,})*$";

     boolean validateFirstName(String firstName){
        Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
        return pattern.matcher(firstName).matches();
    }
    public boolean validateLastName(String lastName) {
         Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
         return pattern.matcher(lastName).matches();
    }
    public boolean validateEmailAddress(String emailAddress){
         Pattern pattern = Pattern.compile(EMAIL_ADDRESS_PATTERN);
         return pattern.matcher(emailAddress).matches();
    }
    public boolean validPhoneNumber(String phoneNumber){
        Pattern pattern = Pattern.compile("^[+][0-9]{2}[ ][0-9]{1,10}$");
        return pattern.matcher(phoneNumber).matches();
    }


}
