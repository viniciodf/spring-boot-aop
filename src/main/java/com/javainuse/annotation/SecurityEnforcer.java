package com.javainuse.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({
        ElementType.TYPE
})
public @interface SecurityEnforcer {
}
