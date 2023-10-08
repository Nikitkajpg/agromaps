package com.td.agromaps.util;

import com.td.agromaps.models.Field;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class FieldValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Field.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Field field = (Field) target;
    }
}
