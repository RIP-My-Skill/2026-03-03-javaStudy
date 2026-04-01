package com.sist.anno;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
/*
 *     aaa()
 *     bbb()
 *     ccc()
 */
@Retention(RUNTIME)
@Target(METHOD)
public @interface RequestMapping {
	public String value(); // 구분자
}
