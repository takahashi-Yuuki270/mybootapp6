package jp.te4a.spring.boot.myapp12.mybootapp12;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class WritterValidator implements ConstraintValidator<Writter, String> {

    private String ok;

    @Override
    public void initialize(Writter annotation) {
        this.ok = annotation.ok();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null) {
            return true; 
        }
        return value.equals(ok);
    }
}

