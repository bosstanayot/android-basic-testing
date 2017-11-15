package cc.somkiat.basicunittesting;


import org.junit.Test;

import cc.somkiat.basicunittesting.Exception.NameException;
import cc.somkiat.basicunittesting.Validation.EmailValidation;

import static junit.framework.Assert.assertSame;
import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertFalse;

public class EmailValidationFailTest {

    @Test(expected = NameException.class)
    public void EmainNotInPat()throws NameException{
        EmailValidation emailValidation = new EmailValidation();
        emailValidation.register("vvvvvv");
    }
    @Test(expected = NameException.class)
    public void EmainNotInPattern()throws Exception{
        EmailValidation emailValidation = new EmailValidation();
        emailValidation.register("boss@kkk");
    }
    @Test(expected = NameException.class)
    public void EmailIsEmpty()throws Exception{
        EmailValidation emailValidation = new EmailValidation();
        emailValidation.register("");
    }
    @Test
    public void EmailIsPattern() throws NameException {
        EmailValidation emailValidation = new EmailValidation();
        assertTrue(emailValidation.register("boss10520@hotmail.com"));
    }
}
