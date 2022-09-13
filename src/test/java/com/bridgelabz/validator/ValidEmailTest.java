package com.bridgelabz.validator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ValidEmailTest {
    private final String email;
    private final boolean expectedResult;
    private Verify read;

    public ValidEmailTest(String email, boolean expectedResult) {
        this.email = email;
        this.expectedResult = expectedResult;
    }

    @Before
    public void init() {
        read = new Verify();
    }

    @Parameterized.Parameters
    public static Collection emailInput() {
        return Arrays
                .asList(new Object[][] { { "nishi@@yahoo.com",false},{"abc@yahoo.com",true},{"abc-100@yahoo.com",true},{"abc.100@yahoo.com",true},
                                {"abc111@abc.com",true},{"abc-100@abc.net",true},{"abc",false},{"abc@.com.my",false},{"abc123@gmail.a",false},{"abc123@.com",false},{"abc123@.com.com",false},{".abc@abc.com",false},{"abc()*@gmail.com",false},{"abc@%*.com",false}});
    }
    @Test
    public void testEmail()  {
         Assertions.assertEquals(expectedResult, read.validateEmailAddress(email));
    }

}
