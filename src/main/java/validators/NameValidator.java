package validators;

import exceptions.ValidateException;
import exceptions.ValidateNameException;

public class NameValidator implements Validator {
    // допишите код класса

    @Override
    public void validate(String value) throws ValidateException {
        if (value == null || value.isEmpty()) {
            throw new ValidateNameException("Имя не должно быть пустым");
        }
    }
}