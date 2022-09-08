package com.bridgelabz.validator;
import java.util.regex.Pattern;
public class Verify {
     static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
     static  final String LAST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
     boolean validateFirstName(String firstName){
        Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
        return pattern.matcher(firstName).matches();
    }
    public boolean validateLastName(String lastName) {
         Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
         return pattern.matcher(lastName).matches();
    }
}
