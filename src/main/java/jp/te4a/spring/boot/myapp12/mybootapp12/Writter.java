package jp.te4a.spring.boot.myapp12.mybootapp12;

import jakarta.validation.Payload;

public @interface Writter {
    String ok() default "東北タロウ";
    String message() default "Input:  ";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}