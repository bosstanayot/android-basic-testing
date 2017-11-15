package cc.somkiat.basicunittesting.Rule;

import java.util.regex.Pattern;

import cc.somkiat.basicunittesting.Exception.NameException;
import cc.somkiat.basicunittesting.RegisterRule;

/**
 * Created by CPCust on 15/11/2560.
 */

public class EmailPatternRule implements RegisterRule {
    public void validate(String email) throws NameException {
        String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern validEmailPattern = Pattern.compile(EMAIL_PATTERN);
        if (!validEmailPattern.matcher(email).matches()) {
            throw new NameException("Email should not empty");
        }
    }
}