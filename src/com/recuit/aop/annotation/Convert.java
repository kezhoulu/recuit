package com.recuit.aop.annotation;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * aop切入点注解
 * @author huayu
 *
 */
@Documented
@Retention(RUNTIME)
@Target(ElementType.METHOD)
public @interface Convert {
	
}
