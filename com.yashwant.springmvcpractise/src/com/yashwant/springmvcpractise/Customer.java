package com.yashwant.springmvcpractise;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.yashwant.springmvcpractise.Validation.CourseCode;

public class Customer {

	@NotNull(message = " is required")
	@Size(min = 2)
	private String firstName;

	private String lastName;
	@NotNull(message = " is required")
	@Min(message = "Should be greater than or equal to 0", value = 0)
	@Max(message = "Should be less than or equal to 10", value = 10)
	private Integer freePasses;

	@Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 characters allowed")
	private String postalCode;

	@CourseCode(value="TOPS",message="must start with TOPS")
	private String courseCode;

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}

}
