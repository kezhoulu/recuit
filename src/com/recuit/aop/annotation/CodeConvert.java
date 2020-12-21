package com.recuit.aop.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Retention(RUNTIME)
@Target(ElementType.FIELD)
public @interface CodeConvert {
    /**
     * 注解的id
     * @return
     */
    String pid() ;
}
