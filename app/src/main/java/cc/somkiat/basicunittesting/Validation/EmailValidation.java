package cc.somkiat.basicunittesting.Validation;

import java.util.ArrayList;
import java.util.List;

import cc.somkiat.basicunittesting.Exception.NameException;
import cc.somkiat.basicunittesting.RegisterRule;
import cc.somkiat.basicunittesting.Rule.EmailEmptyRule;
import cc.somkiat.basicunittesting.Rule.EmailPatternRule;

/**
 * Created by CPCust on 15/11/2560.
 */

public class EmailValidation {
    public int validate(String email){
        return 1;
    }
    public boolean register(String email) throws NameException {
        List<RegisterRule> registerRules = new ArrayList<RegisterRule>();
        registerRules.add(new EmailPatternRule());
        registerRules.add(new EmailEmptyRule());
        for (RegisterRule registerRule : registerRules) {
            registerRule.validate(email);
        }
        return true;
    }

}
