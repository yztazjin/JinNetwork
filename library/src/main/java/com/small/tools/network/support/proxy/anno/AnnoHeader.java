package com.small.tools.network.support.proxy.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Author: hjq
 * Date  : 2018/10/06 23:07
 * Name  : AnnoHeaders
 * Intro : Edit By hjq
 * Version : 1.0
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface AnnoHeader {

    String value() default "";

}
