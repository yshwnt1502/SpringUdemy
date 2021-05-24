package com.yashwant.springmvcpractise.Validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD, ElementType.METHOD })
public @interface CourseCode {

	//define default couse code
	//define default error message
	//define default groups
	//define default payloads
	
	public String value() default "LUV";

	public String message() default "must start with LUV";
	
	public Class<?>[] groups() default {};
	
	public Class<? extends Payload>[] payload() default{};
	
	

}
