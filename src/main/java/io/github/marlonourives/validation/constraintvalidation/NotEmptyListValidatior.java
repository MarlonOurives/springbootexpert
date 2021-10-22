package io.github.marlonourives.validation.constraintvalidation;


import io.github.marlonourives.validation.NotEmptyList;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.List;

public class NotEmptyListValidatior  implements ConstraintValidator<NotEmptyList, List> {


    @Override
    public void initialize(NotEmptyList constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(List value, ConstraintValidatorContext context) {
        return value != null && !value.isEmpty();
    }
}
