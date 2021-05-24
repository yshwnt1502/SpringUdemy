package com.yashwant.springmvcpractise.Validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	private String coursePrefix;

	@Override
	public void initialize(CourseCode theCourseCode) {
		coursePrefix = theCourseCode.value();
	}

	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theContraintValidator) {
		// TODO Auto-generated method stub

		return (theCode != null ? theCode.startsWith(coursePrefix) : true);
	}

}
