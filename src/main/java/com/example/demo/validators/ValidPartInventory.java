package com.example.demo.validators;

import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Constraint(validateBy = {PartInventoryValidator.class})
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidPartInventory {
    String message() default "Inventory cannot exceed maximum number of parts";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
