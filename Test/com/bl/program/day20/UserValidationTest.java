package com.bl.program.day20;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserValidationTest {

    @Test
    void firstNameValidator() {
        assertEquals(true,  UserValidation.firstNameValidator());
    }

    @Test
    void lastNameValidator() {
        assertEquals(true,  UserValidation.lastNameValidator());
    }

    @Test
    void contactNumber() {
        assertEquals(true,  UserValidation.contactNumber());
    }

    @Test
    void paswwordValidator() {
        assertEquals(true,  UserValidation.paswwordValidator());
    }

    @Test
    void emailValidator() {
        assertEquals(true,  UserValidation.emailValidator());

    }

    @Test
    void parameterizedEmailValidator() {
        String [] email = {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com",
                "abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com.com"};
        for(String i: email)
            assertTrue(UserValidation.parameterizedEmailValidator(i));
    }
}