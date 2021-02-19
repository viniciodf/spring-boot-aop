package com.javainuse.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Target({
        ElementType.TYPE, ElementType.METHOD
})
public @interface Operation {
    OperationEnum value();
}
