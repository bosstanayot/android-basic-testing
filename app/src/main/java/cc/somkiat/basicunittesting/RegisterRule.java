package cc.somkiat.basicunittesting;

import cc.somkiat.basicunittesting.Exception.NameException;

/**
 * Created by CPCust on 15/11/2560.
 */
public interface RegisterRule {
    void validate(String name) throws NameException;
}