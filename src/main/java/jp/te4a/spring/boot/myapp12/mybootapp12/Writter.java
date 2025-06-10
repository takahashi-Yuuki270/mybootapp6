package jp.te4a.spring.boot.myapp12.mybootapp12;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = WritterValidator.class)
@Target({ ElementType.FIELD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
public @interface Writter {
    String ok();
    String message() default "指定された名前以外は入力できません。";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
