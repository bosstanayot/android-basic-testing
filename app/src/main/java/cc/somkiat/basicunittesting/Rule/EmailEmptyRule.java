package cc.somkiat.basicunittesting.Rule;

import cc.somkiat.basicunittesting.Exception.NameException;
import cc.somkiat.basicunittesting.RegisterRule;

/**
 * Created by CPCust on 15/11/2560.
 */

public class EmailEmptyRule implements RegisterRule {
    public void validate(String email) throws NameException {
        if (email == null || email.trim().equals("")){
            throw new NameException("Email should not empty");
        }
    }
}
