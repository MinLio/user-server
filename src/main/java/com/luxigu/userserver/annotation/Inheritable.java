package com.luxigu.userserver.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <annotation>@Inherited</annotation>标注的注解具有继承性
 * 如果父类被<annotation>@Inheritable</annotation>标注，则子类也会继承该注解，即被该注解标注
 * @author liqf
 *
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
public @interface Inheritable {

}
