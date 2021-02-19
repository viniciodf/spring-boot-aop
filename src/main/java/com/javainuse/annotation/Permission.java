package com.javainuse.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Target({
        ElementType.TYPE, ElementType.METHOD
})
public @interface Permission {
    String value() default "";
    OperationEnum operation() default OperationEnum.NONE;
}
