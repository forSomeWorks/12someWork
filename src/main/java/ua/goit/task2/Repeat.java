package ua.goit.task2;

import java.lang.annotation.*;

@Retention(value = RetentionPolicy.RUNTIME)

public @interface Repeat {
    int count() default 1;
}
