package cc.somkiat.basicunittesting.Rule;

import cc.somkiat.basicunittesting.Exception.NameException;
import cc.somkiat.basicunittesting.RegisterRule;

/**
 * Created by CPCust on 15/11/2560.
 */

public class NameEmptyRule implements RegisterRule {
        public void validate(String name) throws NameException {
            if (name == null || name.trim().equals("")) {
                throw new NameException("Name should not empty");
            }
        }
}
