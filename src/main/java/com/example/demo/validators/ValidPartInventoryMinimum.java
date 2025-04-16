package com.example.demo.validators;

import javax.validation.Constraint;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Payload;
import java.lang.annotation.RetentionPolicy;

@Constraint(validatedBy = {PartInventoryMinimumValidator.class})
@Target({ElementType.Type})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidPartInventoryMinimum {
    String message() default "Inventory cannt be lower than the minimum";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
