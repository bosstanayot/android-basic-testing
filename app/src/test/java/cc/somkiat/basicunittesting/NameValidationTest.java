package cc.somkiat.basicunittesting;


import org.junit.Test;

import cc.somkiat.basicunittesting.Exception.NameException;
import cc.somkiat.basicunittesting.Validation.NameValidation;

import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertFalse;

public class NameValidationTest {


    @Test(expected = NameException.class)
    public void NameNotLength()throws NameException{
        NameValidation nameValidator = new NameValidation();
        nameValidator.register("a");
    }
    @Test(expected = NameException.class)
    public void NameIsEmpty()throws Exception{
        NameValidation nameValidation = new NameValidation();
        nameValidation.register("");
    }
    @Test(expected = NameException.class)
    public void NameOverLength()throws Exception{
        NameValidation nameValidation = new NameValidation();
        nameValidation.register("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }
    @Test
    public void NameIsNotEmpty() throws NameException {
        NameValidation nameValidator = new NameValidation();
        assertTrue(nameValidator.register("boss"));
    }
}
