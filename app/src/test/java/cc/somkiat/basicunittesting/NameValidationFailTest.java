package cc.somkiat.basicunittesting;


import org.junit.Test;

import static junit.framework.TestCase.assertFalse;

public class NameValidationFailTest {

    @Test
    public void ชื่อเป็นค่าค่าง(){
        NameValidation validation = new NameValidation();
        boolean result = validation.isEmpty("");
        assertFalse("ต้องไม่ผ่านนะ เพราะว่ามันมีค่าว่าง",result);
    }
}
