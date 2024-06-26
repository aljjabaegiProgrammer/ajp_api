package com.aljjabaegi.api.common.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Dynamic Request 필수 파라미터 처리를 위한 Custom annotation<br />
 * essentialFields 에 필수 파라미터 명을 입력한다.<br />
 * RequestBody @DynamicValid(essentialFields = {"memberId"})
 *
 * @author GEONLEE
 * @since 2024-06-26
 */
@Constraint(validatedBy = DynamicValidator.class)
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface DynamicValid {
    String[] essentialFields() default "";

    String message() default "";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
