package jp.te4a.spring.boot.myapp12.mybootapp12;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;



@Documented
@Constraint(validatedBy = TestValidator.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)

public @interface TestValid {
    String param();
    String message() default  "input other than  {param}.";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default{};
}
