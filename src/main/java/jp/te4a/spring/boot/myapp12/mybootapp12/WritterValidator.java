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
        if (!value.equals(ok)) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("入力された値: '" + value + "' は無効です。")
                   .addConstraintViolation();
            return false;
        }
        return true;
    }
}
