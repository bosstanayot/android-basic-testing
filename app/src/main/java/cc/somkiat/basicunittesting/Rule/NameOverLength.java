package cc.somkiat.basicunittesting.Rule;

import cc.somkiat.basicunittesting.Exception.NameException;
import cc.somkiat.basicunittesting.RegisterRule;

/**
 * Created by CPCust on 15/11/2560.
 */

public class NameOverLength implements RegisterRule {
    public void validate(String name) throws NameException {
        if (name.length()< 2 || name.length()>20) {
            throw new NameException("Name should Length between 2-20");
        }
    }
}
