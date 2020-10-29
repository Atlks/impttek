package com.attilax.util;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;

@Documented @Inherited
public @interface utf8编码 {
	String param1() default "";
	int param12() default 0;
}