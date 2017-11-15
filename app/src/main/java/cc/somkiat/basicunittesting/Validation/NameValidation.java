package cc.somkiat.basicunittesting.Validation;

import java.util.ArrayList;
import java.util.List;

import cc.somkiat.basicunittesting.Exception.NameException;
import cc.somkiat.basicunittesting.RegisterRule;
import cc.somkiat.basicunittesting.Rule.NameEmptyRule;
import cc.somkiat.basicunittesting.Rule.NameOverLength;

/**
 * Created by student on 11/10/2017 AD.
 */

public class NameValidation {


    public int validate(String name){
        return 1;
    }
    public boolean register(String  name) throws NameException {
        List<RegisterRule> registerRules = new ArrayList<RegisterRule>();
        registerRules.add(new NameOverLength());
        registerRules.add(new NameEmptyRule());
        for (RegisterRule registerRule : registerRules) {
            registerRule.validate(name);
        }
        return true;
    }
}
